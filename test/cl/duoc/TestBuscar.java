/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 * @author Matzi
 */
public class TestBuscar {
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "11111111";
        BussEmpleado instance = new BussEmpleado();
        Empleado expResult=null;
        
        Empleado result = instance.Buscar(rut);
        assertEquals(result.getRut(), rut);
        
        
    }
}
