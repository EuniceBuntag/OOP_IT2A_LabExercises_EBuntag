package EXER4_Polymorphism;

public class Leaderboard {

    public void display() {
        System.out.println("Displaying leaderboard...");
    }

    // Compile-time polymorphism (overloading)
    public void display(String topPlayer, int highScore) {
        System.out.println("Top Player: " + topPlayer);
        System.out.println("High Score: " + highScore);
    }
}
