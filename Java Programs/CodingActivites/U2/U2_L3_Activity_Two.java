import java.util.Scanner;

public class U2_L3_Activity_Two {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        System.out.println(str.substring(1, str.length()-1));
    }
}
