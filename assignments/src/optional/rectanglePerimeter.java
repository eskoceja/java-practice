package optional;
import java.util.Scanner;

public class rectanglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width, height, area, perimeter;

        System.out.println("Enter the width of the rectangle:");
        width = scanner.nextDouble();

        System.out.println("Enter the height of the rectangle:");
        height = scanner.nextDouble();

        area = width * height;
        perimeter = 2 * (width * height);

        System.out.println("The area of the rectangle is " + width + " * " + height + " = " + area + ". \n " +
                "The perimeter of the rectangle is 2 * (" + width+ " * " + height + ") = " + perimeter);

    }
}
