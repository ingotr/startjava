public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 10;
        boolean maleSex = true;
        float height = 1.70f;
        char firstNameLetter = "testName".charAt(0);

        if(age > 20) {
            System.out.println("Вы можете пройти на мероприятие");
        } else {
            System.out.println("Можно пройти только с сопровождающим");
        }

        if(!maleSex) {
            System.out.println("Извините. Только мужская вечиринка");
        } else {
            System.out.println("Добро пожаловать");
        }

        if(height < 1.80) {
            System.out.println("Добро пожаловать на борт");
        } else {
            System.out.println("Извините. Ваш рост слишком велик для самолета");
        }

        if(firstNameLetter == 'M') {
            System.out.println("Добро пожаловать");
        } else if(firstNameLetter == 'I') {
            System.out.println("Вы можете пройти после внесения в список.");
        } else {
            System.out.println("Извините. Вашего имени нет в списке");
        }

        System.out.println("\n2. Поиск максимального и минимального числа");
        int firstNum = 10;
        int secondNum = 22;
        int max = 0;
        int min = 0;

        if(firstNum > secondNum) {
            max = firstNum;
            min = secondNum;
        } else if(secondNum > firstNum) {
            max = secondNum;
            min = firstNum;
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

        System.out.println("\n3. Работа с числом");
        int srcNum3 = 0;

        if(srcNum3 == 0) {
            System.out.println("число srcNum3 -- ноль");
        } 

        if(srcNum3 % 2 == 0) {
            System.out.println("число srcNum3 -- четное");
        } else {
            System.out.println("число srcNum3 -- нечетное");
        }

        if(srcNum3 < 0) {
            System.out.println("число srcNum3 -- отрицательноре");
        } else {
            System.out.println("число srcNum3 -- положительное");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 435;
        int num2 = 135;
        int firstDigitNum1 = num1 / 100;
        int firstDigitNum2 = num2 / 100;
        int secondDigitNum1 = (num1 % 100) / 10;
        int secondDigitNum2 = (num2 % 100) / 10;
        int thirdDigitNum1 = (num1 % 100) % 10;
        int thirdDigitNum2 = (num2 % 100) % 10;

        if(firstDigitNum1 == firstDigitNum2) {
            System.out.println("first digits: " + firstDigitNum1 + " " +firstDigitNum2);
        }
        if(secondDigitNum1 == secondDigitNum2) {
            System.out.println("second digits: " + secondDigitNum1 + " " +secondDigitNum2);
        }
        if(thirdDigitNum1 == thirdDigitNum2) {
            System.out.println("third digits: " + thirdDigitNum1 + " " +thirdDigitNum2);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char srcSymbolCode = '\u0057';

        if(srcSymbolCode >= '\u0030' && srcSymbolCode <= '\u0039') {
            System.out.println("это цифра: " + srcSymbolCode + " unicode: " + (int) srcSymbolCode);
        } else if (srcSymbolCode >= '\u0041' && srcSymbolCode <= '\u0059' || srcSymbolCode == '\u005A') {
            System.out.println("это заглавная буква: " + srcSymbolCode + " unicode: " + (int) srcSymbolCode);
        } else if (srcSymbolCode >= '\u0061' && srcSymbolCode <'\u0079' || srcSymbolCode == '\u007A') {
            System.out.println("это строчная буква: " + srcSymbolCode + " unicode: " + (int) srcSymbolCode);
        } else {
            System.out.println("это символ: " + srcSymbolCode + " unicode: " + (int) srcSymbolCode);
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int bankStartSum = 300_000;
        float bankPercent = 0.0f;
        float bankTotalSum = 0;

        if(bankStartSum < 100_000) {
            bankPercent = 0.05f;
        } else if(bankStartSum >= 100_000 && bankStartSum <= 300_000) {
            bankPercent = 0.07f;
        } else {
            bankPercent = 0.1f;
        }
        bankTotalSum = bankStartSum + (bankStartSum * bankPercent);
        System.out.println("start sum: " + bankStartSum);
        System.out.println("percent: " + bankPercent);
        System.out.println("total sum: " + bankTotalSum);

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 0;
        int programmingGrade = 0;
        int averageGrade = 0;
        int averagePercent = (historyPercent + programmingPercent) / 2;

        if(historyPercent <= 60) {
            historyGrade = 2;
        } else if(historyPercent > 91) {
            historyGrade = 5;
        } else if(historyPercent > 73) {
            historyGrade = 4;
        } else if(historyPercent > 60){
            historyGrade = 3;
        }

        if(programmingPercent <= 60) {
            programmingGrade = 2;
        } else if(programmingPercent > 91) {
            programmingGrade = 5;
        } else if(programmingPercent > 73) {
            programmingGrade = 4;
        } else if(programmingPercent > 60) {
            programmingGrade = 3;
        }

        averageGrade = (historyGrade + programmingGrade) / 2;
        System.out.println("" + historyGrade + " -- history" );
        System.out.println("" + programmingGrade + " -- programming");
        System.out.println("average grade: " + averageGrade);
        System.out.println("average percent: " + averagePercent);

        System.out.println("\n8. Расчет прибыли");
        int monthRent = 5000;
        int monthRevenue = 13000;
        int productNetcost = 9000;
        int monthInYear = 12;
        int yearRevenue = (monthInYear * monthRevenue) - ((monthInYear * monthRent) + (monthInYear * productNetcost));

        System.out.println("прибыль за год: " + yearRevenue + "р");

        System.out.println("\n9. Определение существования треугольника");
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int angleC = 90;
        float triangleArea = 0.0f;
        boolean isTriangleExist = false;
        char space = ' ';
        char verticalBar = '|';
        char underline = '_';
        char reverseSlash = '\\';

        if(sideA + sideB > sideC) {
            isTriangleExist = true;
        } else if (sideB + sideC > sideA) {
            isTriangleExist = true;
        } else if (sideA + sideC > sideB) {
            isTriangleExist = true;
        }

        if(isTriangleExist) {
            System.out.println("треугольник существует");
            System.out.println("катет 1: " + sideA);
            System.out.println("катет 2: " + sideB);
            System.out.println("гипотенуза: " + sideC);
            triangleArea = (float) 0.5 * (sideA + sideB);
            System.out.println("площадь треугольника: " + triangleArea);

            System.out.println("" + verticalBar + reverseSlash);
            System.out.println("" + verticalBar + space + reverseSlash);
            System.out.println("" + verticalBar + space + space + reverseSlash);
            System.out.println("" + verticalBar + underline + underline + underline +reverseSlash);
        } else {
            System.out.println("треуголник не существует");
        }

        System.out.println("\n10. Подсчет количества банкнот");
        int srcSum = 567;
        int banknoteOne = 1;
        int banknoteTen = 10;
        int banknoteFifty = 50;
        int banknoteFiftyAmount = srcSum / banknoteFifty;
        int banknoteTenAmount = (srcSum % banknoteFifty) / banknoteTen;
        int banknoteOneAmout = (srcSum % banknoteFifty) % banknoteTen;
        int totalSum = (banknoteFiftyAmount * banknoteFifty) + (banknoteTenAmount * banknoteTen) + (banknoteOneAmout * banknoteOne);
        
        System.out.println("" + banknoteFifty +": " + banknoteFiftyAmount);
        System.out.println("" + banknoteTen +": " + banknoteTenAmount);
        System.out.println("" + banknoteOne +": " + banknoteOneAmout);
        System.out.println("totalSum: " + totalSum);
     }
}