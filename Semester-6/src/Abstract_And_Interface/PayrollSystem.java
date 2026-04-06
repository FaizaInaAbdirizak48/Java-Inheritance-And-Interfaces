package Abstract_And_Interface;

// Main class to test payroll system
public class PayrollSystem {
    public static void main(String[] args) {
        // Create a full-time employee with ID 1 and salary 5000
        FullTimeEmployee fullTime = new FullTimeEmployee(1, 5000);

        // Create a part-time employee with ID 2 and salary 2000
        PartTimeEmployee partTime = new PartTimeEmployee(2, 2000);

        System.out.println("----Processing Full Time Employee----");
        System.out.println();
        fullTime.calculateBonus();   // Calculate bonus for full-time employee
        fullTime.calculateTax();     // Calculate tax for full-time employee
        fullTime.calculateSalary();  // Calculate final salary for full-time employee

        System.out.println("----Processing Part Time Employee----");
        partTime.calculateTax();     // Calculate tax for part-time employee
        partTime.calculateSalary();  // Calculate final salary for part-time employee
    }
}