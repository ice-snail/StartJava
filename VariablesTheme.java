import java.math.BigDecimal;
import java.math.RoundingMode;

class VariablesTheme {
    public static void main(String [] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte typeSystem = 64;
        short countCores = 8;
        int volumeRam = 16;
        long volumeHhd = 2048L;
        float typeUsb = 2.0f;
        double freqCpu = 2.00;
        char modelCpu = 'M';
        String os = "WINDOWS";
        System.out.println("Тип системы - " + typeSystem + " разрядная операционная система");
        System.out.println("Количество ядер - " + countCores);
        System.out.println("Объем операционной памяти - " + volumeRam + " Гб");
        System.out.println("Объем памяти - " + volumeHhd + " Гб");
        System.out.println("Вид разъема порта USB - USB " + typeUsb);
        System.out.println("Частота процессора - " + freqCpu + " Гц");
        System.out.println("Модель процессора - " + modelCpu + ".2");
        System.out.println("Операционная система - " + os + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        double penPrice = 105.5;
        double bookPrice = 235.83;
        double discount = 0.11;
        double sumDiscount = (penPrice + bookPrice) * discount;
        double discountPrice = (penPrice + bookPrice) * (1 - discount);
        System.out.println("Стоимость ручки = " + penPrice + " руб.");
        System.out.println("Стоимость книги = " + bookPrice + " руб.");
        System.out.println("Сумма скидки = " + sumDiscount);
        System.out.println("Стоимость товаров со скидкой = " + discountPrice + " руб.\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        System.out.println(maxByte);
        System.out.println(++maxByte);
        System.out.println(--maxByte + "\n");

        short maxShort = 32767;
        System.out.println(maxShort);
        System.out.println(++maxShort);
        System.out.println(--maxShort + "\n");

        char maxChar = 65535;
        System.out.println(maxChar);
        System.out.println(++maxChar);
        System.out.println(--maxChar + "\n");

        int maxInt = 2147483647;
        System.out.println(maxInt);
        System.out.println(++maxInt);
        System.out.println(--maxInt + "\n");

        long maxLong = 9223372036854775807L;
        System.out.println(maxLong);
        System.out.println(++maxLong);
        System.out.println(--maxLong + "\n");

        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        
        System.out.println("Первая переменная = " + a);
        System.out.println("Вторая переменная = " + b);

        System.out.println("Перестановка с помощью третьей переменной");
        int swap = a;
        a = b;
        b = swap;
        System.out.println("В результате перестановки первая переменная = " + a + 
                ", вторая переменная = " + b + "\n");

        System.out.println("Перестановка с помощью арифметических операций");
        a *= b;
        b = a / b;
        a /= b;
        System.out.println("В результате перестановки первая переменная = " + a + 
                ", вторая переменная = " + b + "\n");

        System.out.println("Перестановка с помощью побитовой операции ^");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("В результате перестановки первая переменная = " + a + 
                ", вторая переменная = " + b + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int) dollar + " - " + dollar);
        System.out.println((int) asterisk + " - " + asterisk);
        System.out.println((int) atSign + " - " + atSign);
        System.out.println((int) verticalBar + " - " + verticalBar);
        System.out.println((int) tilde + " - " + tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis +
                backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + 
                backslash + underscore + underscore + backslash + "\n");

        System.out.println("8. Манипуляции с сотнями, десятками и единицами числа");
        int someNum = 123;
        int hundreds = someNum / 100;
        int tens = someNum % 100 / 10;
        int ones = someNum % 10;
        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;
        System.out.println("Число " + someNum + " содержит:");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + tens);
        System.out.println("единиц - " + ones);
        System.out.println("Сумма разрядов = " + sum);
        System.out.println("Произведение разрядов = " + product + "\n");

        System.out.println("9. Перевод секунд в часы, минуты и секунды");
        int totalSeconds = 86399;

        // В одном часе 60 минут, а в одной минуте 60 секунд, считаем количество секунд в часе:
        int secondsInHours = 60 * 60;
        int hh = totalSeconds / secondsInHours;
        int mm = totalSeconds % secondsInHours / 60;
        int ss = totalSeconds % secondsInHours % 60;
        System.out.println(hh + ":" + mm + ":" + ss + "\n");

        System.out.println("10. Расчет стоимости товара со скидкой");
        var penPriceBd = new BigDecimal("105.50");
        var bookPriceBd = new BigDecimal("235.83");
        var discountBd = new BigDecimal("0.11");
        var basePriceBd = penPriceBd.add(bookPriceBd);
        var sumDiscountBd = basePriceBd.multiply(discountBd).setScale(2, RoundingMode.HALF_UP);
        var discountPriceBd = basePriceBd.subtract(sumDiscountBd);
        System.out.println("Стоимость ручки = " + penPriceBd);
        System.out.println("Стоимость книги = " + bookPriceBd);
        System.out.println("Стоимость товара без скидки = " + basePriceBd);
        System.out.println("Сумма скидки = " + sumDiscountBd);
        System.out.println("Стоимость товаров со скидкой = " + discountPriceBd);
    }
}