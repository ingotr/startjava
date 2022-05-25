package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    public static final String PLAYER_WIN = "Игрок %s угадал число %d с %d попытки%n";
    public static final String PLAYER_INPUT = "%nИгрок, %s. Введите число: %n";
    public static final String GREATER_THAN_HIDDEN = "Число %d больше того, что загадал компьютер%n";
    public static final String LESS_THAN_HIDDEN = "Число %d меньше того, что загадал компьютер%n";
    public static final String COMPUTER_GUESSED = "Компьютер загадал: ";
    public static final String ZERO_ATTEMPTS_TEXT = "У %s закончились попытки";
    public static final String LIST_NUMBERS = "Все названные игроками числа";
    public static final String LIST_TITLE = "%nЧисла %s ";
    public static final String NUMBER_WARNING = "Введите цело число в интервале от 1 до 100(включительно)";
    public static final String ATTEMPTS_TEXT = "У каждого игрока - 10 попыток, чтобы угадать число";
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
        playerOne.resetCountAttempts();
        playerTwo.resetCountAttempts();
    }

    private void runGameplay(int hiddenNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ATTEMPTS_TEXT);
        do {
            inputNumber(scanner, playerOne);
            if (compareNumbers(hiddenNumber, playerOne.getNumber())) {
                System.out.printf(PLAYER_WIN,
                        playerOne.getName(), hiddenNumber, playerOne.getCountAttempts());
                break;
            }
            countCountAttempts(playerOne);

            inputNumber(scanner, playerTwo);
            if (compareNumbers(hiddenNumber, playerTwo.getNumber())) {
                System.out.printf(PLAYER_WIN,
                        playerTwo.getName(), hiddenNumber, playerTwo.getCountAttempts());
                break;
            }
            countCountAttempts(playerTwo);

        } while (playerOne.getCountAttempts() < MAX_ATTEMPTS_COUNT && playerTwo.getCountAttempts() < MAX_ATTEMPTS_COUNT);

        printPlayerStatistics();
    }

    private void inputNumber(Scanner scanner, Player player) {
        System.out.format(PLAYER_INPUT, player.getName());
        if(!player.addNumber(scanner.nextInt())) {
            System.out.println(NUMBER_WARNING);
        }
    }

    private boolean compareNumbers(int hiddenNumber, int playerNum) {
        if(playerNum == hiddenNumber) {
            System.out.println(COMPUTER_GUESSED + hiddenNumber);
            return true;
        }

        if(playerNum > hiddenNumber) {
            System.out.format(GREATER_THAN_HIDDEN, playerNum);
        } else {
            System.out.format(LESS_THAN_HIDDEN, playerNum);
        } 

        return false;
    }

    private void countCountAttempts(Player player) {
        if(player.getCountAttempts() == MAX_ATTEMPTS_COUNT) {
            System.out.printf(ZERO_ATTEMPTS_TEXT, player.getName());
        }
    }

    private void printPlayerStatistics() {
        System.out.println(LIST_NUMBERS);
        System.out.printf(LIST_TITLE, playerOne.getName());
        printPlayerNumbers(playerOne);
        System.out.printf(LIST_TITLE, playerTwo.getName());
        printPlayerNumbers(playerTwo);
    }

    private void printPlayerNumbers(Player player) {
        int[] copy = player.getCopyNumbers();
        for (int i : copy) {
            System.out.print(i + " ");
        }
    }
}