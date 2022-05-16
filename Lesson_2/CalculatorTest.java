import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "yes";
        
        do {
            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.println("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();

            int result = calculator.calculate(a, b, sign);
            System.out.println(a + " " + sign + " " + b + " = " + result);
            
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                userAnswer = scanner.next();
            } while(!userAnswer.equals("no") && !userAnswer.equals("yes"));
        } while(!userAnswer.equals("no"));
    }
}