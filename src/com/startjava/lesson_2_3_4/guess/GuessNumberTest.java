package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static final String WELCOME_TEXT = "%nДобро пожаловать в игру - угадай число%n";
    public static final String INPUT_NAME = "Введите имя %s игрока: %n";
    public static final String CONTINUE_TEXT = "%nХотите продолжить игру? [yes/no]: %n";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.format(WELCOME_TEXT);
        System.out.format(INPUT_NAME, "первого");
        Player playerOne = new Player(scanner.next());
        
        System.out.format(INPUT_NAME, "второго");
        Player playerTwo = new Player(scanner.next());
        GuessNumber guessGame = new GuessNumber(playerOne, playerTwo);
        String userAnswer = "yes";

        do {
            guessGame.play();
            do {
                System.out.format(CONTINUE_TEXT);
                userAnswer = scanner.next();
            } while(!userAnswer.equals("no") && !userAnswer.equals("yes"));
        } while(!userAnswer.equals("no"));
    }
}