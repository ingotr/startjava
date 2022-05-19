package com.startjava.lesson_2_3.robot;

public class Jaeger {
    
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
        modelName = "unknown Jaeger";
        mark = "Mark-0";
        origin = "Japan";
        height = 65.0f;
        weight = 2.1f;
        speed = 4;
        strength = 5;
        armor = 3;
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if(height <= 50.0f) {
            this.height = 50.0f;
        }
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if(weight <= 1.5f) {
            this.weight = 1.5f;
        }
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed <= 0) {
            this.speed = 1;
        }
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if(strength <= 0) {
            this.strength = 1;
        }
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if(armor <= 0) {
            this.armor = 1;
        }
        this.armor = armor;
    }

    boolean drift() {
        System.out.println("drifting");
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    String scanKaiju() {
        return "scanning";
    }

    void useWeapon() {
        System.out.println("weapon activated");
    }
}