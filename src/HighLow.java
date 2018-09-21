import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        double randomNumber = Math.floor(Math.random()*100)+1;
        System.out.println("Ready to guess a random number?");
        Scanner scanner = new Scanner(System.in);
        String userResponse = scanner.nextLine();
        if (userResponse.toLowerCase().contains("y")){
            while (true){
                System.out.println("Guess a number between 1 and 100:");
                int userGuess = scanner.nextInt();
                if (userGuess==(int)randomNumber){
                    System.out.println("A WINNER IS YOU");
                    break;
                }else if(userGuess>(int)randomNumber){
                    System.out.println("We don't have the budget for numbers that big!  Guess lower!");
                    continue;
                }else if (userGuess<(int)randomNumber){
                    System.out.println("You can do better than that!  Guess higher!");
                    continue;
                }
            }
        }
    }
}
