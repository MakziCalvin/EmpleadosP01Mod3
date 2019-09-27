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
public class TestCrear {
    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado ejem=new Empleado("191906-3", "maxi", 23, 5);
        BussEmpleado instance = new BussEmpleado();
        assertTrue(instance.Crear(ejem));
    }
}
