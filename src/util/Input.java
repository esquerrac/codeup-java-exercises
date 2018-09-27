package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner= new Scanner(System.in).useDelimiter("\n");

    public static String getString() {
        return scanner.next();
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max + ".");
        return getInt();
    }

    public static double getDouble() {
        return scanner.nextDouble();
    }

    public static double getDouble(double min, double max) {
        System.out.println("Please input a number between " + min + " and " + max + ".");
        return getDouble();
    }

    public static boolean yesNo() {
        System.out.println("Please input \"yes\" or \"y\" to continue:");
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

}

