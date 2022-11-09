/*Write a program to demonstrate static variables, methods, and blocks.*/



public class StaticVariableMethod {

    // Static Variable
    static int num1 = 50;
    static int num2;

    //Static Functions
    static void sum(int num2) {
        int res = num1 + num2;
        System.out.println("sum: " + res);
    }

    static void sub(int num2) {
        int res = num1 - num2;
        System.out.println("sub: " + res);
    }

    static void mult(int num2) {
        int res = num1 * num2;
        System.out.println("multiply: " + res);
    }

    //Static Block
    static {
        System.out.println("Hello! This is Java Static Demonstrate Program");
    }

    public static void main(String args[]) {
        sum(8);
        sub(10);
        mult(2);
    }
}







