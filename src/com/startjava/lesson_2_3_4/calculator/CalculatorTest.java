package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "yes";
        
        do {
            System.out.format("Введите математическое выражение в формате " +
                    "%nФормат чисел: целые положительные" +
                    "%nДоступные операторы: +, -, *, /, ^, %%n" +
                    "%n(первое_число пробел знак_операции пробел второе_число): %n");
            String mathExpression = scanner.nextLine();

            System.out.println("результат: " + Calculator.calculate(mathExpression));
            
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.nextLine();
            } while(!userAnswer.equals("no") && !userAnswer.equals("yes"));
        } while(!userAnswer.equals("no"));
    }
}