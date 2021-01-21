/* Lesson 3 Coding Activity Question 2 */
//Instructions: Write a program that asks the user their name and age and prints out this information in a sentence as shown. Note that age should be an integer, not a double.
import java.util.Scanner;

class U1_L3_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name;
    int age;
    /* Write your code here */
    System.out.println("Hi there. What is your name?");
    name = scan.nextLine();
    System.out.println("Hi " + name + ". How old are you?");
    age = scan.nextInt();
    System.out.println(name + " is " + age + " years old.");
  }
}