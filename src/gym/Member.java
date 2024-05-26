/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import static gym.Gym.members;
import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author shahi
 */
public class Member extends Person {
    
    private static int count = 1;
    public String memberId;
    public String membership;

    public Member() {
        super();
        this.memberId = "";
        this.membership = "";
    }

    public Member(int memberId, String name, int age, String gender, String address, String email, String phoneNumber,String membership) {
        super(name, age, gender, address, email, phoneNumber);
        this.memberId = String.valueOf(count++);
        this.membership = membership;
    }
    public Member(String name, int age, String gender, String address, String email, String phoneNumber,String membership) {
        super(name, age, gender, address, email, phoneNumber);
        this.memberId = String.valueOf(count++);
        this.membership = membership;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Member.count = count;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void upgradeToPremium() {
        this.membership = "Premium";
        
    }

    @Override
    public String toString() {
        return memberId + ", " + name + ", " + membership+ ", " + gender+ ", " + age + ", " +address+ ", " + email+ ", " + phoneNumber;
    }
   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Member other = (Member) obj;
        if (this.memberId != other.memberId) {
            return false;
        }
        return false;
    }


    public static void Serialize(String path){
    
        try {
           FileOutputStream fos = new FileOutputStream(path);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(members);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
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
*/
     public static ArrayList<Member> loadMembers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Member.ser"))) {
            return (ArrayList<Member>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

      
}
