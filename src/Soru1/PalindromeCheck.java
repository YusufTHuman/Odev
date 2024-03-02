package Soru1;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir String girişi al
        System.out.print("Enter a String expression: ");
        String originalString = scanner.nextLine();

        // Palindrome kontrolü yap
        if (isPalindrome(originalString)) {
            System.out.println(originalString + " is a palindrome expression.");
        } else {
            System.out.println(originalString + " is not a palindrome expression.");
        }

        scanner.close();
    }

    // Palindrome kontrolü yapan fonksiyon
    private static boolean isPalindrome(String str) {
        // Boşlukları ve büyük/küçük harf farkını göz ardı etmek için
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

