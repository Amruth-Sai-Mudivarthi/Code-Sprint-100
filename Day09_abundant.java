import java.util.Scanner;

public class Day09_abundant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum>n){
            System.out.println(n+" is an abundant number");
        }else{
            System.out.println(n+" is not an abundant number");
        }
        sc.close();
    }
}
