package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static final String INVALID_OPERATOR = "Неизвестный оператор. Введите выражение повторно%n%n";
    public static final String INVALID_FIRST_NUMBER = "Первое число - не целое. Введите выражение повторно%n%n";
    public static final String INVALID_SECOND_NUMBER = "Второе число - не целое. Введите выражение повторно%n%n";
    public static final String INVALID_FORMAT_NUMBER = "Неверный формат чисел. Введите выражение повторно";
    public static Integer calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        int a;
        try {
            a = Integer.parseInt(partsExpression[0]);
        } catch (Exception e) {
            System.out.format(INVALID_FIRST_NUMBER);
            return null;
        }
        char sign;
        try {
            sign = partsExpression[1].charAt(0);
        } catch (Exception e) {
            System.out.format(INVALID_OPERATOR);
            return null;
        }
        int b;
        try {
            b = Integer.parseInt(partsExpression[2]);
        } catch (Exception e) {
            System.out.format(INVALID_SECOND_NUMBER);
            return null;
        }
        if(a > 0 && b > 0) {
            return switch(sign) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> a / b;
                case '^' -> (int) Math.pow(a, b);
                case '%' -> a % b;
                default -> {
                    System.out.format(INVALID_OPERATOR);
                    yield null;
                }
            };
        }
        System.out.format(INVALID_FORMAT_NUMBER);
        return null;
    }
}