public class AppModel {
    public enum Choice {
        ROCK, PAPER, SCISSORS
    }
    private Choice playerChoice;
    private Choice computerChoice;
    private String result;

    public Choice getPlayerChoice() {
        return playerChoice;
    }
     public void setPlayerChoice(Choice playerChoice) {
        this.playerChoice = playerChoice;
     }
     public Choice getComputerChoice() {
        return computerChoice;
     }
     public void setComputerChoice(Choice computerChoice) {
        this.computerChoice = computerChoice;
     }
        public String getResult() {
            return result;
         
     }

        public void setResult(String result) {
            this.result = result;
        }
}