package objectoriented;

public class Staff {

    private String nameOfStaff;
    private final int hourlyRate = 30;
    private int hoursWorked;

    public Staff(String name) {
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("-------------------");
    }

    public Staff(String firstName, String lastName) {
        nameOfStaff = firstName + " " + lastName;
        System.out.println("\n" + nameOfStaff);
        System.out.println("-------------------");
    }

    public void printMessage() {
        System.out.println("Calculating Pay...");
    }

    /**
     * calculates the pay of each employee and returns the result of the calculation
     */
    public int calculatePay() {
        printMessage();
        int staffPay;
        staffPay = hoursWorked * hourlyRate;

        if (hoursWorked > 0)
            return staffPay;
        else
            return -1;
    }

    public int calculatePay(int bonus, int allowance) {
        printMessage();
        if (hoursWorked > 0)
            return hoursWorked * hourlyRate + bonus + allowance;
        else
            return 0;
    }

    public void setHoursWorked(int hours) {
        if (hours > 0)
            hoursWorked = hours;
        else {
            System.out.println("Error: HoursWorked cannot be smaller than 0 ");
            System.out.println("Error: HoursWorked is not updated");
        }
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
