/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L6_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    /* Write your code here */
    System.out.println("Please input a decimal number:");
    double d = scan.nextDouble();
    int round = (int) (d + 0.5);
    System.out.println("Answer: " + round);
  }
}
