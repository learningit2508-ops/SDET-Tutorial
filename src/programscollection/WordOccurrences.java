package programscollection;

import java.util.*;

public class WordOccurrences {
    public static void main(String[] args) {
        String sentence = "my name is Claude Claude";
        countWordOccurrences(sentence);
    }

    public static void countWordOccurrences(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Use a HashMap to store word counts
        Map<String, Integer> wordCount = new HashMap<>();

        // Iterate through the words and count occurrences
        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase for case-insensitive comparison
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print each word and its count
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" → " + entry.getValue() + " times");
        }
    }
}
