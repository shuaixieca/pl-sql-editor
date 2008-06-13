/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.util.Date;

/**
 *
 * @author SUMsoft
 */
enum ObjectTypes {

    FUNCTION, PROCEDURE, PACKAGE, PACKAGE_BODY, TRIGGER, TYPE, TYPE_BODY
};

public class BaseClass {

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
}