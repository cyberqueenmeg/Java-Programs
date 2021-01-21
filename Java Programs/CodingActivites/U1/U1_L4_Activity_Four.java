/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Four {
  public static void main(String[] args) {
    double price;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a price: ");
    price = scan.nextDouble();
    price = (20 - price);
    System.out.println("Change from $20: $" + price);

  }
}
