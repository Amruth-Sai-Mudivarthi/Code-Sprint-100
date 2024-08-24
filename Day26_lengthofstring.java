import java.util.Scanner;

public class Day26_lengthofstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int length=0;
        Boolean a=true;
        while(a){
            try{
                str.charAt(length);
                length++;
            }catch(IndexOutOfBoundsException e){
                a=false;
                break;
            }
            
        }
        System.out.println("The length is : "+length);
        sc.close();
     }
}
