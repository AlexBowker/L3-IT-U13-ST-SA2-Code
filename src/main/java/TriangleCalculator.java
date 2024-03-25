import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TriangleCalculator {
    public static Triangle getTriangleDimensions() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter side 3: ");
        int side3 = scanner.nextInt();

        return new Triangle(side1, side2, side2);
    }

    public static void outputTriangleArea(Triangle triangle) {
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        double area = triangle.getArea();
        System.out.println("The area of the triangle is " + decimalFormat.format(area));
    }

    public static void outputTrianglePerimeter(Triangle triangle) {
        int perimeter = triangle.getPerimeter();
        System.out.println("The perimeter of the triangle is " + perimeter);
    }
}

