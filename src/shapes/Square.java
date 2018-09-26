package shapes;

public class Square extends Quadrilateral {
    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void setLength(int side) {
        this.length = side;
    }

    @Override
    public void setWidth(int side) {
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return this.side*4;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }
}
