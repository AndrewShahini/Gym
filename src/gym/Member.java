/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import java.util.Objects;

/**
 *
 * @author shahi
 */
public class Member extends Person {
    
    private static int count = 0;
    private int memberId;
    private String username;
    private String password;
    private String dateOfBirth;

    public Member() {
        super();
    }

    public Member(int memberId, String username, String password, String name, int age, String gender, String address) {
        super(name, age, gender, address);
        this.memberId = count++;
        this.username = username;
        this.password = password;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Member.count = count;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.memberId;
        hash = 59 * hash + Objects.hashCode(this.username);
        hash = 59 * hash + Objects.hashCode(this.password);
        return hash;
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
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }

    
    

    
    
    
}
