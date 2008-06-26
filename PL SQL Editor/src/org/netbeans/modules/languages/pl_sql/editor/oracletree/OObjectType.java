/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.AddCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.ChangeOAccessCookieInterface;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.actions.RefreshCookieInterface;
import org.openide.util.ChangeSupport;
import org.openide.util.NotImplementedException;

/**
 *
 * @author SUMsoft
 */
public class OObjectType implements RefreshCookieInterface, ChangeOAccessCookieInterface,
        AddCookieInterface {

    private ObjectTypes objecttype;
    private OUser ou;
    private final ChangeSupport changeSupport = new ChangeSupport(this);

    public OObjectType(ObjectTypes objecttype, OUser ou) {
        this.objecttype = objecttype;
        this.ou = ou;
    }

    public Preferences getPreferencesRoot() {
        return ou.getPreferencesRoot().node(getObjecttype().toString());
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
        ObjectTreeSet ots = new ObjectTreeSet(this.objecttype, this.ou.getObjectAccessed(), this.getPreferencesRoot());
        ots.LoadObjects(ou, this);
        ArrayList<BaseClass> res = new ArrayList<BaseClass>();
        for (BaseClass bc : ots) {
            res.add(bc);
        }
        return res;
    }

    public void Refresh() {
        this.notifyChange();
    }

    public void ChangeOAccess(ObjectAccessed oa) {
        ou.ChangeOAccess(oa);
    }

    public ObjectAccessed getObjectAccessed() {
        return ou.getObjectAccessed();
    }

    public void Add() {
        String objname = JOptionPane.showInputDialog(null, "Please type new object name",
                "Create new PL/SQL object", JOptionPane.QUESTION_MESSAGE);
        if (objname == null || objname.length() == 0) {
            return;
        }
        BaseClass bc = new BaseClass(null, objname.toUpperCase(), objecttype, null, null, null, getPreferencesRoot(), ou, this);
        bc.setObjectSource(OObjectTypeTemplates.getTemplate(objecttype, objname));
        bc.edit();
        if (bc.isLocalFileExists()) {
            bc.CompileLocalFile();
            this.Refresh();
        }
    }
}
