public class WeeklyStaffPay {
    static abstract class Staff {String name;Staff(String n){name=n;}abstract double pay();}
    static class FullTime extends Staff {double salary;FullTime(String n,double s){super(n);salary=s;}double pay(){return salary;}}
    static class Hourly extends Staff {double hours,rate;Hourly(String n,double h,double r){super(n);hours=h;rate=r;}double pay(){return Math.min(hours,40)*rate+Math.max(0,hours-40)*rate*1.5;}}
    static class Intern extends Staff {double stipend;Intern(String n,double s){super(n);stipend=s;}double pay(){return stipend;}}
    public static void main(String[] args){Staff[] s={new FullTime("Asha",12000),new Hourly("Ravi",45,200),new Intern("Neha",5000)};double total=0;for(Staff x:s){System.out.printf("%s: %.2f%n",x.name,x.pay());total+=x.pay();}System.out.printf("Total Payroll: %.2f%n",total);}
}
