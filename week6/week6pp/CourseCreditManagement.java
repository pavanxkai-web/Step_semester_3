public class CourseCreditManagement {
    static class Course {
        String code,title; int credits,labCredits;
        Course(String c,String t,int cr,int lab){code=c;title=t;credits=cr;labCredits=lab;}
        Course(String c,String t,int cr){this(c,t,cr,0);}
        int totalCredits(){return credits+labCredits;}
    }
    public static void main(String[] args){Course a=new Course("21CSC201J","Data Structures",4);Course b=new Course("21CSC205L","DSA Lab",3,1);System.out.println(a.code+" total credits: "+a.totalCredits());System.out.println(b.code+" total credits: "+b.totalCredits());}
}
