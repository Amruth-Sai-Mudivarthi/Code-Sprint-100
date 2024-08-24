import java.util.Scanner;
public class Day03_sumrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int num=sc.nextInt();
        System.out.print("Enter range : ");
        int length=sc.nextInt();
        int range=num+length;
        int sum=0;
        for(int i=num;i<=range;i++){
            sum=sum+i;
        }
        System.out.print("Sum is :"+sum);
        sc.close();
    }
}
