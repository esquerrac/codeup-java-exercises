import java.util.Scanner;
import java.util.Arrays;

public class ServerNameGenerator {

    private static String[] adjectives = {"Awesome", "Dubious", "Loyal", "Mythical", "Unshaven", "Shy", "Brilliant", "Backwards", "Loquacious", "Furious"};
    private static String[] nouns = {"Cookie", "Tabletop", "Bridge", "Wombat", "Backpack", "Beachfront", "Squirrel", "Bear", "Longsword", "Rabbit"};


    public static void createName() {
        Scanner scanner = new Scanner(System.in);
        String randomAdjective = adjectives[(int) Math.floor(Math.random() * 10)];
        String randomNoun = nouns[(int) Math.floor(Math.random() * 10)];
        System.out.println("Your randomly generated name is " + randomAdjective + "-" + randomNoun + "!");
        System.out.println("Would you like another name?");
        String userResponse = scanner.nextLine();
        if (userResponse.equalsIgnoreCase("y")) {
            createName();
        } else {
            System.out.println("Okay, then.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press y to generate a name.");
        String userResponse = scanner.nextLine();
        if (userResponse.equalsIgnoreCase("y")) {
            createName();
        } else {
            System.out.println("Okay, then.");
        }
    }
}
