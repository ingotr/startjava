package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static final String INVALID_OPERATOR = "Неизвестный оператор. Введите выражение повторно%n%n";
    public static final String INVALID_FIRST_NUMBER = "Первое число - не целое. Введите выражение повторно%n%n";
    public static final String INVALID_SECOND_NUMBER = "Второе число - не целое. Введите выражение повторно%n%n";
    public static final String INVALID_FORMAT_NUMBER = "Неверный формат чисел. Введите выражение повторно";

    public static Integer calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        Integer a = checkNum(partsExpression[0], INVALID_FIRST_NUMBER);
        Character sign = checkSign(partsExpression[1]);
        Integer b = checkNum(partsExpression[2], INVALID_SECOND_NUMBER);

        try {
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
        } catch(NullPointerException npe) {
            System.out.format(INVALID_FORMAT_NUMBER);
        }
        return null;
    }

    public static Integer checkNum(String partsExpression, String textWarning) {
        try {
            return Integer.parseInt(partsExpression);
        } catch (NumberFormatException e) {
            System.out.format(textWarning);
            return null;
        }
    }

    public static Character checkSign(String partsExpression) {
        try {
            return partsExpression.charAt(0);
        } catch (Exception e) {
            System.out.format(INVALID_OPERATOR);
            return null;
        }
    }
}