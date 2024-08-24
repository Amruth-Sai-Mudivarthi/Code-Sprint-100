import java.util.Arrays;
import java.util.Scanner;

public class Day15_reversearray {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] reversedArray = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArray[i] = array[n - i - 1];
        }

        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
        scanner.close();
    }
}
