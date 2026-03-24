package programscollection;

import java.util.*;

public class SecondSmallestDigit {
    public static void main(String[] args) {
        String input = "claude2403edualc";
        int result = findSecondSmallestDigit(input);
        if (result != -1) {
            System.out.println("The second smallest digit is: " + result);
        } else {
            System.out.println("Not enough digits in the string.");
        }
    }

    public static int findSecondSmallestDigit(String str) {
        // Use a TreeSet to store digits in sorted order
        TreeSet<Integer> digits = new TreeSet<>();

        // Iterate through the string and extract digits
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.add(Character.getNumericValue(ch));
            }
        }

        // Check if there are at least two distinct digits
        if (digits.size() < 2) {
            return -1; // Not enough digits
        }

        // Remove the smallest digit and return the second smallest
        digits.pollFirst(); // Remove the smallest
        return digits.first(); // Return the second smallest
    }
}