public class ClaProgram {
    public static void main(String[] args) {
        ClaProgram cla = new ClaProgram();
        cla.find(args);
        cla.getNameByCL(args);

    }
    //1.4 To find the sum of command-line arguments and count the invalid integers entered.
    public void find(String[] args) {
        int sum = 0;
        int invalidIntCount = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                sum = sum + Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                invalidIntCount++;
            }
        }
        System.out.println("Sum of input number = " + sum);
        System.out.println("Number of invalid inputs = " + invalidIntCount);
    }


    //1.5 To get the name using the command line.
    public void getNameByCL(String[] args) {
        String name = args[0];
        System.out.println("Name in command line is " + name);
    }
}
