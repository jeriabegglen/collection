/*
Jeri Abegglen learning junit testing
 */
package collectionassignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeriabegglen
 */
public class CollectionAssignmentTest {
    
    public CollectionAssignmentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convert method, of class CollectionAssignment.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        String s1 = "8955";
        CollectionAssignment instance = new CollectionAssignment();
        String expResult = "22915";
        String result = instance.convert(s1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testConvert2() {
        System.out.println("convert");
        String s1 = "9630";
        CollectionAssignment instance = new CollectionAssignment();
        String expResult = "24030";
        String result = instance.convert(s1);
        assertEquals(expResult, result);
    }
    
}
