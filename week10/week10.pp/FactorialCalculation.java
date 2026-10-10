import java.util.*;
import java.math.*;
public class FactorialCalculation {
    public static void main(String[] args){int n=new Scanner(System.in).nextInt();BigInteger f=BigInteger.ONE;for(int i=2;i<=n;i++)f=f.multiply(BigInteger.valueOf(i));System.out.println(f);}
}
