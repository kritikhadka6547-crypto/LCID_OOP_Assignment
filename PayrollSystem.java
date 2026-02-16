import java.util.*;

public class PayrollSystem {

    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        employeeList = DataHandler.loadData();

        int choice;
        do {
            System.out.println("=== Employee Payroll System ===");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Save & Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addFullTimeEmployee(); break;
                case 2: addPartTimeEmployee(); break;
                case 3: displayEmployees(); break;
                case 4: 
                    DataHandler.saveData(employeeList); 
                    System.out.println("Exiting program. Have a GoodDay!");
                    break;
                default: System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
    }

    // Add Full-Time Employee
    private static void addFullTimeEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employeeList.add(new FullTimeEmployee(id, name, salary));
        System.out.println("Full-Time Employee added!\n");
    }

    // Add Part-Time Employee
    private static void addPartTimeEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Hours Worked: ");
        int hours = sc.nextInt();
        System.out.print("Enter Hourly Rate: ");
        double rate = sc.nextDouble();

        employeeList.add(new PartTimeEmployee(id, name, hours, rate));
        System.out.println("Part-Time Employee added!\n");
    }

    // Display Employees
    private static void displayEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.\n");
            return;
        }

        System.out.println("\n=== Employee List ===");
        for (Employee emp : employeeList) {
            emp.display();
        }
    }
}