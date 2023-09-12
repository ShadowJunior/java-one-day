package inputdemo;

import java.util.Scanner;

public class ErrorDemo {
    public static void main(String[] args) {
        int num, deno;

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the numerator: ");
            num = input.nextInt();

            System.out.println("Please enter the denominator: ");
            deno = input.nextInt();

            System.out.println("The result is " + num/deno);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("---- End of Error Handling Example ----");
        }
    }
}
