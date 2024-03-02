package Soru1;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Karakter sayılarını say
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // İlk tekrar etmeyen karakteri bul
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        // Eğer tekrar etmeyen karakter bulunamazsa boş karakteri döndür
        return '\0';
    }

    public static void main(String[] args) {
        // Örnek kullanım
        String inputString = "hello";
        char result = findFirstNonRepeatedChar(inputString);

        if (result != '\0') {
            System.out.println("First non-recurring character: " + result);
        } else {
            System.out.println("No non-repeating characters found.");
        }
    }
}
