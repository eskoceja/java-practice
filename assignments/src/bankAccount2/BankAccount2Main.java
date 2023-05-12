package bankAccount2;
import java.util.Scanner;
import java.util.ArrayList;

public class BankAccount2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount2> accountList = new ArrayList<>();

        //From Bank Account Part 1
        BankAccount2 QueenC = new BankAccount2("Queen Charlotte", 500, 0);
        QueenC.deposit(100);
//      QueenC.printAccountDetails();

        BankAccount2 EloiseB = new BankAccount2("Eloise Bridgerton", 5000, 1);
        BankAccount2 PenelopeF = new BankAccount2("Penelope Featherington", 300, 3);

        EloiseB.withdrawal(100);
        PenelopeF.deposit(100);

//        EloiseB.printAccountDetails();
//        PenelopeF.printAccountDetails();

        accountList.add(QueenC);
        accountList.add(EloiseB);
        accountList.add(PenelopeF);

        //Bank Account Part 2

        BankAccount2 currentAccount = new BankAccount2();
        currentAccount.setAccountNumber(4);
        accountList.add(currentAccount);

        //testing main menu
        mainMenu(QueenC, accountList);

    }
    public static void mainMenu(BankAccount2 currentAccount, ArrayList<BankAccount2> accountList) {
    Scanner scanner = new Scanner(System.in);

    while(true) {
        System.out.println("Hello " + currentAccount.getAccountHolderName() + "!");
        System.out.println("Welcome to the Main Menu, what would you like to do today? \n" +
                "1. Check Account Balance \n" +
                "2. Make A Withdrawal \n" +
                "3. Make A Deposit \n" +
                "4. Make A Transfer To Another Account \n" +
                "0. Exit Main Menu");

        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                currentAccount.printAccountDetails();
                break;
            case 2:
                System.out.println("How much would you like to withdrawal?");
                double withdrawalAmt = scanner.nextDouble();
                currentAccount.withdrawal(withdrawalAmt);
                currentAccount.printAccountDetails();
                break;
            case 3:
                System.out.println("How much would you like to deposit?");
                double depositAmt = scanner.nextDouble();
                currentAccount.deposit(depositAmt);
                currentAccount.printAccountDetails();
                break;
            case 4:
                System.out.println("Enter the account number you wish to transfer money to: ");
                int transferAcctNumber = scanner.nextInt();

                BankAccount2 transferAccount = findAcct(transferAcctNumber, accountList);

                if(transferAccount == null) {
                    System.out.println("Account doesn't exist");
                    break;
                }
                System.out.println("Please enter the amount to transfer: ");
                double transferAmt = scanner.nextDouble();

                currentAccount.transfer(transferAccount, transferAmt);
                break;

            case 0:
                System.out.println("We appreciate your loyalty to El Banco. Goodbye!");
                return;
            default:
                System.out.println("Enter a valid option (1-4; or 0 to exit)");
                break;

        }

    }

    }

    //find acct for option 4
    public static BankAccount2 findAcct(int acctNumber, ArrayList<BankAccount2> accountList) {
        for ( BankAccount2 account: accountList) {
            if(account.getAccountNumber() == acctNumber) {
                return account;
            }
        }
        return null;
    }
}
