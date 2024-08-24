import java.util.Scanner;

public class Day21_sumnumberscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int sum = 0;
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                temp += input.charAt(i);
            } else {
                if (!temp.equals("")) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if (!temp.equals("")) {
            sum += Integer.parseInt(temp);
        }

        System.out.println("Sum of numbers in the string: " + sum);
        scanner.close();
    }   
}

