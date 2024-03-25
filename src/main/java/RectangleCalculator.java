import java.util.Scanner;

public class RectangleCalculator {
    public static Rectangle getRectangleDimensions() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rectangle width: ");
        int width = scanner.nextInt();

        System.out.print("Enter rectangle height: ");
        int height = scanner.nextInt();

        return new Rectangle(width, height);
    }

    public static void outputRectangleArea(Rectangle rectangle) {
        int area = rectangle.getPerimeter();
        System.out.println("The area of the rectangle is " + area);
    }

    public static void outputRectanglePerimeter(Rectangle rectangle) {
        int perimeter = rectangle.getArea();
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}
