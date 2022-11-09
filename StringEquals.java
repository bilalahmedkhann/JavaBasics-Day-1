/*Write a program to check two strings are equal or not. */



public class StringEquals {
    public void stringEq() {
        String str1 = "Bilal";
        String str2 = "Bilal";


        // Comparing both strings using if else statement

        if(str1==str2){
            System.out.println("Both Strings are same.");
        }
        else {
            System.out.println("Both Strings are different.");
        }

        //System.out.println("************************************************************************************************************");

        //Compare both Strings using boolean variable:
        System.out.print("Strings are same: ");
        Boolean answer = str1.equals(str2);
        System.out.println(answer);
    }

}
