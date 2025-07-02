package tka_may08_StringLogical;

public class C8_StringAnagramGPT {

    // Function to check if two strings are anagrams
    public static boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a frequency array for 26 lowercase letters
        int[] count = new int[26];

        // Count characters in first string
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
        }

        // Subtract character count using second string
        for (int i = 0; i < str2.length(); i++) {
            count[str2.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        if (isAnagram(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

}
