import java.util.*;
public class PaymentSystemFeeCalculation {
    interface Payment {double finalAmount(double amount);}
    static class Card implements Payment {public double finalAmount(double a){return a*1.02;}}
    static class Wallet implements Payment {public double finalAmount(double a){return a*1.01;}}
    static class BankTransfer implements Payment {public double finalAmount(double a){return a;}}
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String t=sc.next();double a=sc.nextDouble();Payment p=t.equals("CARD")?new Card():t.equals("WALLET")?new Wallet():new BankTransfer();double v=p.finalAmount(a);System.out.printf("%s: %.2f%n",t,v);total+=v;}System.out.printf("Total: %.2f%n",total);}
}
