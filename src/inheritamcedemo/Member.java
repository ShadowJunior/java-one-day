package inheritamcedemo;

import java.util.Scanner;

abstract public class Member {
    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;

    public Member() {
        System.out.println("Parent Constructor with no parameters");
    }

    public Member(String name, int memberID, int memberSince) {
        System.out.println("Parent Constructor with 3 parameters");
        this.name = name;
        this.memberID = memberID;
        this.memberSince = memberSince;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount() {
        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("Please enter the admin password: ");
        password = input.nextLine();

        if (!password.equals("abcd")) {
            System.out.println("Invalid password. You do not have authority to edit the discount");
        } else {
            System.out.println("Please enter the discount: ");
            discount = input.nextInt();
        }
    }

    public void displayMemInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since: " + memberSince);
        System.out.println("Annual Fee: " + annualFee);
    }

    abstract public void calculateAnnualFee();
}
