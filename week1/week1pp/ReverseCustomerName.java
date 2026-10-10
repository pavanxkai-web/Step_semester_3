import java.util.*;
public class ReverseCustomerName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        String[] parts = name.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            if (reversed.length() > 0) reversed.append(" ");
            reversed.append(parts[i]);
        }
        System.out.println(reversed);
    }
}
