package EXER4_Polymorphism;

public class Quiz extends QuizGame {
    protected String subject;
    protected String difficultyLevel;

    public Quiz(String gameName, int totalQuestions, String subject, String difficultyLevel) {
        super(gameName, totalQuestions);
        this.subject = subject;
        this.difficultyLevel = difficultyLevel;
    }

    // Method to be overridden (runtime polymorphism)
    public void startGame() {
        System.out.println("Starting a general quiz...");
    }

    public String getSubject() {
        return subject;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }
}
