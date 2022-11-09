

import java.util.Scanner;

public class LeapYear {
    public void leap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input year: ");
        int year = sc.nextInt();

        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else {
            System.out.println("Try input year only after 1581");
        }
    }
}
