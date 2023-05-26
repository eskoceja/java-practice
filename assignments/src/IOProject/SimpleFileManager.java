package IOProject;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//***RERUN THE MAIN METHOD TO SEE THE CHANGES MADE***//
public class SimpleFileManager {
    //format date and time
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); //thank you for this Eric!!

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String directoryPath = "assignments/src/IOProject"; //path to this directory from src - please work in here only

        System.out.println("\nYou are in the I/O Project Directory \n" +
                "There are two files and one directory in here that you can manage \n" +
                "(The requirements.txt is where I outlined the work for this project, please do not modify that one or this class ofc) \n");

        try {
            //checking if directory path exists
            Path dirPath = Paths.get(directoryPath);
            if (!Files.isDirectory(dirPath)) {
                System.out.println("Invalid directory path");
                return;
            }

            //menu options
            boolean exit = false;
            while (!exit) {
                System.out.println("Select an option below: \n" +
                        "1. Display Directory Content \n" +
                        "2. Copy a file \n" +
                        "3. Move a file \n" +
                        "4. Delete a file \n" +
                        "5. Create a directory \n" +
                        "6. Delete a directory \n" +
                        "7. Search for a file by name " + "\n" +
                        "8. Search for a file by extension \n" +
                        "9. Exit ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1: //display directory contents
                        displayDirectoryContents(dirPath);
                        break;
                    case 2: //copy a file
                        System.out.println("Enter the source file name to copy: ");
                        String copySourceFile = scanner.nextLine();
                        System.out.println("Enter the target: ");
                        String copyTargetFile = scanner.nextLine();
                        copyFile(dirPath.resolve(copySourceFile), dirPath.resolve(copyTargetFile));
                        break;
                    case 3: //move a file
                        System.out.println("Enter the source file name to move: ");
                        String moveSourceFile = scanner.nextLine();
                        System.out.println("Enter the target: ");
                        String moveTargetFile = scanner.nextLine();
                        moveFile(dirPath.resolve(moveSourceFile), dirPath.resolve(moveTargetFile));
                        break;
                    case 4: //delete a file
                        System.out.println("Enter a file name to delete: ");
                        String fileToDelete = scanner.nextLine();
                        deleteFile(dirPath.resolve(fileToDelete));
                        break;
                    case 5: //create directory
                        System.out.println("Enter a name for a new directory: ");
                        String newDir = scanner.nextLine();
                        createDirectory(dirPath.resolve(newDir));
                        break;
                    case 6: //delete directory
                        System.out.println("Enter the name of the directory you wish to delete: ");
                        String deleteDir = scanner.nextLine();
                        deleteDirectory(dirPath.resolve(deleteDir));
                        break;
                    case 7: //search by file name
                        System.out.println("Enter a file name to search for: ");
                        String fileName = scanner.nextLine();
                        searchFilesByName(dirPath, fileName);
                        break;
                    case 8: //search by extension
                        System.out.println("Enter the file extension to search for: ");
                        String fileExtension = scanner.nextLine();
                        searchFilesByExtension(dirPath, fileExtension);
                        break;
                    case 9: //exit
                        System.out.println("Exiting. Good bye.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }

            }

        } catch (InvalidPathException e) {
            System.out.println("Invalid path: " + e.getMessage());
        }

    }

    //display contents method
    private static void displayDirectoryContents(Path dirPath) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath)) {
            System.out.println("Directory Contents: ");

            for (Path entry : stream) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class); //getting attribute for entry
                String type = attributes.isDirectory() ? "DIR" : "FILE"; //checking if file or directory
                long size = attributes.size(); //getting size
                LocalDateTime lastModified = LocalDateTime.ofInstant(attributes.lastModifiedTime().toInstant(), ZoneOffset.UTC); //last modified date and time to instant
                System.out.println("File name: " + entry.getFileName() + "\n" + //displaying directory content
                        "Type: " + type + "\n" +
                        "Size: " + size + "\n" +
                        "Last modified: " + lastModified.format(formatter) + "\n");
            }

        } catch (IOException e) {
            System.out.println("Unable to read directory contents: " + e.getMessage());
        }
    }

    //copy file method
    private static void copyFile(Path dirPath, Path target) {
        try {
            Files.copy(dirPath, target, StandardCopyOption.REPLACE_EXISTING); //copying file
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Unable to copy file: " + e.getMessage());
        }
    }

    //move file method
    private static void moveFile(Path dirPath, Path target) {
        try {
            Files.move(dirPath, target, StandardCopyOption.REPLACE_EXISTING); //moving file
            System.out.println("File moved successfully");
        } catch (IOException e) {
            System.out.println("Unable to move file: " + e.getMessage());
        }
    }

    //delete file method
    private static void deleteFile(Path file) {
        try {
            Files.delete(file); //deleting file
            System.out.println("File deleted successfully");
        } catch (IOException e) {
            System.out.println("Unable to delete file: " + e.getMessage());
        }
    }

    //create directory method
    private static void createDirectory(Path dir) {
        try {
            Files.createDirectory(dir); //creating directory with the file name entered
            System.out.println("Directory created successfully");
        } catch (IOException e) {
            System.out.println("Unable to create a new directory: " + e.getMessage());
        }
    }

    //delete directory method
    private static void deleteDirectory(Path dir) {
        try {
            Files.delete(dir);
            System.out.println("Directory deleted successfully");
        } catch (IOException e) {
            System.out.println("Unable to delete directory: " + e.getMessage());
        }
    }

    //search by name
    private static void searchFilesByName(Path dir, String fileName) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, fileName)) {
            System.out.println("Search by name results:");
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Unable to find file by name: " + e.getMessage());
        }
    }

    //search by extension
    private static void searchFilesByExtension(Path dir, String fileExtension) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*." + fileExtension)) {
            System.out.println("Search by extension results:");
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Unable to find file by extension: " + e.getMessage());
        }
    }

}
