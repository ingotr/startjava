package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static final String INTRO_TEXT = """
            Введите математическое выражение в формате
            Формат чисел: целые положительные
            Доступные операторы: +, -, *, /, ^, %
            (первое_число пробел знак_операции пробел второе_число):""";
    public static final String CONTINUE_TEXT = "Хотите продолжить вычисления? [yes/no]: ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        
        do {
            Integer result;
            do {
                System.out.println(INTRO_TEXT);
                result = Calculator.calculate(scanner.nextLine());
            } while(result == null);
            System.out.format("результат: %d%n", result);
            do {
                System.out.println(CONTINUE_TEXT);
                userAnswer = scanner.nextLine();
            } while(!userAnswer.equals("no") && !userAnswer.equals("yes"));
        } while(!userAnswer.equals("no"));
    }
}