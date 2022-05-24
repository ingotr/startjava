package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    public static final String PLAYER_WIN = "Игрок %s угадал число %d с %d попытки%n";
    public static final String PLAYER_INPUT = "%nИгрок, %s. Введите число: %n";
    public static final String GREATER_THAN_HIDDEN = "Число %d больше того, что загадал компьютер%n";
    public static final String LESS_THAN_HIDDEN = "Число %d меньше того, что загадал компьютер%n";
    public static final String COMPUTER_GUESSED = "Компьютер загадал: ";
    public static final String ZERO_TRY_COUNT = "У %s закончились попытки";
    public static final String LIST_NUMBER = "Все названные игроками числа";
    public static final String LIST_TITLE = "%nЧисла %s ";
    private static final int MAX_TRY_NUMBER = 9;
    private Player playerOne;
    private Player playerTwo;
    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        Random random = new Random();
        int hiddenNumber = random.nextInt(100) + 1;

        resetPlayerData();
        runGameplay(hiddenNumber);
    }

    private void resetPlayerData() {
        this.playerOne.resetNumber();
        this.playerTwo.resetNumber();
        playerOne.resetTryNumber(0);
        playerTwo.resetTryNumber(0);
    }

    private void runGameplay(int hiddenNumber) {
        Scanner scanner = new Scanner(System.in);
        do {
            inputNumber(scanner, playerOne);
            if (compareNumber(hiddenNumber, playerOne.getNumber())) {
                System.out.printf(PLAYER_WIN,
                        playerOne.getName(), hiddenNumber, playerOne.getTryNumber());
                break;
            }
            countTryNumber(playerOne);

            inputNumber(scanner, playerTwo);
            if (compareNumber(hiddenNumber, playerTwo.getNumber())) {
                System.out.printf(PLAYER_WIN,
                        playerTwo.getName(), hiddenNumber, playerTwo.getTryNumber());
                break;
            }
            countTryNumber(playerTwo);

        } while (playerOne.getTryNumber() < MAX_TRY_NUMBER && playerTwo.getTryNumber() < MAX_TRY_NUMBER);

        printPlayerStatistics();
    }

    private void inputNumber(Scanner scanner, Player player) {
        System.out.format(PLAYER_INPUT, player.getName());
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumber(int hiddenNumber, int playerNum) {
        if(playerNum == hiddenNumber) {
            System.out.println(COMPUTER_GUESSED + hiddenNumber);
            return true;
        }

        if(playerNum > hiddenNumber) {
            System.out.format(GREATER_THAN_HIDDEN, playerNum);
        } else if(playerNum < hiddenNumber) {
            System.out.format(LESS_THAN_HIDDEN, playerNum);
        } 

        return false;
    }

    private void countTryNumber(Player player) {
        if(player.getTryNumber() == MAX_TRY_NUMBER) {
            System.out.printf(ZERO_TRY_COUNT, player.getName());
        }
    }

    private void printPlayerStatistics() {
        System.out.println(LIST_NUMBER);
        System.out.printf(LIST_TITLE, playerOne.getName());
        printPlayerNumber(playerOne);
        System.out.printf(LIST_TITLE, playerTwo.getName());
        printPlayerNumber(playerTwo);
    }

    private void printPlayerNumber(Player player) {
        int[] copy = player.getCopyNumber();
        for (int i : copy) {
            System.out.print(i + " ");
        }
    }
}