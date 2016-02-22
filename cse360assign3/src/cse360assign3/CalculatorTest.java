package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculator() {
        Calculator testCalc = new Calculator();
        
        assertNotNull(testCalc);
    }

    @Test
    public void testGetTotal() {
        Calculator testCalc = new Calculator();
        
        assertEquals(0, testCalc.getTotal());
    }

    @Test
    public void testAdd() {
        Calculator testCalc = new Calculator();
        
        testCalc.add(5);
        
        assertEquals(5, testCalc.getTotal());
    }

    @Test
    public void testSubtract() {
        Calculator testCalc = new Calculator();
        
        testCalc.subtract(3);
        
        assertEquals(-3, testCalc.getTotal());
    }

    @Test
    public void testMultiply() {
        Calculator testCalc = new Calculator();
        
        testCalc.add(2);
        testCalc.multiply(5);
        
        assertEquals(10, testCalc.getTotal());
    }

    @Test
    public void testDivide() {
        Calculator testCalc = new Calculator();
        
        testCalc.add(8);
        testCalc.divide(2);
        
        assertEquals(4, testCalc.getTotal());
    }
    
    @Test
    public void testDivideByZero() {
        Calculator testCalc = new Calculator();
        
        testCalc.add(8);
        testCalc.divide(0);
        
        assertEquals(0, testCalc.getTotal());
    }

    @Test
    public void testGetHistory() {
        Calculator testCalc = new Calculator();
    }

}
