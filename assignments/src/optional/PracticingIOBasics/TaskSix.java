package optional.PracticingIOBasics;

import java.io.*;

/*Write a Java program that uses DataInputStream and DataOutputStream to write primitive data types
to a file and then read them back. The data types should include: int, float, boolean, and char.*/
public class TaskSix {
    public static void main(String[] args) {

        String task6File = "assignments/src/optional/PracticingIOBasics/task6.txt"; //path to file to write and read from

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(task6File))) {    //using DataOutputStream to transfer data to new file

            //data to go into file
            int intData = 123;
            float floatData = 1.14f;
            boolean booleanData = true;
            char charData = 'E';

            //writing the data into the new file
            dos.writeInt(intData);
            dos.writeFloat(floatData);
            dos.writeBoolean(booleanData);
            dos.writeChar(charData);

            System.out.println("\nData successfully written to file \n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(task6File))) {   //using DataInputStream to read the data from the file

            //reading primitive data types with corresponding methods
            int intData = dis.readInt();
            float floatData = dis.readFloat();
            boolean booleanData = dis.readBoolean();
            char charData = dis.readChar();

            //displaying it to console
            System.out.println("Data from the file: \n" +
                    "int: " + intData + "\n" +
                    "float: " + floatData + "\n" +
                    "boolean: " + booleanData + "\n" +
                    "char: " + charData);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
