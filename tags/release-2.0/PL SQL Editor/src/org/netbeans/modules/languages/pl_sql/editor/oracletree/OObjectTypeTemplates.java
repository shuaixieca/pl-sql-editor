/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

/**
 *
 * @author SUMsoft
 */
public class OObjectTypeTemplates {

    public static String getTemplate(ObjectTypes ot, String oname) {
        StringBuffer sb = new StringBuffer();
        switch (ot) {
            case FUNCTION:
                sb.append(String.format("create or replace function %1$s\n", oname));
                sb.append("return <type> is\n");
                sb.append("begin\n");
                sb.append("null;\n");
                sb.append(String.format("end %1$s;\n", oname));
                break;
            case PROCEDURE:
                sb.append(String.format("create or replace procedure %1$s\n", oname));
                sb.append("is\n");
                sb.append("begin\n");
                sb.append("null;\n");
                sb.append(String.format("end %1$s;\n", oname));
                break;
            case PACKAGE:
                sb.append(String.format("create or replace package %1$s\n", oname));
                sb.append("is\n");
                sb.append("begin\n");
                sb.append("null;\n");
                sb.append(String.format("end %1$s;\n", oname));
                break;
            case PACKAGE_BODY:
                sb.append(String.format("create or replace package body %1$s\n", oname));
                sb.append("is\n");
                sb.append("begin\n");
                sb.append("null;\n");
                sb.append(String.format("end %1$s;\n", oname));
                break;
            case TYPE:
                sb.append(String.format("create or replace type %1$s\n", oname));
                sb.append("is\n");
                sb.append("begin\n");
                sb.append("null;\n");
                sb.append(String.format("end %1$s;\n", oname));
                break;
            case TYPE_BODY:
                sb.append(String.format("create or replace type body %1$s\n", oname));
                sb.append("is\n");
                sb.append("begin\n");
                sb.append("null;\n");
                sb.append(String.format("end %1$s;\n", oname));
                break;
            case TRIGGER:
                sb.append(String.format("create or replace trigger %1$s before drop on schema\n", oname));
                sb.append("begin\n");
                sb.append("null;\n");
                sb.append(String.format("end %1$s;\n", oname));
                break;
        }
        return sb.toString();
    }
}
