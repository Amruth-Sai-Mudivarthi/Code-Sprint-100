import java.util.Scanner;

public class Day25_wildcardcharacters {
        public static boolean isMatch(String str, String pattern) {
        // Initialize pointers for both string and pattern
        int s = 0, p = 0;
        int starIdx = -1, match = 0;

        while (s < str.length()) {
            // If current characters match or pattern has '?'
            if (p < pattern.length() && (pattern.charAt(p) == '?' || pattern.charAt(p) == str.charAt(s))) {
                s++;
                p++;
            }
            // If pattern contains '*', track position
            else if (p < pattern.length() && pattern.charAt(p) == '*') {
                starIdx = p;
                match = s;
                p++;
            }
            // If previous character was '*', adjust match position
            else if (starIdx != -1) {
                p = starIdx + 1;
                match++;
                s = match;
            }
            // If characters don't match and no '*' was found
            else {
                return false;
            }
        }

        // Check remaining characters in pattern
        while (p < pattern.length() && pattern.charAt(p) == '*') {
            p++;
        }

        return p == pattern.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the pattern with wildcards (* and ?): ");
        String pattern = scanner.nextLine();

        boolean result = isMatch(str, pattern);
        if (result) {
            System.out.println("The string matches the pattern.");
        } else {
            System.out.println("The string does not match the pattern.");
        }
        scanner.close();
    }
}
