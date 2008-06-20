/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor;

import java.lang.String;
import java.util.ResourceBundle;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.ObjectTypes;
import org.openide.nodes.AbstractNode;
import org.openide.util.NbBundle;

/**
 *
 * @author SUMsoft
 */
public class Utils {

    public static ResourceBundle getBundle() {
        return NbBundle.getBundle(OracleTopComponent.class);
    }

    public static String getFileExtensionByType(ObjectTypes ot) {
        switch (ot) {
            case FUNCTION:
                return "fnc";
            case PACKAGE:
                return "pks";
            case PACKAGE_BODY:
                return "pkb";
            case PROCEDURE:
                return "prc";
            case TRIGGER:
                return "trg";
            case TYPE:
                return "tps";
            case TYPE_BODY:
                return "tpb";
        }
        return "spc";
    }
    private final static String ICO_ROOT = "org/netbeans/modules/languages/pl_sql/editor/resources/";

    public static void setOracleIconBase(AbstractNode nd, ObjectTypes ot, boolean list) {
        String ext = null;
        if (list) {
            ext = "List.png";
        } else {
            ext = "Obj.png";
        }
        switch (ot) {
            case FUNCTION:
                nd.setIconBaseWithExtension(ICO_ROOT + "Functions" + ext);
                break;
            case PROCEDURE:
                nd.setIconBaseWithExtension(ICO_ROOT + "Procedures" + ext);
                break;
            case PACKAGE:
                nd.setIconBaseWithExtension(ICO_ROOT + "Packages" + ext);
                break;
        }
    }
}
