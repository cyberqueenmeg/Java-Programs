import java.util.Scanner;

public class U2_L3_Activity_Three{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = scan.nextLine();
        System.out.println("Enter second word:");
        String word2 = scan.nextLine();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int numb = word1.compareTo(word2);
        System.out.println(numb);
    }
}