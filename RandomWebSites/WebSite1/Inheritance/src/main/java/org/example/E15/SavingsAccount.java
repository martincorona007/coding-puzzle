package org.example.E15;

public class SavingsAccount extends  BankAccount{

    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber,balance);
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() - amount < 100){
            System.out.println("Minimum balance of $100 required!");
        }else{
            super.withdraw(amount);
        }
    }
    //    double balance = 0;
//    @Override
//    public double withdraw(double amount) {
//        if(balance < 100){
//            System.out.println("You cannot withdraw money");
//        }else{
//            return balance - amount;
//        }
//    }
}
