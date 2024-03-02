package Soru1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        Map<String, Integer> wordCountMap = findDuplicateWords(sentence);

        System.out.println("Repetitive words and their numbers::");

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " kez");
            }
        }

        scanner.close();
    }

    private static Map<String, Integer> findDuplicateWords(String sentence) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase(); // Büyük-küçük harf duyarlılığını kaldırmak için
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}

