import java.util.*;
public class StudentGradeAssignment {
    static char grade(int m){if(m>=90)return 'A';if(m>=75)return 'B';if(m>=60)return 'C';if(m>=40)return 'D';return 'F';}
    public static void main(String[] args){Scanner sc=new Scanner(System.in);while(sc.hasNextInt())System.out.println("Grade "+grade(sc.nextInt()));}
}
