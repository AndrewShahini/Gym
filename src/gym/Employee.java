/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import static gym.Gym.employees;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author shahi
 */
public class Employee extends Person {
    protected static int count = 1;
    protected String employeeId;
    protected String role;
    private static final long serialVersionUID = 8442110548024887292L; 
    

    public Employee() {
    super();
    this.role = "";
    this.employeeId = "";
    }

    public Employee(String role, String name, int age, String gender, String address, String email, String phoneNumber) {
      super(name, age, gender, address, email, phoneNumber);
      this.employeeId = String.valueOf(count++);
      this.role = role;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.employeeId);
        hash = 53 * hash + Objects.hashCode(this.role);
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

       public static void addEmployee(Employee employee) {
        employees.add(employee); //adds it to the ArrayList<Employees>
        Employee.saveEmployeeList("employees.ser"); //automatically saves it
    }
    
    //serialize method
    public static void saveEmployeeList(String path) {
        try (
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(employees);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //deserialization method
    public static ArrayList<Employee> loadEmployeeList() {
        try (
            FileInputStream fis = new FileInputStream("employees.ser");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            employees = (ArrayList<Employee>) ois.readObject();
            if (!employees.isEmpty()) {
                count = Integer.parseInt(employees.get(employees.size() - 1).employeeId) + 1;            
            }             // Update the count to continue from the last employeeId
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }
    @Override
    public String toString() {
        return employeeId + ", "+name+ ", "+role+ ", "+age+ ", "+gender+ ", "+address+ ", "+phoneNumber+ ", "+email; 
    }
    
}