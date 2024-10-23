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
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        System.out.println(maxByte);
        System.out.println(++maxByte);
        System.out.println(--maxByte + "\n");

        System.out.println(maxShort);
        System.out.println(++maxShort);
        System.out.println(--maxShort + "\n");

        System.out.println(maxInt);
        System.out.println(++maxInt);
        System.out.println(--maxInt + "\n");

        System.out.println(maxLong);
        System.out.println(++maxLong);
        System.out.println(--maxLong + "\n");

        System.out.println("5. Перестановка значений переменных");
        int first = 2;
        int second = 5;
        int third = 0;
        System.out.println("Первая переменная = " + first);
        System.out.println("Вторая переменная = " + second);

        System.out.println("Перестановка с помощью третьей переменной");
        third = first;
        first = second;
        second = third;
        System.out.println("В результате перестановки первая переменная = " + first + 
                ", вторая переменная = " + second + "\n");

        System.out.println("Перестановка с помощью арифметических операций");
        int sumVariables = first + second;
        first = sumVariables - first;
        second = sumVariables - second;
        System.out.println("В результате перестановки первая переменная = " + first + 
                ", вторая переменная = " + second + "\n");

        System.out.println("Перестановка с помощью побитовой операции ^");
        int xor = first ^ second;
        first = xor - first;
        second = xor - second;
        System.out.println("В результате перестановки первая переменная = " + first + 
                ", вторая переменная = " + second + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char chNum36 = '$';
        char chNum42 = '*';
        char chNum64 = '@';
        char chNum124 = '|';
        char chNum126 = '~';
        int codeChNum36 = chNum36;
        int codeChNum42 = chNum42;
        int codeChNum64 = chNum64;
        int codeChNum124 = chNum124;
        int codeChNum126 = chNum126;
        System.out.println(codeChNum36 + " - " + chNum36);
        System.out.println(codeChNum42 + " - " + chNum42);
        System.out.println(codeChNum64 + " - " + chNum64);
        System.out.println(codeChNum124 + " - " + chNum124);
        System.out.println(codeChNum126 + " - " + chNum126 + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char reverseSlash = '\\';
        char underline = '_';
        char parenthesis = '(';
        char reverseParenthesis = ')';
        System.out.println("    " + slash + reverseSlash);
        System.out.println("   " + slash + "  " + reverseSlash);
        System.out.println("  " + slash + underline + parenthesis + " " + reverseParenthesis +
                reverseSlash);
        System.out.println(" " + slash + "      " + reverseSlash);
        System.out.println(slash + "" + underline + "" + underline + "" + underline + 
                "" + underline + "" + slash + "" + reverseSlash + "" + underline + 
                "" + underline + "" + reverseSlash + "\n");

        System.out.println("8. Манипуляции с сотнями, десятками и единицами числа");
        int someNum = 123;
        int hundreds = someNum / 100;
        int decades = someNum % 100 / 10;
        int units = someNum % 100 % 10;
        int sumCapacity = hundreds + decades + units;
        int productCapacity = hundreds * decades * units;
        System.out.println("Число " + someNum + " содержит:");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + decades);
        System.out.println("единиц - " + units);
        System.out.println("Сумма разрядов = " + sumCapacity);
        System.out.println("Произведение разрядов = " + productCapacity + "\n");

        System.out.println("9. Перевод секунд в часы, минуты и секунды");
        int someCountSeconds = 86399;

        // В одном часе 60 минут, а в одной минуте 60 секунд, считаем количество секунд в часе:
        int secondsInHours = 60 * 60;
        int hours = someCountSeconds / secondsInHours;
        int minutes = someCountSeconds % secondsInHours / 60;
        int seconds = someCountSeconds % secondsInHours % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds + "\n");

        System.out.println("10. Расчет стоимости товара со скидкой");
        var penPriceBd = new BigDecimal("105.50");
        var bookPriceBd = new BigDecimal("235.83");
        var discountBd = new BigDecimal("0.11");
        var sumPriceBd = penPriceBd.add(bookPriceBd);
        var sumDiscountBd = sumPriceBd.multiply(discountBd).setScale(2, RoundingMode.HALF_UP);
        var discountPriceBd = sumPriceBd.subtract(sumDiscountBd);
        System.out.println("Стоимость ручки = " + penPriceBd);
        System.out.println("Стоимость книги = " + bookPriceBd);
        System.out.println("Стоимость товара без скидки = " + sumPriceBd);
        System.out.println("Сумма скидки = " + sumDiscountBd);
        System.out.println("Стоимость товаров со скидкой = " + discountPriceBd);
    }
}