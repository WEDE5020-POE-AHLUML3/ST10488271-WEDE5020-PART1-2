import java.util.Scanner;

public class AppMain{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        AppLogic logic = new AppLogic();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice (ROCK, PAPER, SCISSORS) to play or EXIT to quit: ");

       while (true){
        System.out.println("Your choice: ");
        String input = scanner.nextLine().toUpperCase();

        if (input.equals("EXIT")){
            System.out.println("Thanks for playing! Goodbye.");
            break;
        }
        try {
            AppModel model = new AppModel();
            model.setPlayerChoice(AppModel.Choice.valueOf(input));

            String result = logic.determineWinner(model.getPlayerChoice(), model.getComputerChoice());  
            model.setResult(result);
            System.out.println("Player chose: " + model.getPlayerChoice());
            System.out.println("Computer chose: " + model.getComputerChoice());
            System.out.println("Result: " + model.getResult());
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid choice. Please enter ROCK, PAPER, SCISSORS, or EXIT.");
        }
       }
    }
}