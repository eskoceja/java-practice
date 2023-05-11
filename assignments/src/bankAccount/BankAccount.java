package bankAccount;

public class BankAccount {
    //attributes: balance and name
    private String accountHolderName;
    private double accountBalance;
    //takes 2 attributes
    public BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.accountBalance = balance;
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
        System.out.println(this.accountHolderName + " has a balance of: " + this.accountBalance);
    }

}

//main class to call in the other functions:
class Main{
    public static void main(String[] args) {
        BankAccount QueenC = new BankAccount("Queen Charlotte", 500);
        QueenC.deposit(100);
        QueenC.printAccountDetails();

        BankAccount EloiseB = new BankAccount("Eloise Bridgerton", 5000);
        BankAccount PenelopeF = new BankAccount("Penelope Featherington", 300);

        EloiseB.withdrawal(100);
        PenelopeF.deposit(100);

        EloiseB.printAccountDetails();
        PenelopeF.printAccountDetails();

    }
}

