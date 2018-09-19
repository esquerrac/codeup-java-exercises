import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10:");
        int userInt = Integer.parseInt(scanner.nextLine());
        System.out.println("Would you like to see a table of exponents up to your number?  Yes or No:");
        String userResponse = scanner.nextLine();
        if (userResponse.toLowerCase().equals("yes")) {
            System.out.println("Here is a table of powers!");
            String head1 = "Number";
            String head2 = "Squared";
            String head3 = "Cubed";
            System.out.format("%10s | %10s | %10s |%n", head1, head2, head3);
            System.out.println("----------------------------------------");
            for (int i = 1; i <= userInt; i++) {
                int square = i * i;
                int cube = i * i * i;
                System.out.format("%10d | %10d | %10d |%n", i, square, cube);
            }
        } else {
            System.out.println("Sure, that's fine.  Whatever.");
        }
    }
}
