/* Unit 1 - Lesson 5 - Coding Activity Question 2 */
//Instructions: Write a program which takes a three digit number as an input, then prints the digits of this number one per line in reverse order.

import java.util.Scanner;

class U1_L5_Activity_Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNum;
        
        System.out.println("Please enter a three digit number:");
        userNum = scan.nextInt();
        int digit1 = (userNum % 10);
        int digit2 = ((userNum / 10) % 10);
        int digit3 = ((userNum / 100) % 10);

        System.out.println("Here are the digits:");
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);  
    }
}
