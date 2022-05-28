package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private static final int MAX_ATTEMPTS_COUNT = 9;
    private static final int MAX_GAME_COUNT = 3;
    private Player[] players;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void play() {
        int gameCount = 0;
        int[] playerQueue = generatePlayerQueue();
        setupGame();
        do {
            Random random = new Random();
            int hiddenNumber = random.nextInt(100) + 1;
            System.out.format("Началась %d-я игра%n", (gameCount + 1));
            initGame();
            runGameplay(hiddenNumber, playerQueue);
            gameCount++;
        } while(gameCount < MAX_GAME_COUNT);
        showWinner();
    }

    private int[] generatePlayerQueue() {
        int[] playerQueue = new int[3];

        for(int i = 0; i < playerQueue.length; i++) {
            playerQueue[i] = i;
        }

        shuffleQueue(playerQueue, playerQueue.length);
        return playerQueue;
    }

    private void setupGame() {
        for (Player player: players) {
            player.resetWinCount();
        }
    }

    private void shuffleQueue(int[] array, int length) {
        Random random = new Random();
        for(int i = length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            int temp  = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    private void initGame() {
        for (Player player: players) {
            player.resetNumbers();
        }
    }

    private void runGameplay(int hiddenNumber, int[] playerQueue) {
        System.out.println("У каждого игрока - 10 попыток, чтобы угадать число");
        do {
            if(runGameQueue(hiddenNumber, playerQueue)) {
                break;
            }
        } while (isAttemptsLeft(players));
        printPlayerStatistics();
    }

    private boolean runGameQueue(int hiddenNumber, int[] playerQueue) {
        Scanner scanner = new Scanner(System.in);
        for(int number: playerQueue) {
            inputNumber(scanner, players[number]);
            if (compareNumbers(hiddenNumber, players[number].getNumber())) {
                showPlayerWin(players[number], hiddenNumber);
                return true;
            }
            checkCountAttempts(players[number]);
        }
        return false;
    }

    private boolean isAttemptsLeft(Player[] players) {
        return players[players.length - 1].getCountAttempts() < MAX_ATTEMPTS_COUNT;
    }

    private void inputNumber(Scanner scanner, Player player) {
        System.out.format("%nИгрок, %s. Введите число: %n", player.getName());
        if(!player.addNumber(scanner.nextInt())) {
            System.out.println("Ваше число не попадает в интервал от 1 до 100(включительно)");
        }
    }

    private boolean compareNumbers(int hiddenNumber, int playerNumber) {
        if(playerNumber == hiddenNumber) {
            System.out.println("Компьютер загадал: " + hiddenNumber);
            return true;
        }

        String textDifference = playerNumber > hiddenNumber ? "больше" : "меньше";
        System.out.format("Число %d %s чем то, что загадал компьютер%n", playerNumber, textDifference);

        return false;
    }

    private void showPlayerWin(Player player, int hiddenNumber) {
        player.setWinCount();
        System.out.printf("Игрок %s угадал число %d с %d попытки%n",
                player.getName(), hiddenNumber, player.getCountAttempts());
    }

    private void checkCountAttempts(Player player) {
        if(player.getCountAttempts() == MAX_ATTEMPTS_COUNT) {
            System.out.printf("У %s закончились попытки", player.getName());
        }
    }

    private void printPlayerStatistics() {
        System.out.print("Все названные игроками числа");
        for (Player player: players) {
            System.out.printf("%nЧисла %s: ", player.getName());
            printPlayerNumbers(player);
        }
        System.out.println();
    }

    private void printPlayerNumbers(Player player) {
        int[] copy = player.getCopyNumbers();
        for (int i : copy) {
            System.out.print(i + " ");
        }
    }

    public void showWinner() {
        if(checkWinner() == null) {
            System.out.printf("Ничья!");
        } else {
            System.out.format("Выиграл %s со счетом %d%n", checkWinner().getName(), checkWinner().getWinCount());
        }
    }

    public Player checkWinner() {
        int equalNumber = 0;
        for(int i = 1; i < players.length; i++) {
            if(players[0].getWinCount() == players[i].getWinCount()) {
                ++equalNumber;
            }
        }
        if(equalNumber == players.length - 1) {
            return null;
        }

        int max = players[0].getWinCount();
        Player winner = players[0];
        for(Player player : players) {
            if (max < player.getWinCount()) {
                max = player.getWinCount();
                winner = player;
            }
        }
        return winner;
    }
}