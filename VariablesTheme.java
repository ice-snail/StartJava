import java.math.BigDecimal;
import java.math.RoundingMode;

class VariablesTheme {
    public static void main(String [] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte typeOfSystem = 64;
        System.out.println("Тип системы - " + typeOfSystem + " разрядная операционная система");
        short countOfCores = 8;
        System.out.println("Количество ядер - " + countOfCores);
        int volumeRam = 16;
        System.out.println("Объем операционной памяти - " + volumeRam + " Гб");
        long volumeHhd = 2048L;
        System.out.println("Объем памяти - " + volumeHhd + " Гб");
        float typeOfUsb = 2.0f;
        System.out.println("Вид разъема порта USB - USB " + typeOfUsb);
        double freqCpu = 2.00;
        System.out.println("Частота процессора - " + freqCpu + " Гц");
        char modelOfProcrssor = 'M';
        System.out.println("Модель процессора - " + modelOfProcrssor + ".2");
        String os = "WINDOWS";
        System.out.println("Операционная система - " + os + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        double priceOfPen = 105.5;
        System.out.println("Стоимость ручки = " + priceOfPen + " руб.");
        double priceOfBook = 235.83;
        System.out.println("Стоимость книги = " + priceOfBook + " руб.");
        double discount = 0.11;
        double sumDiscount = (priceOfPen + priceOfBook) * discount;
        System.out.println("Сумма скидки = " + sumDiscount);
        double priceOfThingsWithDiscount = (priceOfPen + priceOfBook) * (1 - discount);
        System.out.println("Стоимость товаров со скидкой = " + 
                priceOfThingsWithDiscount + " руб.\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        System.out.println(maxByte);
        short maxShort = 32767; 
        System.out.println(maxShort);
        int maxInt = 2147483647;
        System.out.println(maxInt);
        long maxLong = 9223372036854775807L;
        System.out.println(maxLong + "\n");
        maxByte = (byte) (maxByte + 1);
        System.out.println(maxByte);
        maxShort = (short) (maxShort + 1);
        System.out.println(maxShort);
        maxInt = maxInt + 1;
        System.out.println(maxInt);
        maxLong = maxLong + 1;
        System.out.println(maxLong + "\n");
        maxByte = (byte) (maxByte - 1);
        System.out.println(maxByte);
        maxShort = (short) (maxShort - 1);
        System.out.println(maxShort);
        maxInt = maxInt - 1;
        System.out.println(maxInt);
        maxLong = maxLong - 1;
        System.out.println(maxLong + "\n");

        System.out.println("5. Перестановка значений переменных");
        int variable1 = 2;
        int variable2 = 5;
        System.out.println("Первая переменная = " + variable1);
        System.out.println("Вторая переменная = " + variable2);
        System.out.println("Перестановка с помощью третьей переменной");
        int variable3 = 0;
        variable3 = variable1;
        variable1 = variable2;
        variable2 = variable3;
        System.out.println("В результате перестановки первая переменная = " + variable1 + 
                ", вторая переменная = " + variable2 + "\n");
        System.out.println("Перестановка с помощью арифметических операций");
        int sumVariables = variable1 + variable2;
        variable1 = sumVariables - variable1;
        variable2 = sumVariables - variable2;
        System.out.println("В результате перестановки первая переменная = " + variable1 + 
                ", вторая переменная = " + variable2 + "\n");
        System.out.println("Перестановка с помощью побитовой операции ^");
        int xor = variable1 ^ variable2;
        variable1 = xor - variable1;
        variable2 = xor - variable2;
        System.out.println("В результате перестановки первая переменная = " + variable1 + 
                ", вторая переменная = " + variable2 + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char ch1 = '$';
        char ch2 = '*';
        char ch3 = '@';
        char ch4 = '\\';
        char ch5 = '`';
        int codeCh1 = ch1;
        int codeCh2 = ch2;
        int codeCh3 = ch3;
        int codeCh4 = ch4;
        int codeCh5 = ch5;
        System.out.println(codeCh1 + " - " + ch1);
        System.out.println(codeCh2 + " - " + ch2);
        System.out.println(codeCh3 + " - " + ch3);
        System.out.println(codeCh4 + " - " + ch4);
        System.out.println(codeCh5 + " - " + ch5 + "\n");

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
        System.out.println("Число " + someNum + " содержит:");
        int hundreds = someNum / 100;
        System.out.println("сотен - " + hundreds);
        int decades = someNum % 100 / 10;
        System.out.println("десятков - " + decades);
        int units = someNum % 100 % 10;
        System.out.println("единиц - " + units);
        int sumCapacity = hundreds + decades + units;
        System.out.println("Сумма разрядов = " + sumCapacity);
        int productCapacity = hundreds * decades * units;
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
        var a = new BigDecimal("105.50");
        System.out.println("Стоимость ручки = " + a);
        var b = new BigDecimal("235.83");
        System.out.println("Стоимость книги = " + b);
        var c = new BigDecimal("0.11");
        var d = a.add(b);
        System.out.println("Стоимость товара без скидки = " + d);
        var e = d.multiply(c).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма скидки = " + e);
        var f = d.subtract(e);
        System.out.println("Стоимость товаров со скидкой = " + f);
    }
}