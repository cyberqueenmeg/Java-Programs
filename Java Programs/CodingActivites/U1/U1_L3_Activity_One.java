/* Lesson 3 Coding Activity Question 1 */
//Instructions: Write a program that prompts a user to input two doubles and then prints these two doubles backward on the screen. Put one space between the numbers
import java.util.Scanner;

class U1_L3_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    /* Write your code here */
    double one = scan.nextDouble();
    double two = scan.nextDouble();
    System.out.print(two + " " + one);
  }
}