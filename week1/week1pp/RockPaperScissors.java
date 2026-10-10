import java.util.*;
public class RockPaperScissors {
    static String playRound(String player, String computer) {
        if (player.equalsIgnoreCase(computer)) return "Draw";
        if ((player.equalsIgnoreCase("Rock") && computer.equals("Scissors")) || (player.equalsIgnoreCase("Paper") && computer.equals("Rock")) || (player.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) return "Player Wins";
        return "Computer Wins";
    }
    public static void main(String[] args) {
        String[] players = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        String[] moves = {"Scissors", "Paper", "Rock"};
        int wins = 0, losses = 0, draws = 0;
        Random random = new Random();
        System.out.println("Round | Player | Computer | Result");
        for (int i = 0; i < players.length; i++) {
            String computer = moves[random.nextInt(moves.length)];
            String result = playRound(players[i], computer);
            System.out.println((i + 1) + " | " + players[i] + " | " + computer + " | " + result);
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
        }
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", wins, losses, draws, wins * 100.0 / players.length);
    }
}
