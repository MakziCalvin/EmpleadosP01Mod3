/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import java.util.List;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 * @author Matzi
 */
public class TestEliminar {
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String rut = "77777777";
        BussEmpleado instance = new BussEmpleado();
        assertTrue(instance.Eliminar(rut));
       
    }

}
