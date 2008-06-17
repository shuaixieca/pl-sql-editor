/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.util.Date;
import org.openide.cookies.EditCookie;
import org.openide.loaders.DataLoader;
import org.openide.loaders.DataLoaderPool;

/**
 *
 * @author SUMsoft
 */
public class BaseClass implements EditCookie {

    private String Owner = null,  ObjectName,  ObjectSource,  Status;
    private ObjectTypes ObjectType;
    private Date Created,  LastDDLTime;

    public BaseClass(String OOwner, String OName, ObjectTypes OType, Date OCreated, Date OLastDDLTime, String OStatus) {
        Owner = OOwner;
        ObjectName = OName;
        ObjectType = OType;
        Created = OCreated;
        LastDDLTime = OLastDDLTime;
        Status = OStatus;
    }

    @Override
    public String toString() {
        if (Owner != null) {
            return Owner + '.' + ObjectName;
        } else {
            return ObjectName;
        }
    }

    public String getObjectSource() {
        return ObjectSource;
    }

    public void setObjectSource(String OSource) {
        ObjectSource = OSource;
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

    public void edit() {
        for (DataLoader loader : DataLoaderPool.getDefault().toArray()) {
            System.out.println(loader.getClass().getName());
            System.out.println(loader.getRepresentationClassName());
        }
        //Lookup lookup = MimeLookup.getLookup("text/pl_sql");
        //EditorKit ek = CloneableEditorSupport.getEditorKit("text/pl_sql");
        //if (ek != null) {
        //throw new UnsupportedOperationException("ek.getContentType()");
    //}
    }
}
