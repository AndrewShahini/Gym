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
public class Trainer extends Employee{
    
    private String specialist;

    
    
    public Trainer(String specialist) {
        this.specialist = specialist;
    }

    public Trainer(String specialist, int employeeId, String role) {
        super(employeeId, role);
        this.specialist = specialist;
    }

    public Trainer(String specialist, int employeeId, String role, String name, int age, String gender, String address) {
        super(employeeId, role, name, age, gender, address);
        this.specialist = specialist;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
        hash = 41 * hash + Objects.hashCode(this.specialist);
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
        final Trainer other = (Trainer) obj;
        return Objects.equals(this.specialist, other.specialist);
    }
    
    
    
}
