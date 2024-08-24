import java.util.Scanner;

public class Day04_factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num=sc.nextInt();
        int result=1;
        for(int i=1;i<=num;i++){
            result*=i;
        }
        System.out.println("The factorial is : "+result);
        sc.close();
    }
}
