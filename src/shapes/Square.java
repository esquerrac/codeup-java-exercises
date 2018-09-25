package shapes;

public class Square extends Rectangle {
    public double side;


    public void setSide(double side) {
        this.side = side;
    }

    public Square(double length, double width) {
        super(length, width);
        this.side = length;
    }
    public static double getArea(double side) {
        return side*side;
    }

    public static double getPerimiter(double side) {
        return side*4;
    }
}
