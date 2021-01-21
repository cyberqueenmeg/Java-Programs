import java.util.Scanner;

class U1_L6_Activity_One {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two integers: ");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        double a = (double) (1.0 * (i1 + i2)/2);
        System.out.println("The average is: " + a);
    }
}
