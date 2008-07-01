/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.JFileChooser;
import oracle.jdbc.OracleConnection;
import org.netbeans.modules.languages.pl_sql.editor.Utils;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.CompileCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.CompileLocalFileCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.DeleteCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.RefreshCookieInterface;
import org.openide.cookies.CloseCookie;
import org.openide.cookies.EditCookie;
import org.openide.cookies.LineCookie;
import org.openide.cookies.SaveCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.text.Line;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.windows.OutputEvent;
import org.openide.windows.OutputListener;
import org.openide.windows.WindowManager;

/**
 *
 * @author SUMsoft
 */
public class BaseClass implements EditCookie, CompileLocalFileCookieInterface,
        CompileCookieInterface, RefreshCookieInterface, DeleteCookieInterface {

    private String Owner = null,  ObjectName,  ObjectSource,  Status;
    private ObjectTypes ObjectType;
    private Date Created,  LastDDLTime;
    private Preferences ParentPref;
    private OUser ou;
    private OObjectType ot;
    private boolean isObjectSourceSet = false;

    public BaseClass(String OOwner, String OName, ObjectTypes OType,
            Date OCreated, Date OLastDDLTime, String OStatus, Preferences pref, OUser ou, OObjectType ot) {
        Owner = OOwner;
        ObjectName = OName;
        ObjectType = OType;
        Created = OCreated;
        LastDDLTime = OLastDDLTime;
        Status = OStatus;
        ParentPref = pref;
        this.ou = ou;
        this.ot = ot;
    }

    public Preferences getPreferencesRoot() {
        return ParentPref.node(this.toString());
    }

    @Override
    public String toString() {
        if (Owner != null) {
            return Owner + '.' + ObjectName;
        } else {
            return ObjectName;
        }
    }

    public String getOwner() {
        return Owner;
    }

    public String getObjectName() {
        return ObjectName;
    }

    public String getLocalFile() {
        return getPreferencesRoot().get("LocalFile", "");
    }

    public void setLocalFile(String LocalFile) {
        getPreferencesRoot().put("LocalFile", LocalFile);
    }

    public String getObjectSource() {
        return ObjectSource;
    }

    public void setObjectSource(String OSource) {
        ObjectSource = OSource;
        isObjectSourceSet = true;
    }

    public boolean getisObjectSourceSet() {
        return isObjectSourceSet;
    }

    public Date getCreated() {
        return Created;
    }

    public Date getLastDDLTime() {
        return LastDDLTime;
    }

    public ObjectTypes getObjectType() {
        return ObjectType;
    }

    public String getStatus() {
        return Status;
    }

    public boolean isValid() {
        return Status.compareToIgnoreCase("VALID") == 0;
    }

    public void LoadObjectSource(OracleConnection conn) {
        Statement stmt_src = null;
        ResultSet rset_src = null;
        if (!getisObjectSourceSet()) {
            try {
                stmt_src = conn.createStatement();
                switch (ou.getObjectAccessed()) {
                    case User:
                        rset_src = stmt_src.executeQuery("select t.text from user_source t where t.name = '" + getObjectName() + "' and t.type = '" + getObjectType().toString().replace('_', ' ') + "' order by t.line asc");
                        break;
                    case All:
                        rset_src = stmt_src.executeQuery("select t.text from all_source t where t.name = '" + getObjectName() + "' and t.owner = '" + getOwner() + "' and t.type = '" + getObjectType().toString().replace('_', ' ') + "' order by t.line asc");
                        break;
                    case DBA:
                        rset_src = stmt_src.executeQuery("select t.text from dba_source t where t.name = '" + getObjectName() + "' and t.owner = '" + getOwner() + "' and t.type = '" + getObjectType().toString().replace('_', ' ') + "' order by t.line asc");
                        break;
                }
                StringBuilder sb = new StringBuilder();
                while (rset_src.next()) {
                    sb.append(rset_src.getString(1));
                }
                if (sb.length() > 0 && !getisObjectSourceSet()) {
                    sb.insert(0, "create or replace ");
                    //sb.append('/');
                    setObjectSource(sb.toString());
                }
                rset_src.close();
                stmt_src.close();
            } catch (SQLException ex) {
                if (ex.getErrorCode() != 17008 && ex.getErrorCode() != 17011) {
                    // 17008 - Connection Closed; 17011 - Exhausted Resultset
                    Exceptions.printStackTrace(ex);
                    System.out.println(ex.getErrorCode());
                }
            }
        }
    }

    public boolean isLocalFileExists() {
        File f = new File(getLocalFile());
        boolean ret = false;
        try {
            String s = f.getPath();
            if (s == null || s.equalsIgnoreCase("") || f.isDirectory() || !f.isFile()) {
                throw new IOException();
            }
            ret = f.exists();
        } catch (IOException ex) {
            ret = false;
        }
        return ret;
    }

    public File returnLocalFile() {
        File f = new File(getLocalFile());
        try {
            String s = f.getPath();
            if (s == null || s.equalsIgnoreCase("") || f.isDirectory() || !f.isFile()) {
                throw new IOException();
            }
        } catch (IOException ex) {
            JFileChooser fc = new JFileChooser();
            String filename = this.toString() + '.' + Utils.getFileExtensionByType(ObjectType);
            fc.setSelectedFile(new File(filename));
            int ret = fc.showSaveDialog(WindowManager.getDefault().getMainWindow());
            f = fc.getSelectedFile();
            if (f == null || ret == JFileChooser.CANCEL_OPTION) {
                return null;
            }
        }
        return f;
    }

    public void edit() {
        File selFile = returnLocalFile();
        if (selFile == null) {
            return;
        }
        FileObject file;
        DataObject dob;
        try {
            FileWriter fw = new FileWriter(selFile);
            OracleConnection conn = ou.getConn();
            this.LoadObjectSource(conn);
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
            fw.write(this.ObjectSource);
            fw.close();
            //file = Repository.getDefault().getDefaultFileSystem().findResource(selFile.getCanonicalPath());
            file = FileUtil.toFileObject(selFile);
            dob = DataObject.find(file);
            EditCookie cookie = dob.getCookie(EditCookie.class);
            if (cookie != null) {
                cookie.edit();
            }
            setLocalFile(selFile.getCanonicalPath());
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    //MyClass theInstance = (MyClass) cookie.instanceCreate();
    //JFileChooser chooser = new JFileChooser();
    //int returnVal = chooser.showSaveDialog(WindowManager.getDefault().getMainWindow());


    //Lookup lookup = MimeLookup.getLookup("text/pl_sql");
    //EditorKit ek = CloneableEditorSupport.getEditorKit("text/pl_sql");
    //if (ek != null) {
    //throw new UnsupportedOperationException("ek.getContentType()");
    //}
    }

    public void CompileLocalFile() {
        File selFile = returnLocalFile();
        FileObject file;
        DataObject dob = null;
        Statement stmt = null;
        OracleConnection conn = null;
        try {
            file = FileUtil.toFileObject(selFile);
            dob = DataObject.find(file);
            SaveCookie cookie = dob.getCookie(SaveCookie.class);
            if (cookie != null) {
                cookie.save();
            }
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        if (ou.getIsConnected()) {
            try {
                FileReader fr = new FileReader(selFile);
                BufferedReader br = new BufferedReader(fr);
                StringBuilder sb = new StringBuilder();
                String line = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    //sb.append(System.getProperty("line.separator"));
                    sb.append('\n');
                }

                br.close();
                fr.close();

                conn = ou.getConn();
                stmt = conn.createStatement();
                ou.OutputMsg("", null, false);
                ou.OutputMsg(NbBundle.getMessage(Utils.getCommonClass(), "LBL_Compiling", getLocalFile()), null, false);
                stmt.execute(sb.toString());
                ou.OutputMsg(Utils.getBundle().getString("LBL_Done"), null, false);
                ShowErrors(stmt, dob);

                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                while (ex != null) {
                    ou.OutputMsg(ex.getMessage(), null, true);
                    ex = ex.getNextException();
                }
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
            }
        }
    }

    private void ShowErrors(Statement stmt, DataObject dob) throws SQLException {
        /*SQLWarning w = stmt.getWarnings();
        while (w != null) {
        ou.OutputMsg(w.getMessage(), null, true);
        w = w.getNextWarning();
        }*/
        ResultSet rset = null;
        if (ou.getOracleMajorVersion() >= 10) {
            rset = stmt.executeQuery("select t.line, t.position, t.text, initcap(t.attribute) from user_errors t where t.name = '" +
                    ObjectName + "' and t.type = '" + ObjectType.toString().replace('_', ' ') + "' order by t.sequence");
            while (rset.next()) {
                ou.OutputMsg(rset.getString(4) + ' ' + rset.getString(3) + " at [" + rset.getString(1) + ':' + rset.getString(2) + "]",
                        dob == null ? null : new ErrorOutputListener(dob, rset.getInt(1), rset.getInt(2)),
                        rset.getString(4).equalsIgnoreCase("ERROR") ? true : false);
            }
        } else {
            rset = stmt.executeQuery("select t.line, t.position, t.text from user_errors t where t.name = '" +
                    ObjectName + "' and t.type = '" + ObjectType.toString().replace('_', ' ') + "' order by t.sequence");
            while (rset.next()) {
                ou.OutputMsg(rset.getString(3) + " at [" + rset.getString(1) + ':' + rset.getString(2) + "]",
                        dob == null ? null : new ErrorOutputListener(dob, rset.getInt(1), rset.getInt(2)), true);
            }
        }
        rset.close();
    }

    class ErrorOutputListener implements OutputListener {

        DataObject dObj;
        int pos;
        int realLineNo;

        ErrorOutputListener(DataObject dObj, int realLineNo, int pos) {
            this.dObj = dObj;
            this.pos = pos - 1;
            this.realLineNo = realLineNo - 1;
        }

        public void outputLineSelected(OutputEvent evt) {
        }

        public void outputLineAction(OutputEvent evt) {
            LineCookie lc = dObj.getCookie(org.openide.cookies.LineCookie.class);
            Line line = lc.getLineSet().getOriginal(realLineNo);
            line.show(Line.SHOW_GOTO, pos);
        }

        public void outputLineCleared(OutputEvent evt) {
        }
    }

    public void Refresh() {
        ot.Refresh();
    }

    public static String getCompileString(
            String ObjName, ObjectTypes ot) {
        String ret = null;
        switch (ot) {
            case FUNCTION:
                ret = "ALTER FUNCTION %1$s COMPILE";
                break;

            case PACKAGE:
                ret = "ALTER PACKAGE %1$s COMPILE SPECIFICATION";
                break;

            case PACKAGE_BODY:
                ret = "ALTER PACKAGE %1$s COMPILE BODY";
                break;

            case PROCEDURE:
                ret = "ALTER PROCEDURE %1$s COMPILE";
                break;

            case TRIGGER:
                ret = "ALTER TRIGGER %1$s COMPILE";
                break;

            case TYPE:
                ret = "ALTER TYPE %1$s COMPILE SPECIFICATION";
                break;

            case TYPE_BODY:
                ret = "ALTER TYPE %1$s COMPILE BODY";
                break;

        }
        return String.format(ret, ObjName);
    }

    public static String getDropString(
            String ObjName, ObjectTypes ot) {
        String ret = null;
        switch (ot) {
            case FUNCTION:
                ret = "DROP FUNCTION %1$s";
                break;

            case PACKAGE:
                ret = "DROP PACKAGE %1$s";
                break;

            case PACKAGE_BODY:
                ret = "DROP PACKAGE BODY %1$s";
                break;

            case PROCEDURE:
                ret = "DROP PROCEDURE %1$s";
                break;

            case TRIGGER:
                ret = "DROP TRIGGER %1$s";
                break;

            case TYPE:
                ret = "DROP TYPE %1$s";
                break;

            case TYPE_BODY:
                ret = "DROP TYPE BODY %1$s";
                break;

        }
        return String.format(ret, ObjName);
    }

    public void Compile() {
        OracleConnection conn = null;
        Statement stmt = null;
        if (ou.getIsConnected()) {
            try {
                conn = ou.getConn();
                stmt = conn.createStatement();
                ou.OutputMsg("", null, false);
                ou.OutputMsg(NbBundle.getMessage(Utils.getCommonClass(), "LBL_CompilingDB",
                        ObjectType.toString().replace('_', ' ').toLowerCase(), toString()), null, false);
                stmt.execute(BaseClass.getCompileString(toString(), ObjectType));
                ou.OutputMsg(Utils.getBundle().getString("LBL_Done"), null, false);
                ShowErrors(stmt, null);
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                while (ex != null) {
                    ou.OutputMsg(ex.getMessage(), null, true);
                    ex =
                            ex.getNextException();
                }

            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
            }
        }
    }

    public void Delete() {
        OracleConnection conn = null;
        Statement stmt = null;
        if (ou.getIsConnected()) {
            try {
                conn = ou.getConn();
                stmt = conn.createStatement();
                ou.OutputMsg("", null, false);
                ou.OutputMsg(NbBundle.getMessage(Utils.getCommonClass(), "LBL_DroppingDB",
                        ObjectType.toString().replace('_', ' ').toLowerCase(), toString()), null, false);
                stmt.execute(BaseClass.getDropString(toString(), ObjectType));
                ou.OutputMsg(Utils.getBundle().getString("LBL_Done"), null, false);
                File f = new File(getLocalFile());
                if (f.exists()) {
                    try {
                        FileObject file = FileUtil.toFileObject(f);
                        DataObject dob = DataObject.find(file);
                        CloseCookie cookie = dob.getCookie(CloseCookie.class);
                        if (cookie != null) {
                            cookie.close();
                        }
                    } catch (IOException e) {
                        //Exceptions.printStackTrace(e);
                    }
                }

                try {
                    getPreferencesRoot().removeNode();
                } catch (BackingStoreException ex) {
                    Exceptions.printStackTrace(ex);
                }
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                while (ex != null) {
                    ou.OutputMsg(ex.getMessage(), null, true);
                    ex =
                            ex.getNextException();
                }

            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
            }
        }

    }

    public boolean getIsConnected() {
        // to enable Delete action
        return false;
    }
}
