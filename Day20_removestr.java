import java.util.Scanner;

public class Day20_removestr {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = input.replaceAll("[^a-zA-Z]", "");
        System.out.println("String after removing non-alphabet characters: " + result);
        scanner.close();
    }
}
