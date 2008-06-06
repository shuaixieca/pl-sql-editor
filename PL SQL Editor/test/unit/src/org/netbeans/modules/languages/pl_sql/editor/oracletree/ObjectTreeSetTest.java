/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openide.util.Exceptions;

/**
 *
 * @author SUMsoft
 */
public class ObjectTreeSetTest {

    public ObjectTreeSetTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of LoadObjects method, of class ObjectTreeSet.
     */
    @Test
    public void testLoadObjects() {
        System.out.println("LoadObjects");
        OracleDataSource ods;
        String URL = "jdbc:oracle:thin:svco_dev/svco@//localhost:1522/mydb101";
        try {
            ods = new OracleDataSource();
            ods.setURL(URL);
            ObjectTreeSet instance = new ObjectTreeSet(ObjectTypes.PACKAGE, ObjectAccessed. User);
            instance.LoadObjects(ods);
            for (BaseClass el : instance)
            {
                System.out.println(el.toString());
                System.out.println(el.getCreated());
                System.out.println(el.getLastDDLTime());
                System.out.println(el.getObjectSource().substring(0, 50));
                System.out.println(el.getStatus());
            }
            System.out.println(instance.size());
            assertTrue(instance.size() > 0);
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }

    }
}