import java.util.*;
public class ExaminationQuestionGrader {
    interface Grader {int grade(String answer,String correct);}
    static class ExactGrader implements Grader {public int grade(String a,String c){return a.trim().equalsIgnoreCase(c.trim())?1:0;}}
    static class MultipleChoiceGrader implements Grader {public int grade(String a,String c){return a.trim().equalsIgnoreCase(c.trim())?1:0;}}
    public static void main(String[] args){Scanner sc=new Scanner(System.in);String correct=sc.nextLine();String answer=sc.nextLine();System.out.println(new ExactGrader().grade(answer,correct)==1?"Correct":"Incorrect");}
}
