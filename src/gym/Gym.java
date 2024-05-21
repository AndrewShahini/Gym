/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gym;

import java.util.ArrayList;

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
        Manager man = new Manager(1);
        
    }
    
    private ArrayList<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
        Serialize("Memeber.ser");
    }

    public static void Serialize(String Path){
        
    }
    
    public boolean authenticate(String username, String password) {
        for (Member member : members) {
            if (member.getUsername().equals(username) && member.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public Member findMemberUsernme(String username) {
        for (Member member : members) {
            if (member.getUsername().equals(username)) {
                return member;
            }
        }
        return null;
    }
    
}
    
    

