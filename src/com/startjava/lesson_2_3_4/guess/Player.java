package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    public static final String NUMBER_WARNING = "Введите цело число в интервале от 1 до 100(включительно)";

    private String name;
    private int[] number = new int[10];

    private int tryNumber = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        setTryNumber();
        return number[this.tryNumber - 1];
    }

    public void setNumber(int number) {
        if(number <=0 || number > 100) {
            System.out.println(NUMBER_WARNING);
        } else {
            this.number[this.tryNumber] = number;
        }
    }

    public int getTryNumber() {
        return this.tryNumber;
    }

    public void setTryNumber() {
        ++this.tryNumber;
    }

    public void resetTryNumber(int num) {
        this.tryNumber = num;
    }

    public void resetNumber() {
        Arrays.fill(this.number, 0, this.tryNumber, 0);
    }

    public int[] getCopyNumber() {
        return Arrays.copyOf(number, this.tryNumber);
    }
}