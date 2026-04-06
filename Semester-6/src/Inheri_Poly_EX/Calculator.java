package Inheri_Poly_EX;

 class Calculator {
    int divide(int a, int b) throws ArithmeticException {
        return a / b; // may throw exception
    }
}

// Child class
class SafeCalculator extends Calculator {
    @Override
    int divide(int a, int b) {
        try {
            return super.divide(a, b); // use parent method
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            return 0; // return default value
        }
    }
}
