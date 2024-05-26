/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

/**
 *
 * @author shahi
 */
public class Manager extends Employee {
    
    public static String username;
    public static String password;
    
    public Manager() {
        super();
        this.username = "Andrew";
        this.password = "123456";
        this.role = "Manager";
    }

    public Manager(int employeeId) {
        super(employeeId);
        this.username = "Andrew";
        this.password = "123456";  
        this.role = "Manger";
    }

    public Manager(String employeeId, String role, String name, int age, String gender, String address, String email, String phoneNumber) {
        super(employeeId, role, name, age, gender, address, email, phoneNumber);
        this.username = "Andrew";
        this.password = "123456";  
        this.role = "Manger";
    }
    
       public Manager(String employeeId, String role, String name, int age, String gender, String address, String email, String phoneNumber,String username,String password) {
        super(employeeId, role, name, age, gender, address, email, phoneNumber);
        this.username = username;
        this.password = password;
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

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Manager.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Manager.password = password;
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
    public String toString() {
        return employeeId + ", "+name+ ", "+role+ ", "+age+ ", "+gender+ ", "+address+ ", "+phoneNumber+ ", "+email; 
    }

    
}
