package staticdemo;

public class MyClass {
    //Non-static field and method
    public String message = "Hello World";
    public void displayMessage() {
        System.out.println("Message = " + message);

    }

    //static field and method
    public static String greetings = "Good Morning";
    public static void displayGreetings() {
        System.out.println("Greeting = " + greetings);
    }
}
