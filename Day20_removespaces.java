import java.util.Scanner;

public class Day20_removespaces {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = input.replaceAll("\\s+", "");
        System.out.println("String after removing spaces: " + result);
        scanner.close();
    }
}
