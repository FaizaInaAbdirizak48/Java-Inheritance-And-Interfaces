package Inheri_Poly_EX;

public class Main_Tester {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("==========Practice Inheritance========");
        System.out.println();
        student1.name = "Faiza Ina Abdirizak"; // inherited from Person
        student1.grade = 100;

        student1.introduce(); // method from Person
        student1.showGrade(); // method from Student
        System.out.println("=============================================");

        // ========= Displaying Animal class =======
        Dog myDog = new Dog();
        myDog.name = "Mimi";

        myDog.eat();
        myDog.bark();
        System.out.println();

        System.out.println("=============================================");
        //======= City class ==========
        CapitalCity city1 = new CapitalCity();
        city1.name = "Mogadishu";
        city1.population = 2000000;
        city1.country = "Somalia";

        city1.showInfo();
        city1.showCapitalCity();

        System.out.println();
        System.out.println("=============================================");
        System.out.println("==========Practice Inheritance and Polymorphism ========");

        //======= BankAccount class ==========
        BankAccount acc1 = new SavingsAccount();
        acc1.balance = 5000;

        BankAccount acc2 = new CheckingAccount();
        acc2.balance = 2000;

        acc1.showBalance();
        acc2.showBalance();


        System.out.println();
        System.out.println("=============================================");
        Calculator calc = new SafeCalculator(); // polymorphism
        int result = calc.divide(10, 0);       // division by zero
        System.out.println("Result: " + result);



    }
}
