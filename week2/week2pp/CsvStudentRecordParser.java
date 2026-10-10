import java.util.*;
public class CsvStudentRecordParser {
    static void parseStudentRecord(String line) {
        String[] p = line.split(",", -1);
        if (p.length != 3) System.out.println("Invalid Record");
        else System.out.println("Name: " + p[0].trim() + " | Roll No: " + p[1].trim() + " | Dept: " + p[2].trim());
    }
    public static void main(String[] args) { parseStudentRecord(new Scanner(System.in).nextLine()); }
}
