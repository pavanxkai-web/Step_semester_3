import java.util.*;
public class StudentResultCardGenerator {
    static class Student {String name;int[] marks;Student(String n,int[] m){name=n;marks=m;}double average(){return (marks[0]+marks[1]+marks[2])/3.0;}char grade(){double a=average();if(a>=75)return 'B';if(a>=60)return 'C';if(a>=40)return 'D';return 'F';}}
    public static void main(String[] args){Scanner sc=new Scanner(System.in);while(sc.hasNext()){String n=sc.next();int[] m={sc.nextInt(),sc.nextInt(),sc.nextInt()};Student s=new Student(n,m);System.out.printf("%s: Average %.1f, Grade %c%n",n.toUpperCase(),s.average(),s.grade());}}
}
