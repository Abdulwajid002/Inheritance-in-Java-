import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For Account Class
        System.out.println("Enter bank name for Account:");
        String accountBankName = scanner.nextLine();
        System.out.println("Enter initial balance for Account:");
        double accountInitialBalance = scanner.nextDouble();
        Account account = new Account(accountBankName, accountInitialBalance);

        // For Saving Account Class
        System.out.println("Enter bank name for Savings Account:");
        String savingsBankName = scanner.nextLine();
        savingsBankName = scanner.nextLine();
        System.out.println("Enter initial balance for Savings Account:");
        double savingsInitialBalance = scanner.nextDouble();
        System.out.println("Enter interest rate for Savings Account:");
        double savingsInterestRate = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsBankName, savingsInitialBalance, savingsInterestRate);

        // For Current Account Class
        System.out.println("Enter bank name for Current Account:");
        String currentBankName = scanner.nextLine();
        currentBankName = scanner.nextLine();
        System.out.println("Enter initial balance for Current Account:");
        double currentInitialBalance = scanner.nextDouble();
        System.out.println("Enter overdraft limit for Current Account:");
        double currentOverdraftLimit = scanner.nextDouble();
        CurrentAccount currentAccount = new CurrentAccount(currentBankName, currentInitialBalance, currentOverdraftLimit);

        // For Account Class
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.print("Enter amount to withdraw from Account: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.print("Enter amount to deposit into Account: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        account.checkBalance();


        // For Saving Account Class
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: " + savingsAccount.getBalance());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate());
        System.out.print("Enter amount to withdraw from Savings Account: ");
        withdrawAmount = scanner.nextDouble();
        savingsAccount.withdraw(withdrawAmount);
        System.out.print("Enter amount to deposit into Savings Account: ");
        depositAmount = scanner.nextDouble();
        savingsAccount.deposit(depositAmount);
        System.out.print("Enter amount to calculate interest on: ");
        double amountForInterest = scanner.nextDouble();
        savingsAccount.calculateInterest(amountForInterest);
        savingsAccount.checkBalance();


        // For Current Account Class
        System.out.println("Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Balance: " + currentAccount.getBalance());
        System.out.println("Overdraft Limit: " + currentAccount.getOverdraftLimit());
        System.out.print("Enter amount to withdraw from Current Account: ");
        withdrawAmount = scanner.nextDouble();
        currentAccount.withdraw(withdrawAmount);
        System.out.print("Enter amount to deposit into Current Account: ");
        depositAmount = scanner.nextDouble();
        currentAccount.deposit(depositAmount);
        System.out.println("Enter amount to withdraw from overdraft : ");
        withdrawAmount = scanner.nextDouble();
        currentAccount.withdraw(withdrawAmount);
        currentAccount.checkBalance();

        scanner.close();
    }
}


