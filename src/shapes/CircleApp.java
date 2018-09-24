package shapes;

import static util.Input.*;
import static shapes.Circle.*;

public static void createCircle(){
        System.out.println("Let's make a new circle!");
        int userRadius = getNewInt();
        Circle newCircle = new Circle();
        newCircle.setRadius(userRadius);
        System.out.println("The new circle you created has a radius of " + userRadius + ".");
        double newArea = getArea();
        System.out.println("The area of the new circle is " + newArea + " units of measurement.");
        double newCircumference = getCircumference();
        System.out.println("This circle also has " + newCircumference + " units of measurement for its circumference");
        }
public class CircleApp {
    public static void main(String[] args) {

    }
}
