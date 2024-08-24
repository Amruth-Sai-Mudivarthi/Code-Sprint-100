import java.util.Scanner;

public class Day07_strongnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        if(isStrong(n)){
            System.out.println(n+" is a strong number");
        }else{
            System.out.println(n+" is not a strong number");
        }
        sc.close();
    }
    static boolean isStrong(int n){
        int sum=0;
        int num=n;
        while(n>0){
            int r=n%10;
            sum=sum+factorial(r);
            n=n/10;
        }
        if(sum==num){
            return true;
        }else{
            return false;
        }
    }

    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
