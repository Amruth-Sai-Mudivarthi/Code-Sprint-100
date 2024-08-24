import java.util.Scanner;
class Day08_perfectsquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int root=(int)Math.sqrt(n);
        if(root*root==n){
            System.out.println("It is a perfect square");
        }else{
            System.out.println("Not a perfect square");
        }
        sc.close();

    }
}