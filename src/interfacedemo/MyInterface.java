package interfacedemo;

public interface MyInterface {
    int myInt = 5;
    void someMethod();

    public static void someStaticMethod() {
        System.out.println("This is a static method in an interface");
    }

    public default void someDefaultMethod() {
        System.out.println("This is a default method in an interface");
    }
}
