
public class Day27_frequencychar {



    public static void main(String[] args) {
        String str = "example";
        int[] frequency = new int[256]; // Assuming ASCII characters

        // Calculate frequency of each character
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        // Print the frequency of each character
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }
}


