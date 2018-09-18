import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159f;
        System.out.format("The value of pi is %.2f", pi);
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter a number");
        int userInt = scanner.nextInt();
        System.out.format("You entered %d", userInt);
        System.out.println();
        System.out.println("Enter a three word phrase:");
        String userString1 = scanner.next();
        String userString2 = scanner.next();
        String userString3 = scanner.next();
        System.out.format("%s%n%s%n%s", userString1, userString2, userString3);
        System.out.println();
        System.out.println("Type a sentence:");
        String userSentence = scanner.nextLine();
        System.out.format("%s", userSentence);
        System.out.println();
        System.out.println("Enter the length of your classroom as a number:");
        int roomSize1 = scanner.nextInt();
        System.out.println("Enter the width of your classroom as a number:");
        int roomSize2 = scanner.nextInt();
        int area = roomSize1*roomSize2;
        int perimiter = (roomSize1*2)+(roomSize2*2);
        System.out.format("The perimiter of your classroom is %d feet, and the area is %d square feet.", perimiter, area);
        System.out.println();
        System.out.println("How high is the ceiling in your classroom?");
        int roomSize3 = scanner.nextInt();
        int volume = roomSize1*roomSize2*roomSize3;
        System.out.format("The cubic volume of your classroom is %d cubic feet.  That's a lot of space!", volume);
    }
}
