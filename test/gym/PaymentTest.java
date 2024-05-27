/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package gym;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shahi
 */
public class PaymentTest {
    
    public PaymentTest() {
    }

    @Test
    public void testMakePayment() {
        System.out.println("makePayment");
        double amount = 0.0;
        String method = "";
        double required = 0.0;
        Payment.makePayment(amount, method, required);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCashBalance() {
        System.out.println("getCashBalance");
        double expResult = 0.0;
        double result = Payment.getCashBalance();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCreditBalance() {
        System.out.println("getCreditBalance");
        double expResult = 0.0;
        double result = Payment.getCreditBalance();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSerializeBalances() {
        System.out.println("serializeBalances");
        String path = "";
        Payment.serializeBalances(path);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeserializeBalances() {
        System.out.println("deserializeBalances");
        Payment.deserializeBalances();
        fail("The test case is a prototype.");
    }
    
}
