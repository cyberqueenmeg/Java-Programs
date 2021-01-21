/* Unit 1 - Lesson 5 - Coding Activity Question 1 */

import java.util.Scanner;

class U1_L5_Activity_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num; 
        System.out.println("Please enter a two digit number:");
        num = scan.nextInt();
        int digit1 = (num / 10);
        int digit2 = (num % 10);
        System.out.println("Here are the digits:");
        System.out.println(digit1);
        System.out.println(digit2);
    }
}