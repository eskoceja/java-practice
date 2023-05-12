package bankAccount2;
import java.util.Scanner;
import java.util.ArrayList;

public class BankAccount2 {
    //attributes: balance and name
    private String accountHolderName;
    private double accountBalance;
    private int accountNumber;
    //takes 2 attributes
    public BankAccount2() {
        //for new account
        //takes users name and starting acct balance
        //keep track of accts using array
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to El Banco");
        System.out.println("Are you an existing customer? (-1 to exit) \n" +
                "1. Yes \n" +
                "2. No");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Great! We appreciate your loyalty to El Banco!");
                break;
            case 2:
                System.out.println("What is the name for the account?");
                this.accountHolderName = scanner.nextLine();
                scanner.nextLine();
                System.out.println("What is the beginning balance for the account?");
                this.accountBalance = scanner.nextDouble();
                this.accountNumber = -1;
                break;
            case -1:
                System.out.println("Thanks for stopping by.");
                break;
        }


    }
    public BankAccount2(String name, double balance) {
        this.accountHolderName = name;
        this.accountBalance = balance;
    }
    public BankAccount2(String name, double balance, int accountNumber) {
        this.accountHolderName = name;
        this.accountBalance = balance;
        this.accountNumber = accountNumber;
    }
    //method 1: deposit add amount
    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    //method 2: withdrawal subtracts amount and check for funds
    public void withdrawal(double amount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
        } else {
            System.out.println("You're broke.");
        }
    }

    //method 3: print account details
    public void printAccountDetails() {
        System.out.println("Account Number: "+ this.accountNumber + "\n" +
                "" + this.accountHolderName + " has a balance of: " + this.accountBalance);
    }

    //get name

    public String getAccountHolderName() {
        return accountHolderName;
    }

    //to transfer
    public void transfer(BankAccount2 otherAcct, double amountToTransfer) {
        if(accountBalance < amountToTransfer) {
            System.out.println("Insufficient Balance, BROKE");
        }

        //withdraw
        withdrawal(amountToTransfer);

        //deposit
        otherAcct.deposit(amountToTransfer);

        //print details to show transfer
        printAccountDetails();
        otherAcct.printAccountDetails();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
