import java.util.Scanner;
public class StringExercise {
    public static void main(String[] args) {
        String message = "We don't need no ";
        System.out.format(message + "education%n"+ message + "thought control");
        System.out.println();
        System.out.println();
        System.out.println("Check \"this\" out!, \"s inside of \"s!");
        System.out.println();
        System.out.println();
        System.out.println("In Windows, the main drive is usually C:\\");
        System.out.println();
        System.out.println();
        System.out.format("I can do backslashes \\, double backslashes \\\\,%nand the amazing triple backslash\\\\\\!");
    }
}
//public class Bob{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Do you have anything to say to Bob?");
//        String userInput = scanner.nextLine();
//        if (userInput.endsWith("?")){
//            System.out.println("Sure");
//        }else if (userInput.endsWith("!")){
//            System.out.println("Whoa, chill out!");
//        }else if (userInput.equals("")){
//            System.out.println("Fine, be that way.");
//        }else{
//            System.out.println("Whatever.");
//        }
//    }
//}