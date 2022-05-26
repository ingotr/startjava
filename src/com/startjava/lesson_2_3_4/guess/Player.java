package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int countAttempts = 0;

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
        if(number <= 0 || number > 100) {
            countAttempts++;
            return false;
        }
        numbers[countAttempts] = number;
        countAttempts++;
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
}