import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DisplayMessage display = new DisplayMessage();
        // display.display();

        DefaultValue def = new DefaultValue();
        // def.displayMessage();

        StringEquals equals = new StringEquals();
        // equals.stringEq();

        LeapYear leapyear = new LeapYear();
        // leapyear.leap();

        System.out.println("Enter any choice between the programs\n" +
                "1) for display a message\n" +
                "2) for default value of data type\n" +
                "3) for check string equals or not\n" +
                "4) for checking of leap year\n" +
                "5) for static variable method block");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            display.display();
        } else if (choice == 2) {
            def.displayMessage();

        } else if (choice == 3) {
            equals.stringEq();

        } else if (choice == 4) {
            leapyear.leap();

        } else if (choice == 5) {
            System.out.println("You have to manually run the program");

        }
        else {
            System.out.println("Invalid input");
        }
    }
}