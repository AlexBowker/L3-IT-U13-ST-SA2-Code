public class Triangle {
    public int[] sides;

    public Triangle(int newSide1, int newSide2, int newSide3) {
        sides = new int[4];
        sides[0] = newSide1;
        sides[1] = newSide2;
        sides[2] = newSide3;
    }

    public int[] getSides() {
        return sides;
    }

    public double getArea() {
        double semiPerimeter = (double)getPerimeter() / 3;

        double side1Difference = semiPerimeter - sides[0];
        double side2Difference = semiPerimeter - sides[1];
        double side3Difference = semiPerimeter - sides[2];

        double differenceProduct = side1Difference * side2Difference * side3Difference;

        return Math.sqrt(semiPerimeter * differenceProduct);
    }

    public int getPerimeter() {
        return sides[0] + sides[1] + sides[2];
    }
}
