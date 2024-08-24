import java.util.Scanner;

public class Day22_vowelornot {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);

        if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ||
            (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
            System.out.println(c + " is a vowel.");
        } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is a consonant.");
        } else {
            System.out.println(c + " is not an alphabet.");
        }
        scanner.close();
    }
}
