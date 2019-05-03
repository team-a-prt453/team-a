/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replace.conditional.logic.with.strategy.pattern;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joelb
 */
public class BankLoanTest {
    
    public BankLoanTest() {
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
     * Test of calculateLoan method, of class BankLoan.
     */
    @Test
    public void testCalculateLoan() {
        System.out.println("calculateLoan");
        double income = 0.0;
        BankLoan instance = new BankLoan();
        double expResult = 0.0;
        double result = instance.calculateLoan(income);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public void low() {
    assertEquals(1825, insuranceFor(5000), 0.01);
    }

    @Test
    public void medium() {
    assertEquals(38600, insuranceFor(25000), 0.01);
    }

    @Test
    public void high() {
    assertEquals(78500, insuranceFor(50000), 0.01);
    }

    @Test
    public void veryHigh() {
    assertEquals(106400, insuranceFor(100_000), 0.01);
    }

    private double insuranceFor(double income) {
    return new BankLoanTest().calculateLoan(income);
    }

    private double calculateLoan(double income) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
