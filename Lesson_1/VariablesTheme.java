public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte cpuCoreNumbers = 6;
        short cpuThreadNumbers = 6;
        int ram = 16;
        long cpuFreq = 3360;
        float ssdFreespace = 30.2f;
        double hddFreespace = 236.4;
        char cpuFamily = 'F';
        boolean cpuAmd = true;

        System.out.println("cpu core numbers: " + cpuCoreNumbers);
        System.out.println("cpu thread numbers: " + cpuThreadNumbers);
        System.out.println("core frequency: " + cpuFreq);
        System.out.println("cpuFamily: " + cpuFamily);
        System.out.println("is cpu amd? " + cpuAmd);
        System.out.println("ram amount: " + ram);
        System.out.println("ssdFreespace: " + ssdFreespace);
        System.out.println("hddFreespace: " + hddFreespace);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int priceX = 100;
        int priceY = 200;
        int totalPrice = priceX + priceY;
        float discount = 0.11f;
        float totalDiscount = totalPrice * discount;
        float totalDiscountedPrice = totalPrice - totalDiscount;

        System.out.println("total discount: " + totalDiscount);
        System.out.println("total price with discount: " + totalDiscountedPrice);

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("max byte: " + maxByte);
        System.out.println("max byte incremented by 1: " + ++maxByte);
        System.out.println("max byte decremented by 1: " + --maxByte);
        System.out.println("max short: " + maxShort);
        System.out.println("max short incremented by 1: " + ++maxShort);
        System.out.println("max short decremented by 1: " + --maxShort);
        System.out.println("max int: " + maxInt);
        System.out.println("max int incremented by 1: " + ++maxInt);
        System.out.println("max int decremented by 1: " + --maxInt);
        System.out.println("max long: " + maxLong);
        System.out.println("max long incremented by 1: " + ++maxLong);
        System.out.println("max long decremented by 1: " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        float num1 = 10.2f;
        float num2 = 5.4f;
        float buffer = 0.0f;
        System.out.println("first decimal variable: " + num1);
        System.out.println("second decimal variable: " + num2);
        buffer = num1;
        num1 = num2;
        num2 = buffer;
        System.out.println("new first decimal: " + num1);
        System.out.println("new second decimal: " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        int numberCode = 35;
        int ampersandCode = 38;
        int atsignCode = 64;
        int caretCode = 94;
        int underlineCode = 95;
        System.out.println("number symbol: " + numberCode + ", ascii-code: " + (char) numberCode);
        System.out.println("ampersand: " + ampersandCode + ", ascii-code: " + 
            (char) ampersandCode);
        System.out.println("at sign: " + atsignCode + ", ascii-code: " + 
            (char) atsignCode);
        System.out.println("caret: " + caretCode + ", ascii-code: " + 
            (char) caretCode);
        System.out.println("underline: " + underlineCode + ", ascii-code: " + 
            (char) underlineCode);

        System.out.println("\n7. Произведение и сумма цифр числа");
        int srcNum = 345;
        int firstDigit = srcNum / 100;
        int secondDigit = (srcNum % 100) / 10;
        int thirdDigit = (srcNum % 100) % 10;
        System.out.println("345 digits multiplication: " + (firstDigit * secondDigit * thirdDigit));
        System.out.println("345 digits summ: " + (firstDigit + secondDigit + thirdDigit));

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char space = ' ';
        char slash = '/';
        char reverseSlash = '\\';
        char underline = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("" + space + space + space + space + slash + reverseSlash + space + space + space + space + space);
        System.out.println("" + space + space + space  + slash + space + space + reverseSlash + space + space + space + space);
        System.out.println("" + space + space  + slash + underline + leftBracket + space + rightBracket + reverseSlash + space + space + space + space);
        System.out.println("" + space + slash + space + space + space + space + space+ space + reverseSlash + space + space);
        System.out.println("" + slash + underline + underline + underline + underline + slash + reverseSlash + underline + underline + reverseSlash + space);

        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");
        int srcNum2 = 123;
        int numOfHundreds = srcNum2 / 100;
        int numOfTens = (srcNum2 % 100) / 10;
        int numOfOnes = (srcNum2 % 100) % 10;;
        int valueOfHundreds = numOfHundreds * 100;
        int valueOfTens = numOfTens * 10;
        System.out.println("123 number of hundreds: " + valueOfHundreds);
        System.out.println("123 number of tens: " + valueOfTens);
        System.out.println("123 number of ones: " + numOfOnes);

        System.out.println("\n10. Преобразование секунд");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = (totalSeconds % 3600) % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}