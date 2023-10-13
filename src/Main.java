import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        manager.setFirstName(firstName);

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();
        manager.setLastName(lastName);

        System.out.println("Enter employee ID:");
        int employeeID = scanner.nextInt();
        manager.setEmployeeID(employeeID);
        
        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();
        manager.setSalary(salary);

        scanner.nextLine();
        System.out.println("Enter department:");
        String department = scanner.nextLine();
        manager.setDepartment(department);

        manager.employeeSummary();
        scanner.close();
    }
}