import java.time.*;
import java.util.*;
public class LibraryItemDueDateCalculator {
    static LocalDate dueDate(String type){int days=type.equals("BOOK")?14:type.equals("DVD")?7:3;return LocalDate.of(2023,10,26).plusDays(days);}
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=Integer.parseInt(sc.nextLine().trim());for(int i=0;i<n;i++){String line=sc.nextLine().trim();int space=line.indexOf(' ');String type=line.substring(0,space);String title=line.substring(space+1).replace("\\\"","");System.out.println(title+": "+dueDate(type));}}
}
