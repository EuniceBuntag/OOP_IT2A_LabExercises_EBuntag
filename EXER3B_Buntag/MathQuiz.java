public class MathQuiz extends Quiz {
    private int timeLimit;

    public MathQuiz(String gameName, int totalQuestions, String subject, String difficultyLevel, int timeLimit) {
        super(gameName, totalQuestions, subject, difficultyLevel);
        this.timeLimit = timeLimit;
    }

    public int getTimeLimit() {
        return timeLimit;
    }
}