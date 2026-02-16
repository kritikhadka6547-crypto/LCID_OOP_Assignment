import java.io.*;
import java.util.*;

// Handles saving and loading employee data
public class DataHandler {

    private static final String FILE_NAME = "employees.txt";

    // Save employee list to the file
    public static void saveData(List<Employee> employeeList) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Employee emp : employeeList) {
                writer.println(emp.toFileString());
            }
            System.out.println("All employees have been saved successfully!");
        } catch (IOException e) {
            System.out.println("Oops! Something went wrong while saving.");
        }
    }

    // Load employee list from the file
    public static List<Employee> loadData() {
        List<Employee> employeeList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals("FULL")) {
                    employeeList.add(new FullTimeEmployee(
                            Integer.parseInt(data[1]),
                            data[2],
                            Double.parseDouble(data[3])
                    ));
                } else if (data[0].equals("PART")) {
                    employeeList.add(new PartTimeEmployee(
                            Integer.parseInt(data[1]),
                            data[2],
                            Integer.parseInt(data[3]),
                            Double.parseDouble(data[4])
                    ));
                }
            }
        } catch (IOException e) {
            System.out.println("No previous data found. Starting fresh.");
        }

        return employeeList;
    }
}