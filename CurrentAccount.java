public class SavingsAccount extends Account{

    // set Attribute of Saving Account Class
    private double interestRate;

    // Constructor of a Saving Account Class
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // inherit Parent class Attributes
        this.setInterestRate(interestRate);
    }

    // getter of Interest Rate
    public double getInterestRate() {
        if (this.interestRate == 0) {
            System.out.println("Not set Interest Rate ");
            return 0;
        } else {
            return interestRate;
        }
    }

    // setter of a Interest Rate
    public void setInterestRate(double interestRate){
        if (interestRate >= 0)
            this.interestRate = interestRate;
    }

    // calculate and add Interest Rate method
    public void calculateInterest(double amount) {
        double interest = getBalance() * interestRate/100;
        deposit(interest);
        System.out.println("Interest Added to the Account " + interest);
    }
}

