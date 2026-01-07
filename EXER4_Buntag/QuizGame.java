package EXER4_Polymorphism;

public class QuizGame {
    protected String gameName;
    protected int totalQuestions;

    public QuizGame(String gameName, int totalQuestions) {
        this.gameName = gameName;
        this.totalQuestions = totalQuestions;
    }

    public void startGame() {
        System.out.println("Starting quiz game: " + gameName);
    }

    public String getGameName() {
        return gameName;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }
}
