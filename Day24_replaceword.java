import java.util.Scanner;

public class Day24_replaceword {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String original = scanner.nextLine();
        System.out.print("Enter the word to be replaced: ");
        String oldWord = scanner.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        String result = original.replaceAll("\\b" + oldWord + "\\b", newWord);
        System.out.println("String after replacing word: " + result);
        scanner.close();
    }
}
