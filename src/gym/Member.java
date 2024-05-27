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
    public String payMethod;

    public Member() {
        super();
        this.memberId = "";
        this.membership = "";
        this.payMethod = "";
    }

    public Member(String name, int age, String gender, String address, String email, String phoneNumber,String membership,String payMethod) {
        super(name, age, gender, address, email, phoneNumber);
        this.memberId = String.valueOf(count++);
        this.membership = membership;
        this.payMethod = payMethod;
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

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.memberId);
        hash = 29 * hash + Objects.hashCode(this.membership);
        hash = 29 * hash + Objects.hashCode(this.payMethod);
        return hash;
    }
    
    

    @Override
    public String toString() {
        return memberId + ", " + name + ", " + membership+ ", " + gender+ ", " + age + ", " +address+ ", " + email+ ", " + phoneNumber+ ", " +payMethod;
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
        if (!Objects.equals(this.memberId, other.memberId)) {
            return false;
        }
        if (!Objects.equals(this.membership, other.membership)) {
            return false;
        }
        return Objects.equals(this.payMethod, other.payMethod);
    }
  
    public static void serialize(String path){ //serialize method
        try {
           FileOutputStream fos = new FileOutputStream(path);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(members);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Member> loadMembers() { //deserializes
        try (
            FileInputStream fis = new FileInputStream("member.ser");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            members = (ArrayList<Member>) ois.readObject();
            if (!members.isEmpty()) {
                count = Integer.parseInt(members.get(members.size() - 1).memberId) + 1;            
            }      
            return members;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void addMember(Member member) {
        members.add(member); //adds it to the ArrayList<Member>
        Member.serialize("member.ser"); //serializes the new member
    }
      
}
