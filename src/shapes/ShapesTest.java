package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("The area of box 1 is "+box1.getArea(+box1.length, box1.width)+".");
        System.out.println("The perimiter of box 1 is "+box1.getPerimiter(+box1.length, box1.width)+".");
        Rectangle box2 = new Square(5, 5);
        System.out.println("The area of box 2 is "+Square.getArea(box2.length)+".");
        System.out.println("The perimiter of box 2 is "+Square.getPerimiter(box2.length)+".");

    }
}
