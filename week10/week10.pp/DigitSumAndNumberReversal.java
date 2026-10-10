import java.util.*;
public class DigitSumAndNumberReversal {
    public static void main(String[] args){long n=new Scanner(System.in).nextLong(),x=n,rev=0,sum=0;while(x>0){long d=x%10;sum+=d;rev=rev*10+d;x/=10;}System.out.println("Sum of digits: "+sum);System.out.println("Reverse: "+rev);}
}
