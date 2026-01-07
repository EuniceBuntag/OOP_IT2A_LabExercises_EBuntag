package EXER4_Polymorphism;

public class EnglishQuiz extends Quiz {
    private final int numberOfWords;

    public EnglishQuiz(String gameName, int totalQuestions, String subject,
                       String difficultyLevel, int numberOfWords) {
        super(gameName, totalQuestions, subject, difficultyLevel);
        this.numberOfWords = numberOfWords;
    }

    @Override
    public void startGame() {
        System.out.println("Starting English Quiz with vocabulary questions!");
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }
}
