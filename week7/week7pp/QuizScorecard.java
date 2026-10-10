public class QuizScorecard {
    private final boolean[] results;
    private int recorded;
    public QuizScorecard(int questions){results=new boolean[questions];}
    public void recordAnswer(boolean correct){if(recorded<results.length)results[recorded++]=correct;}
    public int getScore(){int score=0;for(int i=0;i<recorded;i++)if(results[i])score++;return score;}
    public static void main(String[] args){QuizScorecard s=new QuizScorecard(4);s.recordAnswer(true);s.recordAnswer(true);s.recordAnswer(false);s.recordAnswer(true);System.out.println(s.getScore());}
}
