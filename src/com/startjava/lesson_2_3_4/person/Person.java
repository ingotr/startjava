package com.startjava.lesson_2_3_4.person;

public class Person {

    String gender = "male";
    String name = "Иван Васильевич";
    String job = "в творческом поиске";
    float height = 1.84f;
    int weight = 93;
    int age = 60;

    void walk() {
        System.out.println("гуляет в парке");
    }

    String seat() {
        return "sitting";
    }

    void run() {
        System.out.println("пробегает 10 км и приходит в форму");
        weight--;
    }

    void talk() {
        System.out.println("Меняю профессию");
    }

    boolean learnJava() {
        return true;
    }
}