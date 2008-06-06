/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.modules.languages.pl_sql.editor.oracletree;

import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OUser;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.RoleTypes;
import static org.junit.Assert.*;
import org.netbeans.modules.languages.pl_sql.editor.oracletree.OConnectionClass.OUser;

/**
 *
 * @author SUMsoft
 */
public class OConnectionClassTest {

    OConnectionClass instance = null;
    
    public OConnectionClassTest() {
        instance = new OConnectionClass("localhost", 1521, "mydb101", "dvncore", "absolon", true, RoleTypes.normal);
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
     * Test of AddUser method, of class OConnectionClass.
     */
    @Test
    public void testAddUser() {
        System.out.println("AddUser");
        OUser user = null;
        //OConnectionClass instance = null;
        instance.AddUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class OConnectionClass.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
       
        String expResult = "localhost:1521/mydb101";
        String result = instance.toString();
        assertEquals(expResult, result);    
    }

    /**
     * Test of getDatabaseName method, of class OConnectionClass.
     */
    @Test
    public void testGetDatabaseName() {
        System.out.println("getDatabaseName");
        
        String expResult = "mydb101";
        String result = instance.getDatabaseName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPort method, of class OConnectionClass.
     */
    @Test
    public void testGetPort() {
        System.out.println("getPort");
       
        int expResult = 1521;
        int result = instance.getPort();
        assertEquals(expResult, result);
    }

    /**
     * Test of getServerName method, of class OConnectionClass.
     */
    @Test
    public void testGetServerName() {
        System.out.println("getServerName");
      
        String expResult = "localhost";
        String result = instance.getServerName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsers method, of class OConnectionClass.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
      
        TreeSet<OUser> expResult = null;
        TreeSet<OUser> result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}