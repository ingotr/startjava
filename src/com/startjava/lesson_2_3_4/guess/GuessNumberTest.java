package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("%nДобро пожаловать в игру - угадай число%n");

        GuessNumber guessGame = new GuessNumber(createPlayers(scanner));
        String userAnswer = "yes";

        do {
            guessGame.play();
            do {
                System.out.format("%nХотите продолжить игру? [yes/no]: %n");
                userAnswer = scanner.next();
            } while(!userAnswer.equals("no") && !userAnswer.equals("yes"));
        } while(!userAnswer.equals("no"));
    }

    public static Player[] createPlayers(Scanner scanner) {
        Player[] players = new Player[3];
        int i = 0;
        do{
            System.out.format("Введите имя %s игрока: %n", i + 1);
            players[i] = new Player(scanner.next());
            i++;
        } while(i < players.length);
        return players;
    }
}