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
        int hiddenNumber = random.nextInt(100) + 1;

        runGameplay(hiddenNumber);
    }

    private void runGameplay(int hiddenNumber) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.format("%nИгрок, " + playerOne.getName() + ". Введите число: %n");
            playerOne.setNumber(scanner.nextInt());
            if(compareNums(hiddenNumber, playerOne.getNumber())) {
                break;
            }
            System.out.format("%nИгрок, " + playerTwo.getName() + ". Введите число: %n");
            playerTwo.setNumber(scanner.nextInt());
            if(compareNums(hiddenNumber, playerTwo.getNumber())) {
                break;
            }
        } while(true);
    }

    private boolean compareNums(int hiddenNumber, int playerNum) {
        if(playerNum == hiddenNumber) {
            System.out.println("Компьютер загадал: " + hiddenNumber);
            if(playerNum == playerOne.getNumber()) {
                System.out.println("Вы победили! " + playerOne.getName());
            } else {
                System.out.println("Вы победили! " + playerTwo.getName());
            }
            return true;
        }

        if(playerNum > hiddenNumber) {
            System.out.format("Число %d больше того, что загадал компьютер%n", playerNum);
        } else if(playerNum < hiddenNumber) {
            System.out.format("Число %d меньше того, что загадал компьютер%n", playerNum);
        } 

        return false;
    }
}