// Part-Time Employee class
public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int empId, String empName, int hoursWorked, double hourlyRate) {
        super(empId, empName);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Calculate salary
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    // Display info including salary
    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + calculateSalary());
        System.out.println("-------------------------");
    }

    // Format for saving in file
    @Override
    public String toFileString() {
        return "PART," + getEmpId() + "," + getEmpName() + "," + hoursWorked + "," + hourlyRate;
    }
}
