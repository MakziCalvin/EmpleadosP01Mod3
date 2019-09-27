/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matzi
 */
public class TestMontoBono {
    
    
    @Test
    public void testMontoBono() {
        System.out.println("MontoBono");
        Empleado instance = new Empleado("asd", "asda", 45, 4);
        int expResult =200000;
        int result = instance.montoBono();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setBono method, of class Empleado.
     */
    
    /**
     * Test of montoBono method, of class Empleado.
     */
        
}
