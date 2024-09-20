/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.example.Fichas;

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a22diegopc
 */
public class CuadradoIT {

    public CuadradoIT() {
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
     * Test of mover method, of class Cuadrado.
     */
    /**
     * Test of getCordenadas method, of class Cuadrado.
     */
    @Test
    public void testC1() throws Exception {
        System.out.println("calcularDivision");
        int x = 0;
        int y = 0;
        Cuadrado instance = new Cuadrado(x, y, Color.BLUE);
        boolean expResult = true;
        boolean result = instance.mover(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testC2() throws Exception {
        System.out.println("calcularDivision");
        int x = 500;
        int y = 0;
        Cuadrado instance = new Cuadrado(x, y, Color.BLUE);
        boolean expResult = true;
        boolean result = instance.mover(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testC3() throws Exception {
        System.out.println("calcularDivision");
        int x = 500;
        int y = 500;
        Cuadrado instance = new Cuadrado(x, y, Color.BLUE);
        boolean expResult = true;
        boolean result = instance.mover(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testC4() throws Exception {
        System.out.println("calcularDivision");
        int x = 0;
        int y = 500;
        Cuadrado instance = new Cuadrado(x, y, Color.BLUE);
        boolean expResult = true;
        boolean result = instance.mover(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
