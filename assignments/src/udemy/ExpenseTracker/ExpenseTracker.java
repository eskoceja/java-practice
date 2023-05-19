package udemy.ExpenseTracker;


import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker {
    private List<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpenses(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense added successfully");
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found");
        } else {
            for (Expense expense : expenses) {
                System.out.println("Date: " + expense.getDate() + "\n" +
                        "Category: " + expense.getCategory() + "\n" +
                        "Amount: $" + expense.getAmount() + "\n" +
                        "Description: " + expense.getDescription() + "\n" +
                        "--------------------------------------------");
            }
        }
    }

    public double calculateTotalExpenses() {
        double total = 0;

        for(Expense expense: expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    public void generateExpenseReports() {
        viewExpenses();
    }

}
