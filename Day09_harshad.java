import java.util.Scanner;

public class Day09_harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sumOfDigits = 0;
        int temp = number;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        if (number % sumOfDigits == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
        sc.close();
    }
}

    

