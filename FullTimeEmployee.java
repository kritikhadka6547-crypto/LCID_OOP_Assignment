// Full-Time Employee class
public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(int empId, String empName, double monthlySalary) {
        super(empId, empName);
        this.monthlySalary = monthlySalary;
    }

    // Calculate salary
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    // Display info including salary
    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + monthlySalary);
        System.out.println("-------------------------");
    }

    // Format for saving in file
    @Override
    public String toFileString() {
        return "FULL," + getEmpId() + "," + getEmpName() + "," + monthlySalary;
    }
}