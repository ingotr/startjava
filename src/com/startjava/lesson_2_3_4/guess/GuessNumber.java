package com.startjava.lesson_2_3_4.guess;

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
            inputNumber(scanner, playerOne);
            if(compareNumber(hiddenNumber, playerOne.getNumber())) {
                System.out.println("Вы победили! " + playerOne.getName());
                break;
            }
            inputNumber(scanner, playerTwo);
            if(compareNumber(hiddenNumber, playerTwo.getNumber())) {
                System.out.println("Вы победили! " + playerTwo.getName());
                break;
            }
        } while(true);
    }

    private void inputNumber(Scanner scanner, Player player) {
        System.out.format("%nИгрок, " + player.getName() + ". Введите число: %n");
        player.setNumber(scanner.nextInt());
    }


    private boolean compareNumber(int hiddenNumber, int playerNum) {
        if(playerNum == hiddenNumber) {
            System.out.println("Компьютер загадал: " + hiddenNumber);
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