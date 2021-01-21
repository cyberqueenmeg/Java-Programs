/* Lesson 3 Coding Activity Question 3 */
//Instructions: Write a short quiz program which asks three true/false questions and stores the user's answers as booleans. At the end the program it should print the user's answers with the correct answers. Note: you should use the same quiz questions and correct answers as the sample run below. 

import java.util.Scanner;

public class U1_L3_Activity_Three{
  public static void main(String[] args){
    boolean a1;
    boolean a2;
    boolean a3;
    
    Scanner scan = new Scanner (System.in);

    System.out.println("Java is a programming language, true or false?");
    a1 = scan.nextBoolean();
    System.out.println("Only numbers can be stored by variables in Java, true or false?");
    a2 = scan.nextBoolean();
    System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
    a3 = scan.nextBoolean();
    System.out.println("Question 1 - Your answer: " + a1 + ". Correct answer: true");
    System.out.println("Question 2 - Your answer: " + a2 + ". Correct answer: false");
    System.out.println("Question 3 - Your answer: " + a3 + ". Correct answer: true");
  }
}
