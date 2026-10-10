import java.util.*;
public class BankTransactionReferenceValidator {
    static String normalizeReference(String raw) {
        String s = raw.trim();
        if (s.length() < 3) return s.toUpperCase();
        return s.substring(0, 3).toUpperCase() + s.substring(3);
    }
    static String validateAndFormat(String ref) {
        if (ref.length() != 14) return "Invalid: wrong length";
        for (int i = 0; i < 3; i++) if (!Character.isLetter(ref.charAt(i))) return "Invalid: bank code must be 3 letters";
        for (int i = 3; i < 14; i++) if (!Character.isDigit(ref.charAt(i))) return "Invalid: body must contain digits";
        return "[" + ref.substring(0, 3) + "] DATE: " + ref.substring(3, 5) + "/" + ref.substring(5, 7) + "/" + ref.substring(7, 9) + " | SEQ: " + ref.substring(9);
    }
    public static void main(String[] args) {
        String s = normalizeReference(new Scanner(System.in).nextLine());
        System.out.println(validateAndFormat(s));
    }
}
