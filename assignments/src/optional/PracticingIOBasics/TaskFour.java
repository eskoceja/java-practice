package optional.PracticingIOBasics;

import java.io.*;

/*Create a Java program that uses InputStreamReader and OutputStreamWriter.
The program should read from a .txt file using InputStreamReader, convert the read data into uppercase,
and then write the uppercase data to another .txt file using OutputStreamWriter.*/
public class TaskFour {
    public static void main(String[] args) {
        String task4input = "assignments/src/optional/PracticingIOBasics/task4input.txt";   //path to input file
        String task4output = "assignments/src/optional/PracticingIOBasics/task4output.txt"; //path to output file

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(task4input));    //using InputStreamReader to read input file
             OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(task4output))) {  //using OutputStreamReader to create new file to write in
            int charData;   //instantiating char data

            while((charData = isr.read()) != -1) {  //if there is data in input file
                char uppercaseChar = Character.toUpperCase((char) charData);    //make it uppercase
                osw.write(uppercaseChar);   //write it into the new file
            }

            System.out.println("Data converted and written in new output file");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
