package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(6, 3);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

    }
}
