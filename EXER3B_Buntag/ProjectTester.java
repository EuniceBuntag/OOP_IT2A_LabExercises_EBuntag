public class ProjectTester {
    public static void main(String[] args) {

        // Create a User
        User user = new User("Educational Quiz Game", 10, "Jessa", 85);

        // Create MathQuiz and EnglishQuiz
        MathQuiz mathQuiz = new MathQuiz("Educational Quiz Game", 10, "Math", "Medium", 30);
        EnglishQuiz englishQuiz = new EnglishQuiz("Educational Quiz Game", 10, "English", "Easy", 20);

        // Create Leaderboard
        Leaderboard leaderboard = new Leaderboard("Educational Quiz Game", 10, "Jessa", 100);

        // Display information
        System.out.println("🎮 Quiz Game Details:");
        System.out.println("Game Name: " + user.getGameName());
        System.out.println("Total Questions: " + user.getTotalQuestions());

        System.out.println("\n👩‍🎓 User Info:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Score: " + user.getScore());

        System.out.println("\n🧮 Math Quiz Details:");
        System.out.println("Subject: " + mathQuiz.getSubject());
        System.out.println("Difficulty: " + mathQuiz.getDifficultyLevel());
        System.out.println("Time Limit: " + mathQuiz.getTimeLimit() + " seconds");

        System.out.println("\n📖 English Quiz Details:");
        System.out.println("Subject: " + englishQuiz.getSubject());
        System.out.println("Difficulty: " + englishQuiz.getDifficultyLevel());
        System.out.println("Number of Words: " + englishQuiz.getNumberOfWords());

        System.out.println("\n🏆 Leaderboard:");
        System.out.println("Top Player: " + leaderboard.getTopPlayer());
        System.out.println("High Score: " + leaderboard.getHighScore());
    }
}