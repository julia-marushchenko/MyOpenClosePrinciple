/**
 * Java program to demonstrate the second principle SOLID open close principle.
 */

package com.example;

/**
 * Employee class with Single Responsibility Principle.
 */
public class Employee implements com.ocp.Employee {

    // JVM entry point.
    public static void main(String[] args) {

        // Create employee with manager position.
        Employee employee = new Employee(5000);

        // Create employee with developer position.
        Employee employee1 = new Employee(4000);

        // Create employee with intern position.
        Employee employee2 = new Employee(2000);

        // Calculating bonus for each employee and printing it to console.
        System.out.println(employee.calculateBonus( "manager"));
        System.out.println(employee.calculateBonus( "developer"));
        System.out.println(employee.calculateBonus( "intern"));

    }

    // Fields of the class Employee.
    double salary;


    // Constructor of the class Employee.
    public Employee(int salary) {
        this.salary = salary;
    }

    // Method to calculate bonus for employee.
    public double calculateBonus(String employee) {
        if (employee.equals("manager")) {
            return calculateForManager();
        } else if(employee.equals("developer")) {
            return calculateForDeveloper();
        } else {
            return calculateForIntern();
        }
    }

    // Method to calculate salary bonus for Manager.
    public double calculateForManager() {
        return this.salary * 0.2;
    }
    // Method to calculate salary bonus for Developer.
    public double calculateForDeveloper() {
        return this.salary * 0.1;
    }
    // Method to calculate salary bonus for Intern.
    public double calculateForIntern() {
        return this.salary * 0.05;
    }
}