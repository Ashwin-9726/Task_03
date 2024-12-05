// DriverMain class to interact with the user and print taxes
import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);

        // Get Employee information from user
        System.out.println("Enter Employee details:");
        System.out.print("Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();  // Consume newline left-over
        System.out.print("Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Employee Salary: ");
        double salary = sc.nextDouble();
         //creating employee object and initializing with user input
        Employee emp =new Employee(empId,name,salary);

        // Get Product information from user
        System.out.println("\nEnter Product details:");
        System.out.print("Product ID: ");
        int pid = sc.nextInt();
        System.out.print("Product Price: ");
        double price = sc.nextDouble();
        System.out.print("Product Quantity: ");
        int quantity = sc.nextInt();
        //creating product object and initializing with user input
        Product pro = new Product(pid,price,quantity);

        // Calculate and display the taxes
        double incomeTax = emp.calculateTax();
        double salesTax = pro.calculateTax();

        System.out.println("\nTax Calculation Results:");
        System.out.println("Income Tax for Employee (" + emp.getName() + "): $" + incomeTax);
        System.out.println("Sales Tax for Product ID " + pro.getPid() + ": $" + salesTax);

        sc.close();

    }
}
