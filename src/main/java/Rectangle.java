public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int newWidth, int newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return height * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }
}
