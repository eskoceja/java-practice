package optional;
import java.util.Scanner;

public class circlePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //set radius, perimeter and area as doubles
        double radius, perimeter, area;

        //"final" to let it know it cannot change.
        final double PI = 3.14159265359;

        System.out.println("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        perimeter = 2 * PI * radius;
        area = PI * radius * radius;

        System.out.println("The perimeter of the circle is: " + perimeter);
        System.out.println("The area of the circle is: " + area);



    }
}
