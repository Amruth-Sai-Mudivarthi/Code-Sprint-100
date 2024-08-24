import java.util.Scanner;

public class Day24_replacesubstring {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String original = scanner.nextLine();
        System.out.print("Enter the substring to be replaced: ");
        String oldSubstring = scanner.nextLine();
        System.out.print("Enter the new substring: ");
        String newSubstring = scanner.nextLine();

        String result = original.replace(oldSubstring, newSubstring);
        System.out.println("String after replacement: " + result);
        scanner.close();
    }
}
