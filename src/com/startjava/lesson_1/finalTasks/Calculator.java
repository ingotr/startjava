package com.startjava.lesson_1.finalTasks;

public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int result = 0;
        char sign = args[0].charAt(0);
        if(args[0].equals("=*")) {
            sign = args[0].charAt(1);
        }

        if(sign == '+') {
            result  = a + b;
        } else if(sign == '-') {
            result  = a - b;
        } else if(sign == '*') {
            result  = a * b;
        } else if(sign == '/') {
            result  = a / b;
        } else if(sign == '^') {
            result = 1;
            int i = 0;

            while(i < Math.abs(b)) {
                result *= a;
                i++;
            }

            if(b < 0) {
                result = 1 / result;
            }
        } else if(sign == '%') {
            result  = a % b;
        } else {
            System.out.println("Неизвестный оператор. Повторите ввод");
            System.out.println("Доступные операторы: +, -, =*, /, ^^, %");
        }

        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}