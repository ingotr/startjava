package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setName("white fang");
        wolfOne.setGender("male");
        wolfOne.setFurColor("white");
        wolfOne.setWeight(104);
        wolfOne.setAge(7);

        System.out.println("wolfOne name = " + wolfOne.getName());
        System.out.println("wolfOne gender = " + wolfOne.getGender());
        System.out.println("wolfOne furColor = " + wolfOne.getFurColor());
        System.out.println("wolfOne weight = " + wolfOne.getWeight());
        System.out.println("wolfOne age = " + wolfOne.getAge());

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}