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
public class TestModificar {
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        String rut="44444444";
       
        BussEmpleado instance = new BussEmpleado();
         Empleado obj = new Empleado(rut, "JuanitoPerez", 55, 5);
        assertTrue(instance.Modificar(obj));
        
    }
}
