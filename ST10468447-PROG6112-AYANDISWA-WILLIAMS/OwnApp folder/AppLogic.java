import java.util.Random;

public class AppLogic {
    private Random random;

    public AppLogic() {
        random = new Random();
    }
    public AppModel.Choice generateComputerChoice() {
        int pick = random.nextInt(3);
        return AppModel.Choice.values()[pick];
    }
    public String determineWinner(AppModel.Choice player, AppModel.Choice computer) {
        if (player == computer) {
            return "It's a tie!";
        }
        switch (player) {
            case ROCK:
                return (computer == AppModel.Choice.SCISSORS) ? "You win!" : "Computer wins!";
            case PAPER:
                return (computer == AppModel.Choice.ROCK) ? "You win!" : "Computer wins!";
            case SCISSORS:
                return (computer == AppModel.Choice.PAPER) ? "You win!" : "Computer wins!";
            default:
        } 
            return "Error in determining winner.";
        
    }
}