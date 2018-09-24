package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input {
        scanner = new Scanner(System.in).useDelimiter("\n");
    }
    public String getString(){
        return scanner.next();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }
    public int getInt(){
        return scanner.nextInt();
    }
    public int getInt(int min, int max){
        System.out.println("Please input an integer between "+min+" and "+max+".");
        return getInt();
    }
    public double getDouble(){
        return scanner.nextDouble();
    }
    public double getDouble(double min, double max){
        System.out.println("Please input a number between "+min+" and "+max+".");
        return getDouble();
    }
    public boolean yesNo(){
        System.out.println("Please input \"yes\" or \"y\" to continue:");
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }


}
