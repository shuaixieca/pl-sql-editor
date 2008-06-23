/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.prefs.Preferences;
import oracle.jdbc.OracleConnection;
import org.openide.util.Exceptions;

/**
 *
 * @author SUMsoft
 */
class BaseClassComp implements Comparator<BaseClass> {

    public int compare(BaseClass a, BaseClass b) {
        return a.toString().compareTo(b.toString());
    }
}

public class ObjectTreeSet extends TreeSet<BaseClass> {

    private ObjectTypes AllObjType;
    private ObjectAccessed SelObjectAccessed;
    private Preferences ParentPref;

    public ObjectTreeSet(ObjectTypes OType, ObjectAccessed OAccessed, Preferences pref) {
        super(new BaseClassComp());
        AllObjType = OType;
        SelObjectAccessed = OAccessed;
        ParentPref = pref;
    }

    public void LoadObjects(OUser ou, OObjectType ot) {
        this.clear();
        OracleConnection conn = ou.getConn();
        Statement stmt = null;
        ResultSet rset = null;
        Statement stmt_src = null;
        ResultSet rset_src = null;
        try {
            if (conn.isClosed()) {
                new SQLException("Connection is closed.");
            }
            stmt = conn.createStatement();
            switch (SelObjectAccessed) {
                case User:
                    rset = stmt.executeQuery("select t.object_name, t.created, t.last_ddl_time, t.status, '' from user_objects t where t.object_type = '" + AllObjType.toString().replace('_', ' ') + "'");
                    break;
                case All:
                    rset = stmt.executeQuery("select t.object_name, t.created, t.last_ddl_time, t.status, t.owner from all_objects t where t.object_type = '" + AllObjType.toString().replace('_', ' ') + "'");
                    break;
                case DBA:
                    rset = stmt.executeQuery("select t.object_name, t.created, t.last_ddl_time, t.status, t.owner from dba_objects t where t.object_type = '" + AllObjType.toString().replace('_', ' ') + "'");
                    break;
            }
            while (rset.next()) {
                BaseClass bc = new BaseClass(rset.getString(5), rset.getString(1), 
                        AllObjType, rset.getDate(2), rset.getDate(3), rset.getString(4), ParentPref, ou, ot);
                //this.add(bc);
                stmt_src = conn.createStatement();
                switch (SelObjectAccessed) {
                    case User:
                        rset_src = stmt_src.executeQuery("select t.text from user_source t where t.name = '" + rset.getString(1) + "' and t.type = '" + AllObjType.toString().replace('_', ' ') + "' order by t.line asc");
                        break;
                    case All:
                        rset_src = stmt_src.executeQuery("select t.text from all_source t where t.name = '" + rset.getString(1) + "' and t.owner = '" + rset.getString(5) + "' and t.type = '" + AllObjType.toString().replace('_', ' ') + "' order by t.line asc");
                        break;
                    case DBA:
                        rset_src = stmt_src.executeQuery("select t.text from dba_source t where t.name = '" + rset.getString(1) + "' and t.owner = '" + rset.getString(5) + "' and t.type = '" + AllObjType.toString().replace('_', ' ') + "' order by t.line asc");
                        break;
                }
                //StringBuffer sb = new StringBuffer();
                StringBuilder sb = new StringBuilder();
                while (rset_src.next()) {
                    sb.append(rset_src.getString(1));
                }
                if (sb.length() > 0) {
                    sb.insert(0, "create or replace ");
                    //sb.append('/');
                    bc.setObjectSource(sb.toString());
                }
                this.add(bc);
                rset_src.close();
                stmt_src.close();
            }
        } catch (SQLException ex) {
            if (ex.getErrorCode() != 942) {
                Exceptions.printStackTrace(ex);
            }
        } finally {
            try {

                if (rset_src != null) {
                    rset_src.close();
                }
                if (stmt_src != null) {
                    stmt_src.close();
                }
                if (rset != null) {
                    rset.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }
}
