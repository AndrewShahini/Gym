/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

/**
 *
 * @author shahi
 */
public class Payment {
    
    private static double cashBalance = 0.0;
    private static double creditBalance = 0.0;

    public static void makePayment(double amount, String method) {
        if (method.equals("Cash")) {
            cashBalance += amount;
        } else if (method.equals("Credit")) {
            creditBalance += amount;
        }
    }

    public static double getCashBalance() {
        return cashBalance;
    }

    public static double getCreditBalance() {
        return creditBalance;
    }
}

