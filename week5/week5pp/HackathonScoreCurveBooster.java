import java.util.*;
public class HackathonScoreCurveBooster {
    static void curveScores(int[] scores, int bonus) { for (int i=0;i<scores.length;i++) scores[i]+=bonus; }
    public static void main(String[] args) { int[] a={70,85,60}; curveScores(a,10); System.out.println(Arrays.toString(a)); }
}
