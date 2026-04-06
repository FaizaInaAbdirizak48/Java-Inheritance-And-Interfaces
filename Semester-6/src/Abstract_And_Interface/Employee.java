package Abstract_And_Interface;

// Abstract class for all employees
abstract class Employee {
    int employeeId;   // Stores the employee's ID
    double salary;    // Stores the employee's salary

    // Constructor to initialize employee ID and salary
    public Employee(int employeeId, double salary) {
        this.employeeId = employeeId; // Set employee ID
        this.salary = salary;         // Set initial salary
    }

    // Abstract method to calculate salary (must be implemented by subclasses)
    abstract void calculateSalary();
}

// Interface for employees who pay tax
interface Taxable {
    void calculateTax(); // Method to calculate tax
}

// Interface for employees who can get bonus
interface BonusEligible {
    void calculateBonus(); // Method to calculate bonus(gunno)
}

// Full-time employee class that can get bonus and pay tax (cashuur)
class FullTimeEmployee extends Employee implements Taxable, BonusEligible {
    double bonus; // Stores bonus amount

    // Constructor for FullTimeEmployee
    public FullTimeEmployee(int employeeId, double salary) {
        super(employeeId, salary); // Call parent constructor to set ID and salary
    }

    // Calculate salary including bonus
    @Override
    void calculateSalary() {
        salary += bonus; // Add bonus to salary
        System.out.println("FullTimeEmployee Salary: " + salary); // Print final salary
    }

    // Calculate tax for full-time employee
    @Override
    public void calculateTax() {
        double tax = salary * 0.2; // Tax is 20% of salary
        salary -= tax;              // Deduct tax from salary
        System.out.println("FullTimeEmployee Tax: " + tax); // Print tax amount
    }

    // Calculate bonus for full-time employee
    @Override
    public void calculateBonus() {
        bonus = salary * 0.1; // Bonus is 10% of salary
        System.out.println("FullTimeEmployee Bonus: " + bonus); // Print bonus amount
    }
}

// Part-time employee class that only pays tax
class PartTimeEmployee extends Employee implements Taxable {
    // Constructor for PartTimeEmployee
    public PartTimeEmployee(int employeeId, double salary) {
        super(employeeId, salary); // Call parent constructor to set ID and salary
    }

    // Calculate salary (no bonus for part-time employee)
    @Override
    void calculateSalary() {
        System.out.println("PartTimeEmployee Salary: " + salary); // Print salary
    }

    // Calculate tax for part-time employee
    @Override
    public void calculateTax() {
        double tax = salary * 0.1; // Tax is 10% of salary
        salary -= tax;              // Deduct tax from salary
        System.out.println("PartTimeEmployee Tax: " + tax); // Print tax amount
    }
}

