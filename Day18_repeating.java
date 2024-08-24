import java.util.HashSet;
import java.util.Scanner;

public class Day18_repeating {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        System.out.println("Repeating elements in the array:");

        for (int i = 0; i < n; i++) {
            if (!set.add(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
        scanner.close();
    }
}
