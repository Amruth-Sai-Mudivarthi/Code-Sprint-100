import java.util.Scanner;

public class Day11_Fibonacci {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term number (n): ");
        int n = scanner.nextInt();

        int first = 0, second = 1, nth = 0;

        if (n == 1) {
            nth = first;
        } else if (n == 2) {
            nth = second;
        } else {
            for (int i = 3; i <= n; i++) {
                nth = first + second;
                first = second;
                second = nth;
            }
        }

        System.out.println("The " + n + "th term in the Fibonacci series is: " + nth);
        scanner.close();
    }
}
