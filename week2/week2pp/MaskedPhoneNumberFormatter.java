import java.util.*;
public class MaskedPhoneNumberFormatter {
    static String maskPhoneNumber(String phone) {
        if (!phone.matches("[0-9]{10}")) return "Invalid phone number";
        StringBuilder b = new StringBuilder("XXXXXX");
        b.append("-").append(phone.substring(6));
        return b.toString();
    }
    public static void main(String[] args) { System.out.println(maskPhoneNumber(new Scanner(System.in).nextLine())); }
}
