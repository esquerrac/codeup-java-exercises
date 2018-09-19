import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have anything to say to Bob?");
        String userInput1 = scanner.nextLine();
        if (userInput1.toLowerCase().contains("y")) {
            while (true) {
                System.out.println("Go ahead, talk to Bob");
                String userInput = scanner.nextLine();
                if (userInput.endsWith("?")) {
                    System.out.println("Sure");
                } else if (userInput.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (userInput.equals("")) {
                    System.out.println("Fine, be that way.");
                    break;
                } else {
                    System.out.println("Whatever.");
                }
                System.out.println("Do you have anything else to say to Bob?");
                String userInput2 = scanner.nextLine();
                if (userInput2.toLowerCase().contains("y")) {
                    continue;
                }else{
                    break;
                }
            }
        }
    }
}