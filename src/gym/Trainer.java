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
    

    public Trainer() {
        super();
        this.role = "Trainer";
    }

    public Trainer(String role, String name, int age, String gender, String address, String email, String phoneNumber) {
        super(role, name, age, gender, address, email, phoneNumber);
        this.employeeId = employeeId;
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
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
    public String toString() {
        return employeeId+ ", "+name+ ", "+role+ ", "+age+ ", "+gender+ ", "+address+ ", "+phoneNumber;
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
        return false;
    }
    
    
    
}
