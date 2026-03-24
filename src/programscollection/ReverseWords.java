package programscollection;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "abc de f";
        String result = reverseWords(input);
        System.out.println("Reversed Words: " + result);
    }

    public static String reverseWords(String str) {
        char[] chars = str.toCharArray();
        int start = 0;

        for (int i = 0; i <= chars.length; i++) {
            // Check for space or end of the string
            if (i == chars.length || chars[i] == ' ') {
                reverse(chars, start, i - 1); // Reverse the word
                start = i + 1; // Move to the next word
            }
        }

        return new String(chars);
    }

    private static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}