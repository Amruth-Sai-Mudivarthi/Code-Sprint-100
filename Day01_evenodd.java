import java.util.Scanner;
public class Day01_evenodd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num=sc.nextInt();
        if(num%2==0){
            System.out.print("It is even number");
        }else{
            System.out.print("It is odd number");
        }
        sc.close();
    }
}