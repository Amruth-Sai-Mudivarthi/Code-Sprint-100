import java.util.Scanner;

public class Day06_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        System.out.println("Reversed number : "+reverse(num));
        sc.close();

    }
    public static int reverse(int n){
        int res=0;
        while(n>0){
            int r=n%10;
            res=res*10+r;
            n=n/10;
        }
        return res;
    }
}
