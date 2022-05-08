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
            System.out.println("Извините. Только мужская вечеринка");
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

        System.out.println("max: " + (firstNum > secondNum ? firstNum : secondNum));
        System.out.println("min: " + (firstNum < secondNum ? firstNum : secondNum));

        System.out.println("\n3. Работа с числом");
        int srcNum = -12;

        if(srcNum == 0) {
            System.out.println("" + srcNum + " -- ноль");
        } else {
            if(srcNum % 2 == 0) {
                System.out.println("" + srcNum + " -- четное");
            } else {
                System.out.println("" + srcNum + " -- нечетное");
            }

            if(srcNum < 0) {
                System.out.println("" + srcNum + " -- отрицательное");
            } else {
                System.out.println("" + srcNum + " -- положительное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 435;
        int num2 = 135;
        int firstDigitNum1 = num1 / 100;
        int firstDigitNum2 = num2 / 100;
        int secondDigitNum1 = (num1 % 100) / 10;
        int secondDigitNum2 = (num2 % 100) / 10;
        int thirdDigitNum1 = num1 % 10;
        int thirdDigitNum2 = num2 % 10;

        if(firstDigitNum1 == firstDigitNum2) {
            System.out.println("first digits: " + firstDigitNum1 + " " + 
                firstDigitNum2);
        }
        if(secondDigitNum1 == secondDigitNum2) {
            System.out.println("second digits: " + secondDigitNum1 + " " + 
                secondDigitNum2);
        }
        if(thirdDigitNum1 == thirdDigitNum2) {
            System.out.println("third digits: " + thirdDigitNum1 + " " + 
                thirdDigitNum2);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char unknownChar = '\u0057';

        if(unknownChar >= '0' && unknownChar <= '9') {
            System.out.println("это цифра: " + unknownChar + " unicode: " + (int) unknownChar);
        } else if (unknownChar >= 'A' && unknownChar <= 'Z') {
            System.out.println("это заглавная буква: " + unknownChar + " unicode: " + (int) unknownChar);
        } else if (unknownChar >= 'a' && unknownChar <'z') {
            System.out.println("это строчная буква: " + unknownChar + " unicode: " + (int) unknownChar);
        } else {
            System.out.println("это символ: " + unknownChar + " unicode: " + (int) unknownChar);
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
        int historyGrade = 0;
        
        if(historyPercent <= 60) {
            historyGrade = 2;
        } else if(historyPercent > 91) {
            historyGrade = 5;
        } else if(historyPercent > 73) {
            historyGrade = 4;
        } else if(historyPercent > 60){
            historyGrade = 3;
        }

        int programmingPercent = 91;
        int programmingGrade = 0;

        if(programmingPercent <= 60) {
            programmingGrade = 2;
        } else if(programmingPercent > 91) {
            programmingGrade = 5;
        } else if(programmingPercent > 73) {
            programmingGrade = 4;
        } else if(programmingPercent > 60) {
            programmingGrade = 3;
        }

        int averagePercent = (historyPercent + programmingPercent) / 2;
        int averageGrade = (historyGrade + programmingGrade) / 2;
        System.out.println("" + historyGrade + " -- history" );
        System.out.println("" + programmingGrade + " -- programming");
        System.out.println("average grade: " + averageGrade);
        System.out.println("average percent: " + averagePercent);

        System.out.println("\n8. Расчет прибыли");
        int monthRent = 3000;
        int monthRevenue = 13000;
        int productNetcost = 9000;
        int monthInYear = 12;
        int yearRevenue = monthInYear * (monthRevenue - (monthRent + productNetcost));

        if(yearRevenue >= 0) {
            System.out.println("прибыль за год: +" + yearRevenue + "р");
        } else {
            System.out.println("прибыль за год: " + yearRevenue + "р");
        }

        System.out.println("\n9. Определение существования треугольника");
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int angleC = 90;
        boolean isTriangleExist = false;

        if(sideA + sideB > sideC) {
            isTriangleExist = true;
        } else if (sideB + sideC > sideA) {
            isTriangleExist = true;
        } else if (sideA + sideC > sideB) {
            isTriangleExist = true;
        }

        if(isTriangleExist) {
            System.out.println("треугольник существует");
            int hypotenuse = 0;
            int catet1 = 0;
            int catet2 = 0;
            if(sideA > sideB && sideA > sideC) {
                hypotenuse = sideA; 
                catet1 = sideB;
                catet2 = sideC;
            } else if(sideB > sideA && sideB > sideC) {
                hypotenuse = sideB;
                catet1 = sideA;
                catet2 = sideC;
            } else {
                hypotenuse = sideC;
                catet1 = sideA;
                catet2 = sideB;
            }

            System.out.println("гипотенуза: " + hypotenuse);
            System.out.println("катет 1: " + catet1);
            System.out.println("катет 2: " + catet2);
            float triangleArea = (float) 0.5 * (catet1 + catet2);
            System.out.println("площадь треугольника: " + triangleArea);

            char space = ' ';
            char verticalBar = '|';
            char underline = '_';
            char reverseSlash = '\\';
            System.out.println("" + verticalBar + reverseSlash);
            System.out.println("" + verticalBar + space + reverseSlash);
            System.out.println("" + verticalBar + space + space + reverseSlash);
            System.out.println("" + verticalBar + underline + underline + underline +reverseSlash);
        } else {
            System.out.println("треугольник не существует");
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
        
        System.out.println("" + banknoteFifty + ": " + banknoteFiftyAmount);
        System.out.println("" + banknoteTen + ": " + banknoteTenAmount);
        System.out.println("" + banknoteOne + ": " + banknoteOneAmout);
        System.out.println("totalSum: " + totalSum);
     }
}