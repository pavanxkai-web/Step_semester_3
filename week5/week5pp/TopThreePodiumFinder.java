import java.util.*;
public class TopThreePodiumFinder {
    static int[] findTopThreeScores(int[] scores) {
        int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE,c=Integer.MIN_VALUE;
        for(int x:scores) {
            if(x>=a) { c=b; b=a; a=x; }
            else if(x>=b) { c=b; b=x; }
            else if(x>c) c=x;
        }
        return new int[]{a,b,c};
    }
    public static void main(String[] args) { System.out.println(Arrays.toString(findTopThreeScores(new int[]{45,82,79,90,33,90,61}))); }
}
