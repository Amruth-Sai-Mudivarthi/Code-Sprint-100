import java.util.Scanner;

public class Day10_primenumbetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        
        int[] c = new int[1000];
        int primeCount = primenumbers(a, b, c);
        
        System.out.println("Prime numbers between " + a + " and " + b + ":");
        for (int i = 0; i < primeCount; i++) {
            System.out.print(c[i] + " ");
        }
        sc.close();
    }

    static int primenumbers(int a, int b, int[] c) {
        int index = 0;
        
        for (int j = a; j <= b; j++) {
            if (j > 1) { 
                int count = 0;
                for (int i = 1; i <= j; i++) {
                    if (j % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    c[index++] = j;
                }
            }
        }
        
        return index; 
    }
}
