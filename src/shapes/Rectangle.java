package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    public double getArea(double length, double width) {
        double area = length*width;
        return area;
    }

    public double getPerimiter(double length, double width) {
        double perimiter = (length*2)+(width*2);
        return perimiter;
    }
}
