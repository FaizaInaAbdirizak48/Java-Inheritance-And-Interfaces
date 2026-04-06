package Inheri_Poly_EX;

class BankAccount {
    double balance;

    void showBalance(){
        System.out.println("Balance : "+balance);
    }
}

// ========== Child class 1 =======
class  SavingsAccount extends BankAccount{
    @Override
    void showBalance() {
        System.out.println("Saving account balance $: "+balance);
    }
}


// ============== Child class 2 =====
class CheckingAccount extends BankAccount{
    @Override
    void showBalance(){
        System.out.println("Checking account balance $ : "+balance);
    }

}