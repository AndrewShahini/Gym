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
    }

    public Manager(int employeeId, String role, String name, int age, String gender, String address) {
        super(employeeId, role, name, age, gender, address);
        this.username = "Andrew";
        this.password = "123456";
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

    	public boolean validateLogin(String userName, String password){
            boolean loginSuccessful = false;
            if(userName.equals("Andrew")){
                if(password.equals("123456")){
                    loginSuccessful= true;
                }
            }
            return loginSuccessful;
	}

    
}
