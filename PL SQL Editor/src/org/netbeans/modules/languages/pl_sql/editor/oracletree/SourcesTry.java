/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.pool.OracleDataSource;
import org.openide.util.Exceptions;
import org.openide.util.RequestProcessor;
import org.openide.util.TaskListener;

/**
 *
 * @author SUMsoft
 */
public class SourcesTry {

    private RequestProcessor rp;
    private RequestProcessor.Task task;
    private static SourcesTry instance = null;
    private ObjectTreeSet ots = null;
    private OracleConnection conn;
    private boolean IsCanceled = false;

    public static SourcesTry getInstance(ObjectTreeSet ots, OracleDataSource ds) {
        if (instance != null) {
            instance.stop();
        }
        while (instance != null) {
        }
        try {
            instance = new SourcesTry(ots, (OracleConnection) ds.getConnection());
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }
        return instance;
    }

    public boolean getIsCanceled() {
        return IsCanceled;
    }

    public ObjectTreeSet getOts() {
        return ots;
    }

    public OracleConnection getConn() {
        return conn;
    }

    private SourcesTry(ObjectTreeSet ots, OracleConnection conn) {
        this.ots = ots;
        this.conn = conn;
        rp = new RequestProcessor(SourcesTry.class.getName(), 1, true);

        task = rp.create(new Runnable() {

            public void run() {
                Statement stmt_src = null;
                ResultSet rset_src = null;
                try {
                    for (BaseClass bc : getOts()) {
                        if (getIsCanceled()) {
                            getConn().close();
                            return;
                        }
                        if (!bc.getisObjectSourceSet()) {

                            stmt_src = getConn().createStatement();
                            switch (getOts().getSelObjectAccessed()) {
                                case User:
                                    rset_src = stmt_src.executeQuery("select t.text from user_source t where t.name = '" + bc.getObjectName() + "' and t.type = '" + bc.getObjectType().toString().replace('_', ' ') + "' order by t.line asc");
                                    break;
                                case All:
                                    rset_src = stmt_src.executeQuery("select t.text from all_source t where t.name = '" + bc.getObjectName() + "' and t.owner = '" + bc.getOwner() + "' and t.type = '" + bc.getObjectType().toString().replace('_', ' ') + "' order by t.line asc");
                                    break;
                                case DBA:
                                    rset_src = stmt_src.executeQuery("select t.text from dba_source t where t.name = '" + bc.getObjectName() + "' and t.owner = '" + bc.getOwner() + "' and t.type = '" + bc.getObjectType().toString().replace('_', ' ') + "' order by t.line asc");
                                    break;
                            }
                            StringBuffer sb = new StringBuffer();
                            while (rset_src.next()) {
                                if (getIsCanceled()) {
                                    getConn().close();
                                    return;
                                }
                                sb.append(rset_src.getString(1));
                            }
                            if (sb.length() > 0 && !bc.getisObjectSourceSet()) {
                                sb.insert(0, "create or replace ");
                                //sb.append('/');
                                bc.setObjectSource(sb.toString());
                            }
                            rset_src.close();
                            stmt_src.close();
                        }
                    }
                    getConn().close();
                } catch (SQLException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        });

        task.addTaskListener(
                new TaskListener() {

                    public void taskFinished(org.openide.util.Task arg0) {
                        if (getConn() != null) {
                            try {
                                getConn().close();
                            } catch (SQLException ex) {
                                Exceptions.printStackTrace(ex);
                            }
                        }
                        instance = null;
                    }
                });

    }

    public void post() {
        rp.post(task);
    }

    public void stop() {
        this.task.cancel();
        this.IsCanceled = true;
    }
}    

