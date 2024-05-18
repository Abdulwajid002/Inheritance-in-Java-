public class Account {
     // Set Attributes of Account Class
    private String accountNumber;
    private double balance;

    // Constructor of a Account Class
    public Account(String accountNumber, double balance){
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
    }

    // getter of Account Number
    public String getAccountNumber() {
        if (this.accountNumber == null)
            return "Name is not Set";
        else
            return accountNumber;
    }

    // getter of a Balance
    public double getBalance() {
        if (this.balance == 0) {
            System.out.println("Not set Balance of the Account ");
            return 0;
        } else {
            return balance;
        }
    }

    // setter of a Account Number
    public void setAccountNumber(String accountNumber){
        if (accountNumber.length() > 4)
            this.accountNumber = accountNumber;
    }

    // setter of a Balance
    public void setBalance(double balance){
        if (balance >= 0)
            this.balance = balance;
    }

    // deposit amount method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount is " + amount);
    }

    // withdraw amount method
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw amount is " + amount);
        } else {
            System.out.println("Insufficient funds! ");
        }
    }

    // current balance check method
    public void checkBalance() {
        System.out.println("Account balance is " + balance);
    }


}
