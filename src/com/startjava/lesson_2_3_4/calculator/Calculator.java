package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(int a, int b, char sign) {
        int result = 0;
        switch(sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = (int) Math.pow(a, b);
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Неизвестный оператор. Повторите ввод");
                System.out.println("Доступные операторы: +, -, *, /, ^, %");
            }
        return result;
    }
}