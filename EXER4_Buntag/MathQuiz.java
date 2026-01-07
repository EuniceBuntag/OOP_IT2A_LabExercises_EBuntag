package exer4_polymorphism;

public class MathQuiz extends Quiz {
    private final int timeLimit;

    public MathQuiz(String gameName, int totalQuestions, String subject,
                    String difficultyLevel, int timeLimit) {
        super(difficultyLevel, timeLimit, difficultyLevel, difficultyLevel);
        this.timeLimit = timeLimit;
    }

    @Override
    public void startGame() {
        System.out.println("Starting Math Quiz with time limit!");
    }

    public int getTimeLimit() {
        return timeLimit;
    }
}
