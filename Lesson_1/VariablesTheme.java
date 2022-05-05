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
        System.out.println("max byte incremented by 1: " + (maxByte += 1));
        System.out.println("max byte decremented by 1: " + (maxByte -= 1));
        System.out.println("max short: " + maxShort);
        System.out.println("max short incremented by 1: " + (maxShort += 1));
        System.out.println("max short decremented by 1: " + (maxShort -= 1));
        System.out.println("max int: " + maxInt);
        System.out.println("max int incremented by 1: " + (maxInt += 1));
        System.out.println("max int decremented by 1: " + (maxInt -= 1));
        System.out.println("max long: " + maxLong);
        System.out.println("max long incremented by 1: " + (maxLong += 1));
        System.out.println("max long decremented by 1: " + (maxLong -= 1));

        System.out.println("\n5. Перестановка значений переменных");
        float decimalVarFirst = 10.2f;
        float decimalVarSecond = 5.4f;
        float bufferVar = 0.0f;
        System.out.println("first decimal variable: " + decimalVarFirst);
        System.out.println("second decimal variable: " + decimalVarSecond);
        bufferVar = decimalVarFirst;
        decimalVarFirst = decimalVarSecond;
        decimalVarSecond = bufferVar;
        System.out.println("new first decimal: " + decimalVarFirst);
        System.out.println("new second decimal: " + decimalVarSecond);

        System.out.println("\n6. Вывод символов и их кодов");
        int numFirst = 35;
        int numSecond = 38;
        int numThird = 64;
        int numFourth = 94;
        int numFifth = 95;
        System.out.println("num first: " + numFirst + ", ascii-code: " + (char)numFirst);
        System.out.println("num second: " + numSecond + ", ascii-code: " + (char)numSecond);
        System.out.println("num third: " + numThird + ", ascii-code: " + (char)numThird);
        System.out.println("num fourth: " + numFourth + ", ascii-code: " + (char)numFourth);
        System.out.println("num fifth: " + numFifth + ", ascii-code: " + (char)numFifth);

        System.out.println("\n7. Произведение и сумма цифр числа");
        int numThreeFourFive = 345;
        int firstNum = numThreeFourFive / 100;
        int secondNum = (numThreeFourFive - (firstNum * 100)) / 10;
        int thirdNum = numThreeFourFive - ((firstNum * 100) + (secondNum * 10));
        System.out.println("345 numbers multiplication: " + (firstNum * secondNum * thirdNum));
        System.out.println("345 numbers summ: " + (firstNum + secondNum + thirdNum));

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char space = ' ';
        char solidus = '/';
        char reverseSolidus = '\\';
        char lowLine = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("" + space + space + space + space + solidus + reverseSolidus + space + space + space + space + space);
        System.out.println("" + space + space + space  + solidus + space + space + reverseSolidus + space + space + space + space);
        System.out.println("" + space + space  + solidus + lowLine + leftParenthesis + space + rightParenthesis + reverseSolidus + space + space + space + space);
        System.out.println("" + space + solidus + space + space + space + space + space+ space + reverseSolidus + space + space);
        System.out.println("" + solidus + lowLine + lowLine + lowLine + lowLine + solidus + reverseSolidus + lowLine + lowLine + reverseSolidus + space);

        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");
        int numOneTwoThree = 123;
        int numOfHundreds = numOneTwoThree / 100;
        int numOfTens = (numOneTwoThree - (numOfHundreds * 100)) / 10;
        int numOfOnes = numOneTwoThree - ((numOfHundreds * 100) + (numOfTens * 10));
        int valueOfHundreds = numOfHundreds * 100;
        int valueOfTens = numOfTens * 10;
        System.out.println("123 number of hundreds: " + valueOfHundreds);
        System.out.println("123 number of tens: " + valueOfTens);
        System.out.println("123 number of ones: " + numOfOnes);

        System.out.println("\n10. Преобразование секунд");
        int initialSeconds = 86399;
        int hours = initialSeconds / 3600;
        int minutes = (initialSeconds % 3600) / 60;
        int seconds = (initialSeconds % 3600) % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}