import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String continueCalculate = "yes";
        int result = 0;

        do {
            System.out.println("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.println("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();

            result = calculator.calculate(a, b, sign);
            System.out.println(a + " " + sign + " " + b + " = " + result);
            
            do {
                if(continueCalculate.equals("no")) {
                    break;
                }
                
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                continueCalculate = scanner.next();
            } while(!((continueCalculate.equals("no") || continueCalculate.equals("yes"))));
        } while(!continueCalculate.equals("no"));
    }
}