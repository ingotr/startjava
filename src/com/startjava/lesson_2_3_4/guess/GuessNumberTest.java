package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("%nДобро пожаловать в игру - угадай число%n");
        System.out.format("Введите имя %s игрока: %n", "первого");
        Player playerOne = new Player(scanner.next());
        
        System.out.format("Введите имя %s игрока: %n", "второго");
        Player playerTwo = new Player(scanner.next());
        GuessNumber guessGame = new GuessNumber(playerOne, playerTwo);
        String userAnswer = "yes";

        do {
            guessGame.play();
            do {
                System.out.format("%nХотите продолжить игру? [yes/no]: %n");
                userAnswer = scanner.next();
            } while(!userAnswer.equals("no") && !userAnswer.equals("yes"));
        } while(!userAnswer.equals("no"));
    }
}