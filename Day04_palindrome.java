import java.util.Scanner;

public class Day04_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int original=num;
        int res=0;
        while(num>0){
            int r=num%10;
            res=res*10+r;
            num=num/10;
        }
        if(res==original){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
        sc.close();
      
    }
}
