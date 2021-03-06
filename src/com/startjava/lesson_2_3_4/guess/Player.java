package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int countAttempts;
    private int winCount;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[countAttempts - 1];
    }

    public boolean addNumber(int number) {
        countAttempts++;
        if(number <= 0 || number > 100) {
            return false;
        }
        numbers[countAttempts - 1] = number;
        return true;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void resetNumbers() {
        Arrays.fill(numbers, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public int[] getCopyNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount() {
        winCount++;
    }

    public void resetWinCount() {
        winCount = 0;
    }
}