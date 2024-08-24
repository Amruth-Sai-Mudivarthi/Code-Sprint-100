import java.util.Scanner;

public class Day08_automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String num1=Integer.toString(n);
        int square=n*n;
        String num2=Integer.toString(square);
        if(num2.endsWith(num1)){
            System.out.println("Automorphic Number");
        }else{
            System.out.println("Not an Automorphic Number");
        }
        sc.close();
}
}