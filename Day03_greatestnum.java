import java.util.Scanner;
public class Day03_greatestnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter a : ");
        a=sc.nextInt();
        System.out.print("Enter b : ");
        b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater");
        }else if(a==b){
            System.out.println("Both are equal");
        }else{
            System.out.println("b is greater");
        }
        sc.close();
    }
}
