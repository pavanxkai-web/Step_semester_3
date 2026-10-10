public class SecondBestScore {

    // Returns the second-highest DISTINCT score, or -1 if it does not exist.
    public static int secondHighest(int[] scores) {
        if (scores == null || scores.length < 2) {
            return -1;
        }

        int highest = -1;
        int second = -1;

        for (int score : scores) {
            if (score > highest) {
                second = highest;
                highest = score;
            } else if (score < highest && score > second) {
                second = score;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] scores1 = {45, 78, 92, 78, 60};
        int[] scores2 = {50, 50, 50};

        System.out.println(secondHighest(scores1)); // 78
        System.out.println(secondHighest(scores2)); // -1
    }
}
