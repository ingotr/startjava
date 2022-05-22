package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(String mathExpression) {
        int result = 0;
        String[] partsExpression = mathExpression.split(" ");
        int a = Integer.parseInt(partsExpression[0]);
        char sign = partsExpression[1].charAt(0);
        int b = Integer.parseInt(partsExpression[2]);
        switch(sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '^':
                return (int) Math.pow(a, b);
            case '%':
                return a % b;
            default:
                System.out.println("Неизвестный оператор. Повторите ввод");
                System.out.println("Доступные операторы: +, -, *, /, ^, %");
            }
        return result;
    }
}