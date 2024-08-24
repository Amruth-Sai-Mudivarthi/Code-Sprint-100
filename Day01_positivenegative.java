import java.util.Scanner;
public class Day01_positivenegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        if(num==0){
            System.out.print("It is neither positive nor negative");
        }else if(num>0){
            System.out.print("It is positve number");
        }else{
            System.out.print("It is negative number");
        }
        sc.close();
    }
}
