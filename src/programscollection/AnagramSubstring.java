package programscollection;

import java.util.*;

public class AnagramSubstring {
    public static void main(String[] args) {
        String input1 = "programming";
        String input2 = "gram";
        System.out.println("Is anagram substring: " + isAnagramSubstring(input1, input2));

        String input3 = "hello";
        String input4 = "world";
        System.out.println("Is anagram substring: " + isAnagramSubstring(input3, input4));
    }

    public static boolean isAnagramSubstring(String s1, String s2) {
        // Ensure both strings contain only lowercase English letters
        if (!s1.matches("[a-z]+") || !s2.matches("[a-z]+")) {
            throw new IllegalArgumentException("Input strings must contain only lowercase English letters.");
        }

        if (s2.length() > s1.length()) {
            return false;
        }

        // Create frequency maps for the target string and the first window
        int[] targetFreq = new int[26];
        int[] windowFreq = new int[26];

        for (int i = 0; i < s2.length(); i++) {
            targetFreq[s2.charAt(i) - 'a']++;
            windowFreq[s1.charAt(i) - 'a']++;
        }

        // Slide the window over the string
        for (int i = s2.length(); i < s1.length(); i++) {
            if (Arrays.equals(targetFreq, windowFreq)) {
                return true;
            }

            // Slide the window: remove the first character and add the next
            windowFreq[s1.charAt(i - s2.length()) - 'a']--;
            windowFreq[s1.charAt(i) - 'a']++;
        }

        // Check the last window
        return Arrays.equals(targetFreq, windowFreq);
    }
}
