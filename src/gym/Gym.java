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
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
       Manager m = new Manager("1","Andrew", 18, "Male", "123 park", "Andrew@gmail.com","514-612-3244");
       Trainer t = new Trainer("Trainer", "John Cena", 40, "Male", "822 Avenue", "CenaJohn@gmail.com", "133-343-4355");
       employees.add(m);
       employees.add(t);
       Employee.saveEmployeeList();
       Employee.loadEmployeeList();
       
       Member mem = new Member("James Shahini", 20, "Male", "931 Ball", "ShaJames@gmail.com", "514-131-3134","Premium","Credit");
       Member mem2 = new Member("William Black", 27, "Male", "672 Avenue", "WilliamBlack@gmail.com", "514-977-8297","Regular","Credit");
       members.add(mem);
       members.add(mem2);
       Member.Serialize("Member.ser");
       startUp();
 
    }
    
    public static void startUp(){
        members = Member.loadMembers();
    }
    
    public static ArrayList<Member> members = new ArrayList<>();
  // public static ArrayList<Trainer> trainers = new ArrayList<>();
    public static ArrayList<Employee> employees = new ArrayList<>();

    
      
 

}
    
    

