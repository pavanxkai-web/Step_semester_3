import java.util.*;
public class VowelConsonantCounter {
    static void countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) >= 0) vowels++; else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);
    }
    public static void main(String[] args) { countVowelsAndConsonants(new Scanner(System.in).nextLine()); }
}
