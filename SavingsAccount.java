public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  public void checkBalance(){
    System.out.println("Hello! \nYour balance is " + balance);
  }
  public void deposit(int amountToDeposit){
    balance += amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);
  }

  public void withdraw(int amountToWithdraw){
    balance -= amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();


  
    //Deposit:
    savings.deposit(700);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance); 
    
      
    savings.withdraw(40);
    
  }       
}
