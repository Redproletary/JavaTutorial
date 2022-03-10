package FirstProgram;

public class RockScissorsPaperDemo {
    public static String rps(String p1, String p2) {
        // your code
        if (p1 == "rock" & p2 == "scissors") return "Player 1 won!";
        if (p1 == "scissors" & p2 == "paper") return "Player 1 won!";
        if (p1 == "paper" & p2 == "rock") return "Player 1 won!";

        if (p1 == "scissors" & p2 == "rock") return "Player 2 won!";
        if (p1 == "paper" & p2 == "scissors") return "Player 2 won!";
        if (p1 == "rock" & p2 == "paper") return "Player 2 won!";

        if (p1 == "scissors" & p2 == "scissors") return "Draw!";
        if (p1 == "paper" & p2 == "paper") return "Draw!";
        if (p1 == "rock" & p2 == "rock") return "Draw!";

        return p1;

    } // rps(String, String) method

    public static void main(String[] args) {
        System.out.println(rps("rock", "scissors"));
        System.out.println(rps("scissors", "paper"));
        System.out.println(rps("paper", "rock"));

        System.out.println(rps("scissors", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("rock", "paper"));

        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("paper", "paper"));
        System.out.println(rps("rock", "rock"));
    } // main(String[]) method
} // RockScissorsPaperDemo class
