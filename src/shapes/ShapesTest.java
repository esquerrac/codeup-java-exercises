package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("The area of box 1 is "+box1.getArea()+".");
        System.out.println("The perimiter of box 1 is "+box1.getPerimiter()+".");
        Rectangle box2 = new Square(5);
        System.out.println("The area of box 2 is "+box2.getArea()+".");
        System.out.println("The perimiter of box 2 is "+box2.getPerimiter()+".");

    }
}
