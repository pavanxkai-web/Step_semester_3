public class StudentCollegeInformationManagement {
    static class College {String name,city;College(String n,String c){name=n;city=c;}}
    static class Student {String name,department;College college;Student(String n,String d,College c){name=n;department=d;college=c;}void display(){System.out.println(name+" | "+department+" | "+college.name+" | "+college.city);}}
    public static void main(String[] args){College c=new College("SRM Institute of Science and Technology","Chennai");new Student("Ravi","CSE Data Science",c).display();}
}
