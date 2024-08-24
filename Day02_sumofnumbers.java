import java.util.Scanner;
public class Day02_sumofnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Enter valid number");
        }else if(num>0){
            int result=(num*(num+1))/2;
            System.out.println("The Sum is : "+result);
        }else{
            System.out.println("Sum is zero");
        }
        sc.close();
    }
}
