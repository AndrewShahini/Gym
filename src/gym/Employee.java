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
public class Employee extends Person{
    protected static int count;
    protected int employeeId;
    protected String role;

    public Employee() {
    super();
    this.role = "";
    }
    
    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }
    
    public Employee(int employeeId, String role) {
        this.employeeId = employeeId;
        this.role = role;
    }

    public Employee(int employeeId, String role, String name, int age, String gender, String address, String email, String phoneNumber) {
        super(name, age, gender, address, email, phoneNumber);
        this.employeeId = count++;
        this.role = role;
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
        int hash = 5;
        hash = 41 * hash + this.employeeId;
        hash = 41 * hash + Objects.hashCode(this.role);
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
        final Employee other = (Employee) obj;
        if (this.employeeId != other.employeeId) {
            return false;
        }
        return Objects.equals(this.role, other.role);


    }

    
    
}