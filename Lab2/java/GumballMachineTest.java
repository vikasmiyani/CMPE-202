

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTest
{
    /**
     * Default constructor for test class GumballMachineTest
     */
    GumballMachine m ;
    public GumballMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        m = new GumballMachine(10);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
     
    }
    
     @Test
    public void testWithQuarter()
    {
        m.insertQuarter(); 
        m.insertQuarter();
        m.turnCrank();
        assertEquals(true, m.isGumballInSlot());
    }
    
     @Test
    public void testWithDimes()
    {
        m.insertDime();
        m.insertDime(); 
        m.insertDime(); 
        m.insertDime(); 
        m.insertDime(); 
        m.turnCrank();
        assertEquals(true, m.isGumballInSlot());
    }
    
    @Test
    public void testWithNickels()
    {
        m.insertNickel();
        m.insertNickel();
        m.insertNickel();
        m.insertNickel();
        m.insertNickel();  
        m.insertNickel(); 
        m.insertNickel();
        m.insertNickel();
        m.insertNickel();
        m.insertNickel();
        m.turnCrank();
        assertEquals(true, m.isGumballInSlot());
    }
    
    @Test
    public void testTakeGumball()
    {
        m.insertQuarter(); 
        m.insertQuarter();
        m.turnCrank();
        m.takeGumballFromSlot();
        assertEquals(false, m.isGumballInSlot());
    }
    
    @Test
    public void testLessAmount()
    {
        m.insertQuarter();
        m.turnCrank();
        m.takeGumballFromSlot();
        assertEquals(false, m.isGumballInSlot());
    }
    
    @Test
    public void testMoreAmount()
    {
        m.insertQuarter();
        m.insertDime();
        m.insertDime();
        m.insertDime();
        m.turnCrank();
        m.takeGumballFromSlot();
        assertEquals(false, m.isGumballInSlot());
    }
    
    
    
   
}
