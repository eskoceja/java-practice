package udemy.ExpenseTracker;

import java.util.Scanner;

public class ExpenseTrackerApp {
    public static void main(String[] args) {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);
        int option;

        do{

            System.out.println("Expense Tracker Menu: \n" +
                    "1. Add Expense \n" +
                    "2. View Expenses \n" +
                    "3. Calculate Total Expenses \n" +
                    "4. Generate An Expense Report \n" +
                    "5. Exit \n" +
                    "Enter choice below: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the date: ");
                    String date = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("Enter a category: ");
                    String category = scanner.nextLine();

                    System.out.println("Enter an amount in $: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Enter a description: ");
                    String description = scanner.nextLine();


                    Expense expense = new Expense(date, category, amount, description);
                    expenseTracker.addExpenses(expense);
                    break;
                case 2:
                    expenseTracker.viewExpenses();
                    break;
                case 3:
                    double totalExpenses = expenseTracker.calculateTotalExpenses();
                    System.out.println("Total expenses: $" + totalExpenses);
                    break;
                case 4:
                    expenseTracker.generateExpenseReports();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Enter a number 1-5");
            }
            System.out.println();
        } while(!(option == 5)) ;{
            scanner.close();
        }


    }
}
