import java.util.Scanner;

public class Person {
    private String name;

    public static void setName(String name){
        Person person = new Person();
        person.name = name;
        System.out.println("Thanks for making an account, "+name+"!");
    }

    public static void sayHello(String name){
        System.out.println("Hello, "+name+".");
    }

    public static void createPerson(String personName) {
        sayHello(personName);
        setName(personName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userName = scanner.nextLine();
        createPerson(userName);



    }
}

