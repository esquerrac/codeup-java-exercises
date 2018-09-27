package grades;

import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student test1 = new Student("Dre");
        Student test2 = new Student("Solaire");
        Student test3 = new Student("Eazy");
        Student test4 = new Student("Slug");
        HashMap<String, Student> students = new HashMap<>();
        students.put("LockedInTheBasement", test1);
        students.put("GitGud", test2);
        students.put("BoyInTheHood", test3);
        students.put("SadClown", test4);
        test1.addGrade(91);
        test1.addGrade(97);
        test1.addGrade(83);
        test1.addGrade(87);
        test2.addGrade(92);
        test2.addGrade(86);
        test2.addGrade(77);
        test2.addGrade(88);
        test3.addGrade(64);
        test3.addGrade(64);
        test3.addGrade(64);
        test3.addGrade(64);
        test4.addGrade(78);
        test4.addGrade(82);
        test4.addGrade(76);
        test4.addGrade(80);

        System.out.println("Welcome!");
        System.out.println("Would you like to view student information?");
        String userAnswer = scanner.nextLine();
        if (userAnswer.toLowerCase().contains("y")) {
            System.out.println("Great!  Who cares about privacy anyway!");
            System.out.println(".");
            System.out.println(".");
            System.out.println("Here is a list of the available students:");
            for (String gitname : students.keySet())
                System.out.print(" |"+gitname+"| ");
            System.out.println();
            System.out.println("Which student would you like information on?");
            String userSearch = scanner.nextLine();
            if (students.containsKey(userSearch)){

            }
            else{
                System.out.println("Sorry, we don't have a student with that username.");
            }
        }

    }

}



