package IOProject;

import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SimpleFileManager {
    //format date and time
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); //thank you for this Eric!!

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String directoryPath = "assignments/src/IOProject/SimpleFileManager.java";

        System.out.println("You are in the I/O Project Directory \n" +
                "There are 2 files in here that you can manage \n" +
                "input1.txt: 'assignments/src/IOProject/input1.txt' \n" +
                "input2.txt: 'assignments/src/IOProject/input2.txt' \n");

        try {
            //checking directory path
            Path dirPath = Paths.get(directoryPath);
            if(!Files.isDirectory(dirPath)) {
                System.out.println("Invalid directory path");
                return;
            }

            //menu options
            boolean exit = false;



        } catch (InvalidPathException e) {
            System.out.println("Invalid path: " + e.getMessage());
        }





    }

    //display contents method
    private static void displayDirectoryContents() {

    }


    //copy file method
    private static void copyFile() {

    }


    //move file method
    private static void moveFile() {

    }


    //delete file method
    private static void deleteFile() {

    }


    //create directory method
    private static void createDirectory() {

    }


    //delete directory method
    private static void deleteDirectory() {

    }


    //search for file method
    private static void searchFiles(){

    }


}
