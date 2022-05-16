import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "yes";
        boolean isRepeat = false;
        boolean isPlayerOne = false;
        boolean isPlayerWin = false;
        Player playerOne = new Player();
        Player playerTwo = new Player();

        do {
            Random random = new Random();
            int computerNum = random.nextInt(101);
            int playerNum = 0;

            if(isRepeat) {
                isPlayerOne = true;
                System.out.format("%nВы выбрали продолжить игру. Игроки останутся без изменений.%n");
                System.out.println("первый игрок: " + playerOne.getName());
                System.out.println("первый игрок: " + playerTwo.getName());
            } else {
                System.out.format("%nДобро пожаловать в игру - угадай число%n");
                System.out.println("Введите имя первого игрока: ");
                String tmp = scanner.next();
                playerOne = new Player(tmp);
                System.out.println("Введите имя второго игрока: ");
                tmp = scanner.next();
                playerTwo = new Player(tmp);
            }
            
            GuessNumber guessGame = new GuessNumber(playerOne, playerTwo);
            computerNum = random.nextInt(101);

            do {
                if(!isPlayerWin) {
                    isPlayerOne = !isPlayerOne;
                }
                if(isPlayerOne) {
                    System.out.format("%nИгрок, " + playerOne.getName() + ". Введите число: %n");
                } else {
                    System.out.format("%nИгрок, " + playerTwo.getName() + ". Введите число: %n");
                }
                
                playerNum = scanner.nextInt();
                isPlayerWin = guessGame.play(computerNum, isPlayerOne, playerNum);
            } while(!isPlayerWin);

            do {
                if(isPlayerOne) {
                    System.out.println("Вы победили! " + playerOne.getName());
                } else {
                    System.out.println("Вы победили! " + playerTwo.getName());
                }
                System.out.format("%nХотите продолжить игру? [yes/no]: %n");
                userAnswer = scanner.next();
                if(userAnswer.equals("yes")) {
                    isRepeat = true;
                }
            } while(!userAnswer.equals("no") && !userAnswer.equals("yes"));
        } while(!userAnswer.equals("no"));
    }
}