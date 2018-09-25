import java.util.Scanner;
public class MethodsExercises {

    public static int addition(int number1, int number2){
        int result =  number1+number2;
        System.out.println(number1+" + "+number2+" = "+result);
        return result;
    }

    public static int subtraction(int number1, int number2){
        int result =  number1-number2;
        System.out.println(number1+" - "+number2+" = "+result);
        return result;
    }

    public static int multiplication(int number1, int number2) {
        int result = 0;
        if (number1 ==0 | number2==0) return 0;
        for (int i = 1; i <= number2; i++) {
            result += number1;
        }
        System.out.println(number1 + " x " + number2 + " = " + result);
        return result;
    }

    public static int division(int number1, int number2){
        int result =  number1/number2;
        System.out.println(number1+" divided by "+number2+" = "+result);
        return result;
    }
    public static int getInteger (int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between "+min+" and "+max+":");
        int userInt = scanner.nextInt();
        if (userInt>=min & userInt<=max) {
            System.out.println("Thank you!");
            return userInt;
        }else{
            System.out.println("InputInitial invalid. Please try again");
            getInteger(min, max);
            return 0;
        }
    }
    public static int factorial (int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between "+min+" and "+max+":");
        int userInt = scanner.nextInt();
        if (userInt>=min & userInt<=max) {
            System.out.println("The factorial table for your number is:");
            String factorial = "Factorial";
            String number = "Number";
            System.out.printf("%10s | %10s%n",factorial, number);
            long total = 0;
            for(int i=1; i<=userInt; i++){
                total += i*(i-1);
                System.out.printf("%10d | %10d%n",i, total );
            }
            return userInt;
        }else{
            System.out.println("InputInitial invalid. Please try again");
            factorial(min, max);
            return 0;
        }
    }
    public static double rollDice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's roll some dice!");
        System.out.println("How many sides are on the first die?");
        double dice1 = scanner.nextInt();
        System.out.println("How many sides are on the second die?");
        double dice2 = scanner.nextInt();
        System.out.println("Let's roll!");
        double roll1 = Math.floor(Math.random()*dice1)+1;
        System.out.println("First dice is "+(int)roll1+"!");
        double roll2 = Math.floor(Math.random()*dice2)+1;
        System.out.println("First dice is "+(int)roll2+"!");
        int total = (int)roll1+(int)roll2;
        System.out.println("Your total roll is "+total+"!");
        return total;
    }





    public static void main(String[] args) {
        addition(3, 5);
        subtraction(10, 7);
        multiplication(5, 3);
        division(10, 2);
        getInteger(4, 98);
//        factorial(1, 10);
        rollDice();

    }
}
