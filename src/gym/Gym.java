/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shahi
 */
public class Gym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
       Manager m = new Manager("1","Andrew", 18, "Male", "123 park", "Andrew@gmail.com","514-612-3244"); // needs a manager to login (Username: Andrew Password:123456)
       employees.add(m);
       Employee.loadEmployeeList(); // deserialize the ArrayList<Employee>
       startUp(); //deserialize the ArrayList<Member>
       Payment.deserializeBalances(); //deserializes payments
    }
    public static void startUp(){
        members = Member.loadMembers();
    }
    public static ArrayList<Member> members = new ArrayList<>();
    public static ArrayList<Employee> employees = new ArrayList<>();

}
    
    

