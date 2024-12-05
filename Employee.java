// Employee class implementing the Taxable interface

public class Employee implements Taxable{
   private int empID;
   private String name;
   private Double salary;
    // Constructor to initialize employee details
    public Employee(int empID, String name, Double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }
    // Getter methods for Employee class
    public int getEmpID() {
        return empID;
    }
    public String getName() {
        return name;
    }
    public Double getSalary() {
        return salary;
    }
    // Method to calculate income tax on the yearly salary
    public double calculateTax(){
    return salary * incomeTax;
    }
}
