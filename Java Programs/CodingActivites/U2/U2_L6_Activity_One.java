/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_One{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of sides:");
    int sides = scan.nextInt();
    System.out.println("Enter side length:");
    double length = scan.nextDouble();
    RegularPolygon p = new RegularPolygon();
    p.setNumSides(sides);
    p.setSideLength(length);
    double perimeter = p.getPerimeter();
    double area = p.getArea();
    System.out.println("A " + p + " has perimeter " +perimeter+ " and area " +area);
  
  }
}