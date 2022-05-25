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

    public boolean addNumber(int num) {
        if(num <= 0 || num > 100) {
            setCountAttempts();
            return false;
        } else {
            numbers[countAttempts] = num;
        }
        setCountAttempts();
        return true;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void setCountAttempts() {
        countAttempts++;
    }

    public void resetCountAttempts() {
        countAttempts = 0;
    }

    public void resetNumbers() {
        Arrays.fill(numbers, 0, countAttempts, 0);
    }

    public int[] getCopyNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }
}