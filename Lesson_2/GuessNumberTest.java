import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("%nДобро пожаловать в игру - угадай число%n");
        System.out.println("Введите имя первого игрока: ");
        String tmp = scanner.next();
        Player playerOne = new Player(tmp);
        
        System.out.println("Введите имя второго игрока: ");
        tmp = scanner.next();
        Player playerTwo = new Player(tmp);
        GuessNumber guessGame = new GuessNumber(playerOne, playerTwo);

        String userAnswer = "yes";
        boolean isRepeat = false;

        do {
            if(isRepeat) {
                System.out.format("%nВы выбрали продолжить игру. Игроки останутся без изменений.%n");
                System.out.println("первый игрок: " + playerOne.getName());
                System.out.println("первый игрок: " + playerTwo.getName());
            }

            guessGame.play();
            do {
                System.out.format("%nХотите продолжить игру? [yes/no]: %n");
                userAnswer = scanner.next();
                if(userAnswer.equals("yes")) {
                    isRepeat = true;
                }
            } while(!userAnswer.equals("no") && !userAnswer.equals("yes"));
        } while(!userAnswer.equals("no"));
    }
}