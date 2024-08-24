import java.util.Scanner;

public class Day07_perfectnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        if(isperfect(num)){
            System.out.println("It is a perfect number");
        }else{
            System.out.println("It is not a perfect number");
        }
        sc.close();
    }

    public static boolean isperfect(int n){
        int num=n;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            return true;
        }else{
            return false;
        }
    }
}
