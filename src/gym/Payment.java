/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import java.io.*;


/**
 *
 * @author shahi
 */
public class Payment implements Serializable{
    
    private static double cashBalance = 0.0;
    private static double creditBalance = 0.0;

    public static void makePayment(double amount, String method, double required) {
        double change = amount - required;
        if (method.equals("Cash")) {
            cashBalance += amount - change;
        } else if (method.equals("Credit")) {
            creditBalance += amount - change;
        }
        serializeBalances("payments.ser");
    }

    public static double getCashBalance() {
        return cashBalance;
    }

    public static double getCreditBalance() {
        return creditBalance;
    }
    
    public static void serializeBalances(String path) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {
            out.writeObject(new double[]{cashBalance, creditBalance});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializeBalances() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("payments.ser"))) {
            double[] balances = (double[]) in.readObject();
            cashBalance = balances[0];
            creditBalance = balances[1];
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}

