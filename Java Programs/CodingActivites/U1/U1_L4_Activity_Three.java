/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Three {
  public static void main(String[] args) {
    final double pi = 3.14;
    double radius;
    double circumference;
    double area; 
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a radius:");
    radius = scan.nextDouble();
    circumference = (1.0 * 2 * pi * radius);
    area = (1.0 * pi * radius * radius);
    System.out.println("Circumference: " + circumference);
    System.out.println("Area: " + area);  
  }
}