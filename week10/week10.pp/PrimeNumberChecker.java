import java.util.*;
public class PrimeNumberChecker {
    public static void main(String[] args){int n=new Scanner(System.in).nextInt();boolean prime=n>1;for(int i=2;i<=Math.sqrt(n)&&prime;i++)if(n%i==0)prime=false;System.out.println(n+(prime?" is prime":" is not prime"));}
}
