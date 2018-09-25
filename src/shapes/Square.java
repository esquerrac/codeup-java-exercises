package shapes;

public class Square extends Rectangle {
    public double side;


    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
        }
    public double getArea() {
        return this.side*this.side;
    }

    public double getPerimiter() {
        return this.side*4;
    }
}
