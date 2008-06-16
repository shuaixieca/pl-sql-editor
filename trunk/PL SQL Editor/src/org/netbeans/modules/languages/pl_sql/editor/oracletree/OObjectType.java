/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ChangeListener;
import oracle.jdbc.OracleConnection;
import org.openide.util.ChangeSupport;

/**
 *
 * @author SUMsoft
 */
public class OObjectType {

    private ObjectTypes objecttype;
    private OracleConnection conn;
    private final ChangeSupport changeSupport = new ChangeSupport(this);

    public OObjectType(ObjectTypes objecttype, OracleConnection oc) {
        this.objecttype = objecttype;
        this.conn = oc;
    }

    public ObjectTypes getObjecttype() {
        return objecttype;
    }

    @Override
    public String toString() {
        switch (objecttype) {
            case FUNCTION:
                return "Functions";
            case PROCEDURE:
                return "Procedures";
            case PACKAGE:
                return "Packages Spec";
            case PACKAGE_BODY:
                return "Packages Body";
            case TRIGGER:
                return "Triggers";
            case TYPE:
                return "Types Spec";
            case TYPE_BODY:
                return "Types Body";
        }
        return null;
    }

    public void addChangeListener(ChangeListener listener) {
        changeSupport.addChangeListener(listener);
    }

    public void removeChangeListener(ChangeListener listener) {
        changeSupport.removeChangeListener(listener);
    }

    protected void notifyChange() {
        changeSupport.fireChange();
    }

    public List<BaseClass> LoadAllObjects() {
        ObjectTreeSet ots = new ObjectTreeSet(this.objecttype, ObjectAccessed.User);
        ots.LoadObjects(conn);
        ArrayList<BaseClass> res = new ArrayList<BaseClass>();
        for (BaseClass bc : ots) {
            res.add(bc);
        }
        return res;
    }
}
