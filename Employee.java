// Abstract class representing any employee in our system
public abstract class Employee implements Payable {

    private int empId;          // Employee ID
    private String empName;     // Employee Name

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    // Getter for Employee ID
    public int getEmpId() {
        return empId;
    }

    // Getter for Employee Name
    public String getEmpName() {
        return empName;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Display employee info
    public void display() {
        System.out.println("Employee ID: " + empId + ", Name: " + empName);
    }

    // Prepare string to save in file
    public abstract String toFileString();
}