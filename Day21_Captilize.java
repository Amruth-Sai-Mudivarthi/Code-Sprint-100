import java.util.Scanner;

public class Day21_Captilize {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1, word.length() - 1))
                      .append(Character.toUpperCase(word.charAt(word.length() - 1)))
                      .append(" ");
            } else {
                result.append(Character.toUpperCase(word.charAt(0))).append(" ");
            }
        }

        System.out.println("String after capitalizing first and last characters: " + result.toString().trim());
        scanner.close();
    }
}
