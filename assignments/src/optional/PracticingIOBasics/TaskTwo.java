package optional.PracticingIOBasics;

import java.io.FileOutputStream;
import java.io.IOException;

/*Write a Java program that uses FileOutputStream to write data to a .txt file.
The data should be a string of your choosing.
Verify the result by opening the file and checking its contents.*/
public class TaskTwo {
    public static void main(String[] args) {
        String taskTwoFile = "assignments/src/optional/PracticingIOBasics/task2.txt";   //path to file
        String fileData = "This text should appear in the task2.txt file.";     //text that should appear in new file

        try (FileOutputStream fos = new FileOutputStream(taskTwoFile)) {    //using FileOutputStream to write in new file
            fos.write(fileData.getBytes());     //writing by byte from the string passed above
            System.out.println("File data written to new file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
