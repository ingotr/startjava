package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] tempArray = new int[array.length];
        for(int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            tempArray[j] = array[i];
        }
        System.out.print("%Начальный массив: ");
        printArrayOneLine(array);
        System.arraycopy(tempArray, 0, array, 0, tempArray.length);
        System.out.print("Перевернутый массив: ");
        printArrayOneLine(array);

        System.out.format("%n2. Вывод произведения элементов массива%n");
        int[] initialArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = 1;
        for(int i = 1; i < initialArray.length - 1; i++) {
            result *= initialArray[i];
        }
        System.out.println("1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 = " + result);
        System.out.println(initialArray[0] + " индекс: 0");
        System.out.println(initialArray[9] + " индекс: 9");

        System.out.format("%n3. Удаление элементов массива%n");
        double[] sourceArray = new double[15];
        for(int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = Math.random();
        }
        double midNum = sourceArray[7];
        double[] targetArray = new double[sourceArray.length];
        int zeroCount = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            if(sourceArray[i] > midNum) {
                targetArray[i] = 0;
                zeroCount++;
            } else {
                targetArray[i] = sourceArray[i];
            }
        }
        System.out.format("исходный массив: ");
        printArrayOneLine(sourceArray);
        System.out.format("%nизмененный массив: ");
        printArrayOneLine(targetArray);
        System.out.format("%nколичество обнуленных ячеек: %d%n", zeroCount);

        System.out.format("%n4. Вывод элементов массива лесенкой в обратном порядке%n");
        char[] charArray = new char[26];
        int charNum = 65;
        for (int i = 0; i < charArray.length; i++, charNum++) {
            charArray[i] = (char) charNum;
        }
        String targetString = "";
        for(int i = charArray.length - 1; i >= 0; i--) {
            targetString += charArray[i];
            System.out.println(targetString);
        }

        System.out.format("%n5. Работа с max и min числами%n");
        tempArray = new int[30];
        for(int i = 0; i < tempArray.length; i++) {
            tempArray[i] = (int) (Math.random() * (60 + 1)) + 40;
        }

        System.out.println("Исходный массив: ");
        printArrayTenLength(tempArray);
        System.out.println();

        int no_unique_elements = tempArray.length;
        for (int i = 0; i < no_unique_elements; i++) {
            for (int j = i+1; j < no_unique_elements; j++) {
                if(tempArray[i] == tempArray[j]) {
                    tempArray[j] = (int) (Math.random() * (60 + 1)) + 40;
                }
            }
        }

        System.out.println("Итоговый массив: ");
        printArrayTenLength(tempArray);

        System.out.format("%n6. Сдвиг элементов массива");
        String[] textArray = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        String[] resultArray = new String[textArray.length];
        System.arraycopy(textArray, 0, resultArray, 0, textArray.length);

        System.out.format("%nИсходный массив: ");
        printStringArray(textArray);
        System.out.format("%nЦелевой массив: ");
        printStringArray(resultArray);
    }

    public static void printArrayOneLine(int[] array) {
        for(int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArrayOneLine(double[] sourceArray) {
        for(double num: sourceArray) {
            System.out.printf("%.3f ", num);
        }
    }

    public static void printStringArray(String[] array) {
        for(String str: array) {
            System.out.print(str + " ");
        }
    }

    public static void printArrayTenLength(int[] arr) {
        int k = 0;
        for (int num : arr) {
            System.out.format("%4d", num);
            k++;
            if (k == 10) {
                k = 0;
                System.out.println();
            }
        }
    }
}
