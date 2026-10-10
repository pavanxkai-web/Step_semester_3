import java.util.*;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[65536];
        for (char c : s.toCharArray()) freq[c]++;
        for (char c : s.toCharArray()) if (freq[c] == 1) { System.out.println(c); return; }
        System.out.println("No non-repeating character");
    }
}
