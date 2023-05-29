package optional.PracticingIOBasics;

import java.io.*;

/*Implement a simple object serialization and deserialization using ObjectOutputStream and ObjectInputStream.
Define a class with some attributes, create an instance of the class, serialize the object to a file,
then read the file and deserialize the object.*/
public class TaskSeven {
    public static void main(String[] args) {
        String task7file = "assignments/src/optional/PracticingIOBasics/task7output.txt";   //path to new file to be created

        //serialize
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(task7file))) { //using ObjectOutputStream to transfer data from an Object into new file

            ForT7 person = new ForT7("Emily", 28);  //calling the object
            oos.writeObject(person);    //writing the object information into the new file

            System.out.println("\nObject written to file successfully \n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        //deserialize
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(task7file))) {    //using ObjectInputStream to read Object from a file

            ForT7 deserializedPerson = (ForT7) ois.readObject();    //deserializing object

            System.out.println("Object deserialized from file: \n" +    //displaying it to console
                    "Name: " + deserializedPerson.getName() + "\n" +
                    "Age: " + deserializedPerson.getAge());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
