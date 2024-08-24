import java.util.Scanner;

public class Day06_armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        String snum=sc.nextLine();
        int length=snum.length();
        int num=Integer.parseInt(snum);
        if(armstrong(num, length)){
            System.out.println("It is a armstrong number");
        }else{
            System.out.println("It is not a armstrong number");
        }
        sc.close();
    }
    static boolean armstrong(int n,int len){
        int sum=0;
        int num=n;
        while(n>0){
            int r=n%10;
            sum=sum+(int)(Math.pow(r,len));
            n=n/10;
        }
        if(sum==num){
            return true;
        }else{
            return false;
        }
        
    }
}
