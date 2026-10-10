import java.util.*;
public class VowelAndConsonantCounter {
    public static void main(String[] args){String s=new Scanner(System.in).nextLine().toLowerCase();int v=0,c=0;for(char x:s.toCharArray())if(x>='a'&&x<='z'){if("aeiou".indexOf(x)>=0)v++;else c++;}System.out.println("Vowels: "+v);System.out.println("Consonants: "+c);}
}
