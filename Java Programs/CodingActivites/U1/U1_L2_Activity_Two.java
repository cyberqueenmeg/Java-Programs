/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L2_Activity_Two {
  public static void main(String[] args) {
    
    /* Write your code here */
    String name1;
    String name2;
    String name3; 
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter three names:");
    name1 = scan.nextLine();
    name2 = scan.nextLine();
    name3 = scan.nextLine();

    System.out.println(name3 + " " + name2 + " " + name1);
    
  }
}
