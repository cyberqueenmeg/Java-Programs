/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L2_Activity_One {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    String name;
    
    System.out.println("What is your name?");
    name = scan.nextLine();
    System.out.println("Hi " + name + ", nice to see you.");
  }
}