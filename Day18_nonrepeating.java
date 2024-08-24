import java.util.HashMap;
import java.util.Scanner;

public class Day18_nonrepeating {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            frequencyMap.put(array[i], frequencyMap.getOrDefault(array[i], 0) + 1);
        }

        System.out.println("Non-repeating elements in the array:");
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
        scanner.close();
    }
}
