import java.util.Scanner;

public class Day05_greatest3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("The greatest number is : "+a);
        }else if(b>a && b>c){
            System.out.println("The greatest number is : "+b);
        }else{
            System.out.println("The greatest number is : "+c);
        }
        sc.close();

    }
}
