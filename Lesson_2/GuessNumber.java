import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        Random random = new Random();
        int computerNum = random.nextInt(100) + 1;

        runGameCycle(computerNum);
    }

    private void runGameCycle(int computerNum) {
        Scanner scanner = new Scanner(System.in);
        int playerNum = 0;
        boolean isPlayerOne = false;
        boolean isPlayerWin = false;

        do {
            if(!isPlayerWin) {
                isPlayerOne = !isPlayerOne;
            }
            if(isPlayerOne) {
                System.out.format("%nИгрок, " + playerOne.getName() + ". Введите число: %n");
                playerNum = scanner.nextInt();
                isPlayerOne = checkPlayerNum(computerNum, playerNum);
            } else {
                System.out.format("%nИгрок, " + playerTwo.getName() + ". Введите число: %n");
                playerNum = scanner.nextInt();
                isPlayerOne = !checkPlayerNum(computerNum, playerNum);
            }
            
            isPlayerWin = checkPlayerWin(computerNum, playerNum, isPlayerOne);
        } while(!isPlayerWin);
    }

    private boolean checkPlayerNum(int computerNum, int playerNum) {
        while(playerNum != computerNum) {
            if(playerNum <=0 || playerNum > 100) {
                System.out.println("Введите цело число в интервале от 1 до 100(включительно)");
            } 
            if(playerNum > computerNum) {
                System.out.format("Число %d больше того, что загадал компьютер%n", playerNum);
                return true;
            } else if(playerNum < computerNum) {
                System.out.format("Число %d меньше того, что загадал компьютер%n", playerNum);
                return true;
            } 
        }
        return false;
    }

    private boolean checkPlayerWin(int computerNum, int playerNum, boolean isPlayerOne) {
        if(playerNum == computerNum) {
            System.out.println("Компьютер загадал: " + computerNum);
            if(isPlayerOne) {
                System.out.println("Вы победили! " + playerOne.getName());
            } else {
                System.out.println("Вы победили! " + playerTwo.getName());
            }
            return true;
        }
        return false;
    }
}