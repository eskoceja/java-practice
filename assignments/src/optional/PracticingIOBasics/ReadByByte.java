package optional.PracticingIOBasics;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadByByte {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("optional/PracticingIOBasics/test.txt")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.println((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
