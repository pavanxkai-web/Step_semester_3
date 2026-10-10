import java.util.*;
public class CandidateShortlistingAndRanking {
    static class Candidate implements Comparable<Candidate> {
        String name; double cgpa; int codingScore;
        Candidate(String n,double c,int s){name=n;cgpa=c;codingScore=s;}
        boolean isEligible(){return cgpa>=7.0 || (cgpa>=6.5 && codingScore>=60);}
        double score(){return cgpa*10 + codingScore*0.5;}
        public int compareTo(Candidate o){return Double.compare(o.score(),score());}
    }
    static String shortlistAndRank(Candidate[] candidates) {
        ArrayList<Candidate> a=new ArrayList<>();
        for(Candidate c:candidates) if(c.isEligible()) a.add(c);
        Collections.sort(a);
        StringJoiner j=new StringJoiner(" | ");
        for(int i=0;i<a.size();i++) j.add((i+1)+". "+a.get(i).name+" ("+a.get(i).score()+")");
        return j.toString();
    }
    public static void main(String[] args) {
        Candidate[] c={new Candidate("Aisha",8.2,40),new Candidate("Rohit",6.8,65),new Candidate("Meena",6.0,90),new Candidate("Karan",7.5,20)};
        System.out.println(shortlistAndRank(c));
    }
}
