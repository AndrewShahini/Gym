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
       Manager m = new Manager(1);
        //startUp();
    
    }
    
    public static void startUp(){
        members = Deserialize("Member.ser");
    }
    
    public static ArrayList<Member> members = new ArrayList<>();

    public static ArrayList<Member> Deserialize(String path){
        
        ArrayList<Member> object = null;
    try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            members = (ArrayList<Member>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(members);
            return members;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return object;
    }
    
    public void addMember(Member member) {
        members.add(member);
        Serialize("Memeber.ser");
    }

    public void Serialize(String path){
    try {
           FileOutputStream fos = new FileOutputStream(path);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(members);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

}
    
    

