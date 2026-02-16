# LCID OOP Employee Payroll System

This is a Java-based console application developed as part of an Object-Oriented Programming assignment. The system calculates salaries for full-time and part-time employees using OOP concepts like inheritance, abstraction, interfaces, and polymorphism.

## Features
 .Add full-time employees
 .Add part-time employees
 .Display employee details and salary
 .Calculate salary automatically based on employee type
 .Save and load employee data to/from a file (`employees.txt`)
 .Interface-based design using `Payable`

## File Structure
LCID_OOP_Assignment/
 src/
     DataHandler.java
     Employee.java
     FullTimeEmployee.java
     PartTimeEmployee.java
     Payable.java
    PayrollSystem.java
 employees.txt
 .gitignore
 README.md


- `.gitignore` – ignores `.class` files
- `employees.txt` – stores employee data
- `.class` files are generated after compilation

## How to Compile and Run

1. Open terminal in the project root (`LCID_OOP_Assignment`).
2. Compile all Java files:

```bash
javac src\*.java

Run the main program:
java src\PayrollSystem

Notes:
All .class files are ignored in Git thanks to .gitignore.
Use the menu to add employees, display them, and save data.
This project is for learning and academic purposes only.