public class Leaderboard extends QuizGame {
    private String topPlayer;
    private int highScore;

    public Leaderboard(String gameName, int totalQuestions, String topPlayer, int highScore) {
        super(gameName, totalQuestions);
        this.topPlayer = topPlayer;
        this.highScore = highScore;
    }

    public String getTopPlayer() {
        return topPlayer;
    }

    public int getHighScore() {
        return highScore;
    }
}