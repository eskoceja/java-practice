package optional.PracticingIOBasics;

import java.io.FileInputStream;
import java.io.IOException;

/*Write a simple Java program that uses FileInputStream to read a file byte by byte.
The file should be a .txt file of your choosing that contains several lines of text.
Output the read data to the console.*/

public class TaskOne {
    public static void main(String[] args) {
        String task1input = "assignments/src/optional/PracticingIOBasics/task1input.txt";   //path to file to be read
        try (FileInputStream fis = new FileInputStream(task1input)) {   //using FileInputStream to read file passed through param
            int byteData;   //instantiating bytedata
            while ((byteData = fis.read()) != -1) {     //if there is bytedata
                System.out.println((char) byteData);    //print it out
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

