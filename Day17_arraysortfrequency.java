import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day17_arraysortfrequency {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }

        Collections.sort(list, (a, b) -> {
            int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            return freqCompare != 0 ? freqCompare : a - b;
        });


        System.out.println("Array sorted by frequency:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
