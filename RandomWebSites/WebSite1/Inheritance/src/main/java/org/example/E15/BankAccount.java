package org.example.E15;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance+= amount;
    }
    public void withdraw(double amount){
        if(balance >=  amount){
            balance -= amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance(){
        return balance;
    }
//    double money = 0;
//    public BankAccount(){
//
//    }
//    public double withdraw(double withdraw){
//        return this.money - withdraw;
//    }
//    public String deposit(){
//        return "Deposit money";
//    }
}
