package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner=new Scanner(System.in);

    public static String getString(){
        System.out.println("Please enter text you would like to store:");
        String input = scanner.nextLine();
        System.out.println("'"+input+"'"+" has been saved");
        return input;
    }
    public static boolean yesNo(){
        System.out.println("Would you like to see a boolean?");
        String input = scanner.nextLine();
        if (input.toLowerCase().contains("y")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        return true;
    }
    public static int getInt(int min, int max){
        System.out.println("Please enter a number between "+min+" and "+max+":");
        int input = scanner.nextInt();
        if (input < min | input > max){
            System.out.println("Number outside of allowed range.");
            getInt(min, max);
        }else{
            System.out.println("Input "+input+" received.");
        }
        return input;
    }
    public static int getInt(){
        int userRandom;
        System.out.println("Would you like a randomly generated number?");
        String trash = scanner.nextLine();
        String input = scanner.nextLine();
        if (input.toLowerCase().contains("y")) {
            System.out.println("Please enter the low end of the range you want to randomize:");
            int userMin = scanner.nextInt();
            System.out.println("Please enter the high end of the range you want to randomize:");
            int userMax = scanner.nextInt();
            userRandom = (int)Math.floor(Math.random() * userMax + userMin);
            System.out.println(userRandom+" is your random number");
            getInt();
            return userRandom;
        }else{
            System.out.println("Okay, then.  Don't know why you called me.");
            return 0;
        }

    }
    public static double getDouble(){
        double userDouble;
        System.out.println("Would you like a randomly generated decimal number?");
        String trash = scanner.nextLine();
        String input = scanner.nextLine();
        if (input.toLowerCase().contains("y")) {
            System.out.println("Please enter the low end of the range you want to randomize with decimal places:");
            double userMin = scanner.nextDouble();
            System.out.println("Please enter the high end of the range you want to randomize with decimal places:");
            double userMax = scanner.nextDouble();
            userDouble = Math.random() * userMax + userMin;
            System.out.println("Your random number is " +userDouble);
            getInt();
            return userDouble;
        }else{
            System.out.println("Okay, then.  Don't know why you called me.");
            return 0;
        }
    }
    public static double getDouble(double min, double max) {
        System.out.println("Please enter a number between " + min + " and " + max + ":");
        double input = scanner.nextDouble();
        if (input < min | input > max) {
            System.out.println("Number outside of allowed range.");
            getDouble(min, max);
        }else {
            System.out.println("Input " + input + " received.");
        }
        return input;
    }


}
