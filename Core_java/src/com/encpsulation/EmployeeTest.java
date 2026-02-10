package com.encpsulation;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John", 5000);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        employee.setId(2);
        employee.setName("Jane");
        employee.setSalary(6000);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        

    }

}
