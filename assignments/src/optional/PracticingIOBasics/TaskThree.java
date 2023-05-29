package optional.PracticingIOBasics;

import java.io.*;

/*Modify the programs you wrote in tasks 1 and 2 to use BufferedInputStream and BufferedOutputStream, respectively.
Compare the performance of these versions with the original versions.
Explain your observations.*/
public class TaskThree {
    public static void main(String[] args) {

        String task3input = "assignments/src/optional/PracticingIOBasics/task3input.txt";   //path to input file
        String task3output = "assignments/src/optional/PracticingIOBasics/task3output.txt"; //path to new file

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(task3input));    //using BufferedInputStream to read file passed through param
                BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(task3output))) { //using BufferedOutputStream to write into new file passed into param
            int byteData;   //instantiating byte data

            while((byteData = bis.read()) != -1) {  //if there is data in input file
                bos.write(byteData);    //write it into the new output file
            }

            System.out.println("Data transferred successfully");

        } catch(IOException e){
            e.printStackTrace();
        }

    }
}

/*Observations compared to task 1 and 2:
* I noticed that the transfer of data and the creation of a new file was faster using the Buffered Input/Output System.
* After rereading notes and looking up more information online, I learned that this is because Buffered is buffered,
* meaning that, Buffered reduced the amount of I/O operations by reading and writing data in larger chunks (buffers),
* instead of individually reading or writing data byte by byte (task 1 and 2).*/