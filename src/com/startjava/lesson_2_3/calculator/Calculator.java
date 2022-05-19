package com.startjava.lesson_2_3.calculator;

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
                result = 1;
                int i = 0;

                while(i < Math.abs(b)) {
                    result *= a;
                    i++;
                }

                if(b < 0) {
                    result = 1 / result;
                }
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