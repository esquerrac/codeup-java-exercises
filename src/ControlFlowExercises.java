import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to convert your number grades to letters?");
        String userResponse = scanner.nextLine();
        if (userResponse.toLowerCase().equals("no")){
            System.out.println("Fine, I'll just keep all this knowledge to myself then.");
        }
        while (userResponse.toLowerCase().equals("yes")) {
            System.out.println("Please enter a numerical grade:");
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade >= 96) {
                System.out.format("A %d is an A+!%n", grade);
            } else if (grade < 96 & grade >= 92) {
                System.out.format("A %d is an A!%n", grade);
            } else if (grade < 92 & grade >= 88) {
                System.out.format("A %d is an A-!%n", grade);
            } else if (grade < 88 & grade >= 86) {
                System.out.format("A %d is an B+!%n", grade);
            } else if (grade < 86 & grade >= 83) {
                System.out.format("A %d is an B!%n", grade);
            } else if (grade < 83 & grade >= 80) {
                System.out.format("A %d is an B-!%n", grade);
            } else if (grade < 80 & grade >= 76) {
                System.out.format("A %d is an C+.%n", grade);
            } else if (grade < 76 & grade >= 72) {
                System.out.format("A %d is an C.%n", grade);
            } else if (grade < 76 & grade >= 67) {
                System.out.format("A %d is an C-.%n", grade);
            } else if (grade < 67 & grade >= 60) {
                System.out.format("A %d is an D.  Which, really, has an inherent 'minus'%n", grade);
            } else if (grade < 60) {
                System.out.format("%d? You know what this is.%n", grade);
            }
            System.out.println("Would you like to check another grade?");
            String userResponse2 = scanner.nextLine();
            if (userResponse2.toLowerCase().equals("yes")) {
                continue;
        }else{
                System.out.println("Well, get back to studying then.");
                break;
            }
        }
    }
}