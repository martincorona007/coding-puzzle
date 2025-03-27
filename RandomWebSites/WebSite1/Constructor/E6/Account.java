interface Notes{
//   Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:
// accountNumber should be non-null and non-empty.
// balance should be non-negative.
// Print an error message if the validation fails.
}
public class Account{
  private String accountNumber;
  private double balance;
  //first approach not good
  // public Account(String accountNumber, double balance){
  //   if(accountNumber != null && accountNumber != ""){
  //     this.accountNumber = accountNumber;
  //   }else{
  //     System.out.println("Error account number");
  //   }
  //   if(balance < 0){
  //     System.out.println("balance should be non-negative");
  //   }else{
  //     this.balance = balance;
  //   }
  // }
  //secound approach good
  // public Account(String accountNumber, double balance){
  //   if(accountNumber == null || accountNumber.isEmpty()){
  //     System.err.println("Error account number");
  //     return;
  //   }
  //   if(balance < 0){
  //     System.err.println("balance should be non-negative");
  //     return;
  //   }
  //   this.accountNumber = accountNumber;
  //   this.balance = balance;
  // }
  //secound approach good
  public Account(String accountNumber, double balance){
    if(accountNumber == null || accountNumber.isEmpty()){
      
      throw new IllegalArgumentException("Error account number");
    }
    if(balance < 0){
      throw new IllegalArgumentException("Balance should be non-negative");
    }
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public String getAccountNumber(){
    return accountNumber;
  }
  public double balance(){
    return balance;
  }
  public static void main(String[]args){
    Account ac1 = new Account("",1);
    Account ac3 = new Account("42",-1);

    Account ac2 = new Account("943782",1);
    
  }
}