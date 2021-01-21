/* 
Assignment 1 - Movie Ratings 

Milestone 1: Complete!
Milestone 2: Complete!
Milestone 3: Complete!
Milestone 4: Complete!
*/
//Setup
import java.util.Scanner;

class Assignment1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    //User input gathering
    System.out.println("Please enter the movie name");
    String title = scan.nextLine();
    System.out.println("Please enter the running time in minutes.");
    int time = scan.nextInt();
    System.out.println("Please enter ratings from the movie review website.");
    int site1 = scan.nextInt();
    int site2 = scan.nextInt();
    int site3 = scan.nextInt();
    System.out.println("Please enter ratings from the focus group.");
    double focus1 = scan.nextDouble();
    double focus2 = scan.nextDouble();
    System.out.println("Please enter the average movie critic rating.");
    double critic = scan.nextDouble();

    //Math calculations and vars for math
    int hours = (time / 60);
    int mins = (time  % 60);
    double avgSite = ((1.0 * site1 + site2 + site3) / 3);
    double avgFocus = ((1.0 * focus1 + focus2) / 2);
    int avgRating = (int)  ((0.2 * avgSite) + (0.3 * avgFocus) + (0.5 * critic) + 0.5);

    //Output of final aggregated rating
    System.out.println("Title: " + title);
    System.out.println("Running time: " + hours + "h" + mins );
    System.out.println("Average website rating: " + avgSite);
    System.out.println("Average focus group rating: " + avgFocus);
    System.out.println("Average movie critic rating: " + critic);
    System.out.println("Overall movie rating: " + avgRating);
  }
}

