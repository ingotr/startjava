package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private static final int MAX_ATTEMPTS_COUNT = 9;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        Random random = new Random();
        int hiddenNumber = random.nextInt(100) + 1;

        initGame();
        runGameplay(hiddenNumber);
    }

    private void initGame() {
        this.playerOne.resetNumbers();
        this.playerTwo.resetNumbers();
    }

    private void runGameplay(int hiddenNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока - 10 попыток, чтобы угадать число");
        do {
            inputNumber(scanner, playerOne);
            if (compareNumbers(hiddenNumber, playerOne)) {
                break;
            }
            checkCountAttempts(playerOne);

            inputNumber(scanner, playerTwo);
            if (compareNumbers(hiddenNumber, playerTwo)) {
                break;
            }
            checkCountAttempts(playerTwo);

        } while (playerTwo.getCountAttempts() < MAX_ATTEMPTS_COUNT);

        System.out.printf("%nВсе названные игроками числа");
        printPlayerNumbers(playerOne);
        printPlayerNumbers(playerTwo);
    }

    private void inputNumber(Scanner scanner, Player player) {
        System.out.format("%nИгрок, %s. Введите число: %n", player.getName());
        if(!player.addNumber(scanner.nextInt())) {
            System.out.println("Ваше число не попадает в интервал от 1 до 100(включительно)");
        }
    }

    private boolean compareNumbers(int hiddenNumber, Player player) {
        if(player.getNumber() == hiddenNumber) {
            System.out.println("Компьютер загадал: " + hiddenNumber);
            System.out.printf("Игрок %s угадал число %d с %d попытки%n",
                    player.getName(), hiddenNumber, player.getCountAttempts());
            return true;
        }

        if(player.getNumber() > hiddenNumber) {
            System.out.format("Число %d больше того, что загадал компьютер%n", player.getNumber());
        } else {
            System.out.format("Число %d меньше того, что загадал компьютер%n", player.getNumber());
        } 

        return false;
    }

    private void checkCountAttempts(Player player) {
        if(player.getCountAttempts() == MAX_ATTEMPTS_COUNT) {
            System.out.printf("У %s закончились попытки", player.getName());
        }
    }

    private void printPlayerNumbers(Player player) {
        System.out.printf("%nЧисла %s: ", player.getName());
        int[] numbers = player.getCopyNumbers();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}