package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public static String getString() {
        return scanner.next();
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public static int getInt() {
        try {
            return Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer.  Try entering \"1\" rather than \"one\", for example.");
        }
        return getInt();
    }

    public static int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max + ".");
        try {
            int userInt = Integer.valueOf(scanner.nextLine());
            if(userInt <min |userInt>max) {
                System.out.println("Be sure your input is between " + min + " and " + max + ".");
                return getInt(min, max);
            }else{
                return userInt;
            }
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer.  Try entering \"1\" rather than \"one\", for example.");
            System.out.println("Be sure your input is between " + min + " and " + max + ".");
        }
        return getInt();
    }

    public static double getDouble() {
        try {
            return Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid double.  Try entering \"1\" or \"1.5\" rather than \"one\", for example.");
        }
        return getDouble();
    }

    public static double getDouble(double min, double max) {
        System.out.println("Please input a number between " + min + " and " + max + ".");
        try {
            double userDouble = Double.valueOf(scanner.nextLine());
            if(userDouble <min |userDouble>max) {
                System.out.println("Be sure your input is between " + min + " and " + max + ".");
                getDouble(min, max);
            }else{
                return userDouble;
            }
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid double.  Try entering \"1\" rather than \"one\", for example.");
            System.out.println("Be sure your input is between " + min + " and " + max + ".");
        }
        return getDouble();
    }

    public static boolean yesNo() {
        System.out.println("Please input \"yes\" or \"y\" to continue:");
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

}

