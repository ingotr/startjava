public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    boolean isPlayerWin;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public boolean play(int computerNum, boolean isPlayerOne,int playerNum) {
        String playerOneName = playerOne.getName();
        String playerTwoName = playerTwo.getName();

        while(playerNum != computerNum) {
            if(playerNum > computerNum) {
                System.out.format("Число %d больше того, что загадал компьютер%n", playerNum);
                return false;
            } else if(playerNum < computerNum) {
                System.out.format("Число %d меньше того, что загадал компьютер%n", playerNum);
                return false;
            }
        }
        if(playerNum == computerNum) {
            System.out.println("Компьютер загадал: " + computerNum);
            return true;
        }
        return false;
    }
}