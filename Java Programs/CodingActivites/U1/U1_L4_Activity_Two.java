/* Lesson 4 Coding Activity Question 2 */
//Instructions: Write a program which takes user input of a number of inches, and then prints the number of whole feet in that many inches (remember there are 12 inches in a foot). 
import java.util.Scanner;

class U1_L4_Activity_Two {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number to represent the amount of inches you want to convert: ");
        number = scan.nextInt();
        number = number / 12;
        System.out.print(number);
    }
}