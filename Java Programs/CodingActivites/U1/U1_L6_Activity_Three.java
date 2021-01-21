/* Lesson 6 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L6_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Please input a decimal number:");
    double d = scan.nextDouble();
    d = d * 100;
    int d1 = (int) d;
    int a2 = (d1 % 10);
    int a1 = ((d1 / 10) % 10);
    System.out.println("Answer: " + a1 + " " + a2);
  }
}

