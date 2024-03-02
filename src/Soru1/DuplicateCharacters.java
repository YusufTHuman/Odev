package Soru1;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "Hello, world";
        findDuplicateCharacters(inputString);
    }

    static void findDuplicateCharacters(String str) {
        // Boşlukları ve büyük-küçük harf farkını göz ardı etmek için String'i küçük harfe dönüştürüyoruz.
        str = str.toLowerCase();

        // Karakterleri ve tekrar sayılarını saklamak için bir Map kullanıyoruz.
        Map<Character, Integer> charCountMap = new HashMap<>();

        // String'i karakterlere ayırıp her bir karakterin tekrar sayısını güncelliyoruz.
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Boşlukları dikkate almıyoruz
            if (currentChar != ' ') {
                // Map'te karakteri kontrol ediyoruz
                if (charCountMap.containsKey(currentChar)) {
                    // Eğer karakter zaten Map'te varsa, tekrar sayısını arttırıyoruz
                    charCountMap.put(currentChar, charCountMap.get(currentChar) + 1);
                } else {
                    // Eğer karakter Map'te yoksa, Map'e ekliyoruz ve tekrar sayısını 1 olarak ayarlıyoruz
                    charCountMap.put(currentChar, 1);
                }
            }
        }

        // Map'teki her bir girişi kontrol edip tekrar eden karakterleri ve tekrar sayılarını yazdırıyoruz
        System.out.println("Recurring characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " kez tekrar ediyor.");
            }
        }
    }
}
