import java.util.Scanner;
public class Day26_ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char a=sc.next().charAt(0);
        int b=(int)(a);
        System.out.println("The ASCII Value of the character is :"+b);
        sc.close();
    }
}
