package inputdemo;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an integer");
        int myInt = reader.nextInt();
        System.out.printf("You entered %d.%n%n", myInt);

        System.out.println("Enter a double");
        double myDouble = reader.nextDouble();
        System.out.printf("You entered %.2f.%n%n", myDouble);

        System.out.println("Enter a string");
        reader.nextLine();
        String myString = reader.nextLine();
        System.out.printf("You entered \"%s\".%n%n", myString);
    }
}
