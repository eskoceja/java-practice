package optional.todoList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ToDo {
    private static List<String> tasks;
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd HH:mm:ss");

    public ToDo() {
        tasks = new ArrayList<>();
    }

    //add
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added to list: " + task);
    }

    //remove
    public void removeTask(int index) {
        if (index >= 0 && index <= tasks.size()) {
            String task = tasks.remove(index);
            System.out.println("Task removed from list: " + task);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    //view
    public void viewList() {
        if (tasks.isEmpty()) {
            System.out.println("Nothing in to-do list");
        } else {
            System.out.println("Tasks: ");
            for (String task : tasks) {
                System.out.println(" - " + task);
            }
        }
    }

    //mark as complete
    public void markAsComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            String task = tasks.get(index);
            tasks.set(index, task + " ✓");
            System.out.println("Task completed: " + task);
        } else {
            System.out.println(ConsoleColors.YELLOW + "Invalid task index" + ConsoleColors.RESET);
        }
    }

    //export
    public void exportList() {
        LocalDateTime current = LocalDateTime.now();
        String fileName = "To-DoList" + dateTimeFormatter.format(current) + ".txt";
        String filePath = "assignments/src/optional/todoList/" + fileName;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            File file = new File(filePath);
            if (file.exists()) {
                System.out.println(ConsoleColors.GREEN + "List created successfully! \n" + ConsoleColors.RESET);
            } else {
                System.out.println(ConsoleColors.YELLOW + "Failed to create list \n" + ConsoleColors.RESET);
            }

            StringBuilder sb = new StringBuilder();
            if (tasks.isEmpty()) {
                sb.append("Nothing in to-do list");
            } else {
                sb.append("Tasks: \n");
                for (String task : tasks) {
                    sb.append(" - ").append(task).append("\n");
                }
            }

            writer.write(sb.toString());

            writer.flush();

            System.out.println(ConsoleColors.GREEN + "List exported successfully!" + ConsoleColors.RESET);

        } catch (IOException e) {
            System.out.println(ConsoleColors.RED + "Unsuccessful export: " + e.getMessage() + ConsoleColors.RESET);
        }

    }


}
