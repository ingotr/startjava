public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if(i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while(i <= 21);
        System.out.println("even sum: " + sumEven);
        System.out.println("odd sum: " + sumOdd);

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
        for(int i2 = ++min; i2 < max; i2++) {
            System.out.print(i2 + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int srcNumDigitSum = 0;

        while(srcNum != 0) {
            System.out.print("" + srcNum % 10);
            srcNumDigitSum += (srcNum % 10);
            srcNum /= 10;
        }
        System.out.println("\nsrcNum sum: " + srcNumDigitSum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int j4 = 0;
        for(int i4 = 1; i4 < 24; i4 += 2) {
            System.out.format("%,2d ", i4);
            j4++;
            if(j4 == 5) {
                j4 = 0;
                System.out.print("\n");
            }
            if(i4 == 23) {
                System.out.format("%,2d %,2d %,2d ", 0, 0, 0);
            }
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        int srcNum2 = 3141591;
        int oneAmount = 0;

        while(srcNum2 != 0) {
            if(srcNum2 % 10 == 1) {
                oneAmount++;
            }
            srcNum2 /= 10;
        }

        if(oneAmount % 2 == 0) {
            System.out.println("число единиц - четное");
        } else {
            System.out.println("число единиц - нечетное");
        }
        System.out.println("one amount: " + oneAmount);

        System.out.println("\n6. Отображение фигур в консоли");
        for(int i6 = 0; i6 < 5; i6++) {
            for(int j6 = 0; j6 < 10; j6++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("");

        int triangleI = 5;
        int triangleJ = 5;
        while(triangleI > 0) {
            while(triangleJ > 0) {
                System.out.print("#");
                triangleJ--;
            }
            System.out.print("\n");
            triangleI--;
            triangleJ = triangleI;
        }
        System.out.println("");

        int triangleSize = 3;
        int row = 0;
        int col = 0;

        while(row < triangleSize) {
            col = 0;
            while(col <= row) {
                System.out.print("$ ");
                col++;
            }
            System.out.println();
            row++;
        }

        row = triangleSize - 1;
        while (row >= 0) {
            col = 0;
            while (col <= row - 1) {
                System.out.print("$ ");
                col++;
            }
            System.out.println();
            row--;
        }

        System.out.println("\n7. Отображение ASCII-символов");
        String decTitle = "Dec";
        String charTitle = "Char";

        System.out.println(decTitle + " " + charTitle);
        for(int i7 = 0; i7 < 47; i7++) {
            if(i7 % 2 != 0) {
                System.out.printf("%,3d %4c\n", i7, ((char) i7));
            }
        }
        System.out.println("");

        System.out.println(decTitle + " " + charTitle);
        for(int i7 = 97; i7 < 122; i7++) {
            if(i7 % 2 == 0) {
                System.out.printf("%,3d %4c\n", i7, ((char) i7));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int srcNum8 = 1234321;
        int copyNum8 = srcNum8;
        int reverseNum8 = 0;
        int digit = 0;

        while(copyNum8 != 0) {
            digit = copyNum8 % 10;
            reverseNum8 = (reverseNum8 * 10) + digit;
            copyNum8 /= 10;
        }

        if(reverseNum8 == srcNum8) {
            System.out.println("число " + srcNum8 + " -- палиндром");
        } else {
            System.out.println("число " + srcNum8 + " -- не палиндром");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int srcNum9 = 173254;
        int copyNum9 = srcNum9;
        int firstThreeDigits = 0;
        int secondThreeDigits = 0;
        int firstThreeDigitsSum = 0;
        int secondThreeDigitsSum = 0;
        int digit2 = 0;
        int i9 = 0;

        while(copyNum9 != 0) {
            digit2 = copyNum9 % 10;
            i9++;

            if(i9 <= 3) {
                secondThreeDigits = (secondThreeDigits * 10) + digit2;
                secondThreeDigitsSum += digit2;
            }
            if(i9 > 3) {
                firstThreeDigits = (firstThreeDigits * 10) + digit2;
                firstThreeDigitsSum += digit2;
            }
            copyNum9 /= 10;
        }

        System.out.println("Сумма цифр " + firstThreeDigits + " = " + firstThreeDigitsSum);
        System.out.println("Сумма цифр " + secondThreeDigits + " = " + secondThreeDigitsSum);
        if(firstThreeDigitsSum == secondThreeDigitsSum) {
            System.out.println("число " + srcNum9 + " - счастливое");
        } else {
            System.out.println("число " + srcNum9 + " - обычное");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for(int i10 = 0; i10 < 10; i10++) {
            for(int j10 = 0; j10 < 10; j10++) {
                if(j10 == 1) {
                    if(i10 == 2) {
                        System.out.printf("%1$3d | ", i10 * j10);
                    } else if(i10 > 2) {
                        System.out.printf("%1$3d | ", i10 * j10);
                    } else if(i10 == 1) {
                        System.out.printf("____|");
                    }
                }

                if(j10 == 0) {
                    if(i10 == 0) {
                        System.out.printf("    |");
                    }
                }

                if(j10 > 1) {
                    if(i10 == 0) {
                        System.out.printf("  %2d", (i10 + 1) * j10);
                    }
                    if(i10 == 1) {
                        System.out.printf("____");
                    } else if(i10 >= 2) {
                        System.out.printf("%1$3d ", i10 * j10);
                    }
                }
            }
            System.out.println("");
        }
    }
}