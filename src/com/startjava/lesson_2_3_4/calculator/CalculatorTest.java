package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "yes";
        
        do {
            System.out.format("Введите математическое выражение в формате " +
                    "%n(первое_число пробел знак_операции пробел второе_число): %n");
            String mathExpression = scanner.nextLine();

            int result = calculator.calculate(mathExpression);
            System.out.println("результат: " + result);
            
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.nextLine();
            } while(!userAnswer.equals("no") && !userAnswer.equals("yes"));
        } while(!userAnswer.equals("no"));
    }
}