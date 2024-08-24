import java.util.Scanner;

class Day16_secondsmallest{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (array[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != firstSmallest) {
                secondSmallest = array[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element in the array.");
        } else {
            System.out.println("The second smallest element in the array is: " + secondSmallest);
        }
        scanner.close();
    }
}