import java.util.*;
public class FileExtensionValidator {
    static String validateFileExtension(String filename) {
        int dot = filename.lastIndexOf('.');
        if (dot < 0) return "Rejected — invalid file type";
        String ext = filename.substring(dot + 1);
        return ext.equalsIgnoreCase("pdf") || ext.equalsIgnoreCase("docx") || ext.equalsIgnoreCase("zip") ? "Accepted" : "Rejected — invalid file type";
    }
    public static void main(String[] args) { System.out.println(validateFileExtension(new Scanner(System.in).nextLine())); }
}
