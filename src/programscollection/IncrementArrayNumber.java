package programscollection;

import java.util.Arrays;

public class IncrementArrayNumber {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9}; // Example input
        int[] result = addOne(digits);

        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] addOne(int[] digits) {
        // Start from the last digit and move backward
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Increment the current digit
                return digits; // Return the array if no carry is needed
            }
            // If the digit is 9, set it to 0 (carry over)
            digits[i] = 0;
        }

        // If all digits were 9, we need an extra digit at the start
        int[] result = new int[digits.length + 1];
        result[0] = 1; // The first digit is 1, and the rest are 0 by default
        return result;
    }
}
