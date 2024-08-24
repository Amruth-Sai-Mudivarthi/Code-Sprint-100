import java.util.LinkedHashMap;
import java.util.Scanner;

public class Day23_Nonrepeatingcharacters {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Non-repeating characters in the string:");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) == 1) {
                System.out.print(c + " ");
            }
        }
        scanner.close();
    }
}
