public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int num = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if(num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            num++;
        } while(num <= 21);
        System.out.println("сумма четных чисел = " + sumEven);
        System.out.println("сумма нечетных чисел = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале между (max и min)");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;

        if(num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        if(num3 > num2) {
            max = num3;
        } else {
            min = num3;
        }
        for(int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sumDigits = 0;

        while(srcNum != 0) {
            int digit = srcNum % 10;
            System.out.print(digit);
            sumDigits += (digit);
            srcNum /= 10;
        }
        System.out.format("\nсумма цифр: %d%n", sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int k = 0;
        for(int i = 1; i < 24; i += 2) {
            System.out.format("%,2d ", i);
            k++;
            if(k == 5) {
                k = 0;
                System.out.print("\n");
            }
            if(i == 23 && k < 5) {
                int diffDigits = 5 - k;
                for(k = 0; k < diffDigits; k++) {
                    System.out.format("%,2d ", 0);
                }
            }
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        srcNum = 3141591;
        int copyNum = srcNum;
        int countOnes = 0;

        while(srcNum != 0) {
            if(srcNum % 10 == 1) {
                countOnes++;
            }
            srcNum /= 10;
        }

        String parity = "";
        if(countOnes % 2 == 0) {
            parity = "четное";
        } else {
            parity = "нечетное";
        }
        System.out.format("число %d содержит %d (%s) количество единиц%n", copyNum, countOnes, parity);

        System.out.println("\n6. Отображение фигур в консоли");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("");

        int countRow = 5;
        int countCol = 5;
        while(countRow > 0) {
            while(countCol > 0) {
                System.out.print("#");
                countCol--;
            }
            System.out.print("\n")
;            countRow--;
            countCol = countRow;
        }
        System.out.println("");

        int triangleSize = 3;
        int row = 0;
        int col = 0;

        do {
            col = 0;
            do {
                System.out.print("$ ");
                col++;
            } while(col <= row);
            System.out.println();
            row++;
        } while(row < triangleSize);

        row = triangleSize - 1;
        do {
            col = 0;
            do {
                System.out.print("$ ");
                col++;
            } while (col <= row - 1);
            System.out.println();
            row--;
        } while (row > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        String decTitle = "Dec";
        String charTitle = "Char";

        System.out.println(decTitle + " " + charTitle);
        for(int i = 0; i < 47; i++) {
            if(i % 2 != 0) {
                System.out.printf("%,3d %4c\n", i, ((char) i));
            }
        }
        System.out.println("");

        System.out.println(decTitle + " " + charTitle);
        for(int i = 97; i < 122; i++) {
            if(i % 2 == 0) {
                System.out.printf("%,3d %4c\n", i, ((char) i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        int srcNumCopy = srcNum;
        int reverseNum = 0;
        int digit = 0;

        while(srcNumCopy != 0) {
            digit = srcNumCopy % 10;
            reverseNum = (reverseNum * 10) + digit;
            srcNumCopy /= 10;
        }

        if(reverseNum == srcNum) {
            System.out.println("число " + srcNum + " -- палиндром");
        } else {
            System.out.println("число " + srcNum + " -- не палиндром");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 173254;
        copyNum = srcNum;
        int firstThreeDigits = 0;
        int secondThreeDigits = 0;
        int firstThreeDigitsSum = 0;
        int secondThreeDigitsSum = 0;
        int n = 0;

        while(copyNum != 0) {
            digit = copyNum % 10;
            n++;

            if(n <= 3) {
                secondThreeDigits = (secondThreeDigits * 10) + digit;
                secondThreeDigitsSum += digit;
            }
            if(n > 3) {
                firstThreeDigits = (firstThreeDigits * 10) + digit;
                firstThreeDigitsSum += digit;
            }
            copyNum /= 10;
        }

        System.out.println("Сумма цифр " + firstThreeDigits + " = " + firstThreeDigitsSum);
        System.out.println("Сумма цифр " + secondThreeDigits + " = " + secondThreeDigitsSum);
        if(firstThreeDigitsSum == secondThreeDigitsSum) {
            System.out.println("число " + srcNum + " - счастливое");
        } else {
            System.out.println("число " + srcNum + " - обычное");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("    |");
        for(int i = 2; i < 10; i++) {
            System.out.printf("  %2d", i);
        }
        System.out.printf("%n____| ");
        for(int j = 2; j < 10; j++) {
            System.out.printf("____");
        }

        System.out.printf("%n");
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                if(j == 1) {
                    System.out.printf("%1$3d | ", i * j);
                } else {
                    System.out.printf("%1$3d ", i * j);
                }
            }
            System.out.printf("%n");
        }
    }
}