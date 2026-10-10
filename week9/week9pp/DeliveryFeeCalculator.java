import java.util.*;
public class DeliveryFeeCalculator {
    interface Delivery {double fee(double weight,double distance);}
    static class Standard implements Delivery {public double fee(double w,double d){return 50+w*10+d*2;}}
    static class Express implements Delivery {public double fee(double w,double d){return 100+w*15+d*3;}}
    static class International implements Delivery {public double fee(double w,double d){return 300+w*25+d*5;}}
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String type=sc.next();double w=sc.nextDouble(),d=sc.nextDouble();Delivery x=type.equals("STANDARD")?new Standard():type.equals("EXPRESS")?new Express():new International();double f=x.fee(w,d);System.out.printf("%s: %.2f%n",type,f);total+=f;}System.out.printf("Total: %.2f%n",total);}
}
