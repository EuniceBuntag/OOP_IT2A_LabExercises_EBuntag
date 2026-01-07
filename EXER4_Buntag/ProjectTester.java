package EXER4_Polymorphism;
..Quiz;
public class ProjectTester {
    public static void main(String[] args) {

        User user = new User("Jessa", 85);

        // Polymorphic references
        Quiz quiz1 = new MathQuiz("Educational Quiz Game", 10,
                "Math", "Medium", 30);

        Quiz quiz2 = new EnglishQuiz("Educational Quiz Game", 10,
                "English", "Easy", 20);

        System.out.println("🎮 Game: " + quiz1.getGameName());
        System.out.println("👩‍🎓 User: " + user.getUsername());
        System.out.println();

        // Runtime polymorphism
        quiz1.startGame();
        quiz2.startGame();

        System.out.println("\n🏆 Leaderboard:");
        Leaderboard leaderboard = new Leaderboard();
        leaderboard.display();
        leaderboard.display("Jessa", 100);
    }
}
