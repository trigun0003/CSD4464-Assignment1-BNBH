/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.bnbh;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0685310
 */
public class CSD4464Assignment1BNBHTest {

    public CSD4464Assignment1BNBHTest() {
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
     * Test of main method, of class CSD4464Assignment1BNBH.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CSD4464Assignment1BNBH.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringPower method, of class CSD4464Assignment1BNBH.
     */
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        String input = "";
        int power = 5;
        String expResult = "";
        String result = CSD4464Assignment1BNBH.stringPower(input, power);
        assertEquals(expResult, result);
    }

    /**
     *
     * @return
     */
    @Test
    public void testLessThanOneShouldReturnNull() {
        String str = "bob";
        int pwr = 0;
        String exResult = null;
        String result = CSD4464Assignment1BNBH.stringPower(str, pwr);
        assertEquals(exResult, result);

        fail("String failed Expected: " + exResult + " Result: " + result);

    }

    /**
     *
     * @return
     */
    @Test
    public void testStringAndOneShouldReturnString() {

        String str = "bob";
        int pwr = 2;
        String exResult = "bob";
        String result = CSD4464Assignment1BNBH.stringPower(str, pwr);

        assertEquals(exResult, result);

        fail("String failed Expected: " + exResult + " Result: " + result);
    }

    /**
     *
     * @return
     */
    @Test
    public void testStringAndTwoShouldReturnStringDoubled() {

        String str = "bob";
        int pwr = 2;
        String exResult = "bobbob";
        String result = CSD4464Assignment1BNBH.stringPower(str, pwr);

        assertEquals(exResult, result);

        fail("String failed Expected: " + exResult + " Result: " + result);

    }

}
