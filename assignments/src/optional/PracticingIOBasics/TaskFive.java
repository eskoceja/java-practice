package optional.PracticingIOBasics;

import java.io.*;

/*Write a Java program that uses FileReader and FileWriter to read a .txt file
and write its content to another .txt file in reverse order
(i.e., the input file's last line becomes the output file's first line).*/
public class TaskFive {
    public static void main(String[] args) {

        String task5input = "assignments/src/optional/PracticingIOBasics/task5input.txt";   //path to input file
        String task5output = "assignments/src/optional/PracticingIOBasics/task5output.txt"; //path to output file

        try (BufferedReader reader = new BufferedReader(new FileReader(task5input));    //using BufferedReader to read input file
             BufferedWriter writer = new BufferedWriter(new FileWriter(task5output))) { //using BufferedWriter to write into new file

            String line;    //instantiating line
            StringBuilder content = new StringBuilder();    //StringBuilder Object stores content from input file as it is being read and processed

            while ((line = reader.readLine()) != null) {    //loops through all lines that are being read
                content.append(line).append(System.lineSeparator());    //append to keep original line breaks
            }

            String reversedContent = content.reverse().toString();  //reversing the content

            writer.write(reversedContent);  //writing it into a new file

            System.out.println("File content was successfully reversed");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
