package optional.todoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ToDo todoList = new ToDo();

        boolean exit = false;

        while (!exit) {
            System.out.println(ConsoleColors.CYAN + "\nTo-Do List\n\n" + ConsoleColors.RESET +
                    "What would you like to do?\n" +
                    "1. Add a task " + ConsoleColors.GREEN + "\u002B\n" + ConsoleColors.RESET +
                    "2. Remove a task " + ConsoleColors.GREEN + "\u2613\n" + ConsoleColors.RESET +
                    "3. Mark a task completed " + ConsoleColors.GREEN + "\u2713\n" + ConsoleColors.RESET +
                    "4. View tasks " + ConsoleColors.GREEN + "\u2317\n" + ConsoleColors.RESET +
                    "5. Export list " + ConsoleColors.GREEN + "\u20D5\n" + ConsoleColors.RESET +
                    "0. Exit " + ConsoleColors.RED + "\u20D4\n" + ConsoleColors.RESET);

            if (scanner.hasNextInt()) {

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("What would you like to add to the list?");
                        String task = scanner.nextLine();
                        todoList.addTask(task);
                        break;
                    case 2:
                        System.out.println("Enter a task index to remove from list: ");
                        int removeTask = scanner.nextInt();
                        scanner.nextLine();
                        todoList.removeTask(removeTask - 1);
                        break;
                    case 3:
                        System.out.println("Enter a task index to mark as complete: ");
                        int completedTask = scanner.nextInt();
                        scanner.nextLine();
                        todoList.markAsComplete(completedTask - 1);
                        break;
                    case 4:
                        todoList.viewList();
                        break;
                    case 5:
                        todoList.exportList();
                        break;
                    case 0:
                        System.out.println(ConsoleColors.WHITE + "Good-bye" + ConsoleColors.RESET);
                        exit = true;
                        break;
                    default:
                        System.out.println(ConsoleColors.YELLOW + "Invalid entry" + ConsoleColors.RESET);
                        break;
                }

            } else {
                System.out.println(ConsoleColors.YELLOW + "Invalid entry" + ConsoleColors.RESET);
                scanner.nextLine();
            }
        }

    }
}
