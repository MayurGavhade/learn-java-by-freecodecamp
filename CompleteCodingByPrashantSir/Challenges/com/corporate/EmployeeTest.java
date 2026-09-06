package com.corporate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Mayur Gavhade");
        employee1.setAge(18);
        employee1.setSalary(30000);

        employee1.displayEmployeeDetails();
    }
}
