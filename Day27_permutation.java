import java.util.Arrays; // Import statement for Arrays class

public class Day27_permutation {

    
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    private static void generatePermutations(char[] arr, int startIndex) {
        if (startIndex == arr.length - 1) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = startIndex; i < arr.length; i++) {
            swap(arr, startIndex, i);
            generatePermutations(arr, startIndex + 1);
            swap(arr, startIndex, i); // backtrack
        }
    }

    public static void main(String[] args) {
        String str = "CBA";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray); 
        generatePermutations(charArray, 0);
    }
}
