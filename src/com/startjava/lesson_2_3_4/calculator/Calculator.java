package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        int a = 0;
        try {
            a = Integer.parseInt(partsExpression[0]);
        } catch (Exception e) {
            System.out.println("Первое число - не целое. Введите выражение повторно");
        }
        char sign = 0;
        try {
            sign = partsExpression[1].charAt(0);
        } catch (Exception e) {
            System.out.println("Неизвестный оператор. Введите выражение повторно");
        }
        int b = 0;
        try {
            b = Integer.parseInt(partsExpression[2]);
        } catch (Exception e) {
            System.out.println("Второе число - не целое. Введите выражение повторно");
        }
        if(a > 0 && b > 0) {
            return switch(sign) {
                case '+' : yield a + b;
                case '-' : yield a - b;
                case '*' : yield a * b;
                case '/' : yield a / b;
                case '^' : yield (int) Math.pow(a, b);
                case '%' : yield a % b;
                default : {
                    System.out.println("Неизвестный оператор. Введите выражение повторно");
                    System.out.println("Доступные операторы: +, -, *, /, ^, %");
                    yield -1;
                }
            };
        }
        System.out.println("Неверный формат чисел. Введите выражение повторно");
        return -1;
    }
}