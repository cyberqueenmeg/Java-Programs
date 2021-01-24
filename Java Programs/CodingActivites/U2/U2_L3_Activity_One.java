import java.util.Scanner;

public class U2_L3_Activity_One{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        System.out.print(str.substring(0,1));
        System.out.print(str.substring(str.length() - 1));
    }
}
