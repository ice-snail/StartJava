import java.math.BigDecimal;
import java.math.RoundingMode;

class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("Female");
        } else {
            System.out.println("Male");
        }
        int age = 28;
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Little");
        }
        double height = 1.85;
        if (height < 1.8) {
            System.out.println("Below average height");
        } else {
            System.out.println("Above average height");
        }
        char firstLetterOfName = "Vladimir".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Maybe his name is Max? ");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Maybe his name is Igor?");
        } else {
            System.out.println("His name doesn't start with M or I");
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 99;
        int b = 35;
        if (a > b) {
            System.out.println("Число " + a + " больше числа " + b);
        } else if (a < b) {
            System.out.println("Число " + b + " больше числа " + a);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int num = 12;
        if (num == 0) {
            System.out.println("Число является 0");
        } else {
            if (num > 0) {
                System.out.print(num + " является положительным");
            } else {
                System.out.print(num + " отрицательное");
            }
            if (num % 2 == 0) {
                System.out.print(" и четным\n");
            } else {
                System.out.print(" и нечетным\n");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 223;
        int hundredsOfNum1 = num1 / 100;
        int hundredsOfNum2 = num2 / 100;
        int tensOfNum1 = num1 % 100 / 10;
        int tensOfNum2 = num2 % 100 / 10;
        int onesOfNum1 = num1 % 10;
        int onesOfNum2 = num2 % 10;
        if ((hundredsOfNum1 == hundredsOfNum2) || tensOfNum1 == tensOfNum2 || (onesOfNum1 == onesOfNum2)) {
            System.out.println("Исходные числа " + num1 + " и " + num2);
            if (hundredsOfNum1 == hundredsOfNum2) {
                System.out.println("Цифры " + hundredsOfNum1 + " равны");
                System.out.println("Номер разряда: 3");
            }
            if (tensOfNum1 == tensOfNum2) {
                System.out.println("Цифры " + tensOfNum1 + " равны");
                System.out.println("Номер разряда: 2");
            }
            if (onesOfNum1 == onesOfNum2) {
                System.out.println("Цифры " + onesOfNum1 + " равны");
                System.out.println("Номер разряда: 1");
            }
        } else {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (Character.isLowerCase(symbol)) {
            System.out.println("'" + symbol + "'" + " - строчная буква.");
        } else if (Character.isUpperCase(symbol)) {
            System.out.println("'" + symbol + "'" + " - заглавная буква.");
        } else if (Character.isDigit(symbol)) {
            System.out.println("'" + symbol + "'" + " - цифра.");
        } else {
            System.out.println("'" + symbol + "'" + " - ни буква и ни цифра.");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        double deposit = 321123.59;
        double percent = 0.07;
        if (deposit < 100_000) {
            percent = 0.05;
        } else if (deposit > 300_000) {
            percent = 0.10;
        }
        double accrualSum = deposit * percent;
        System.out.println("Сумма вклада составляет " + deposit + " руб.");
        System.out.println("Сумма начисленных процентов составляет " + accrualSum + " руб.");
        System.out.println("Итоговая сумма равна " + (deposit + accrualSum) + " руб");

        System.out.println("\n7. Определение оценки по предметам");
        double historyPercent = 59.0;
        double historyGrade = 2.0;
        if (historyPercent > 60 && historyPercent < 73) {
            historyGrade = 3.0;
        } else if (historyPercent > 73 && historyPercent < 91) {
            historyGrade = 4.0;
        } else if (historyPercent > 91) {
            historyGrade = 5.0;
        }
        double programmingPercent = 92.0;
        double programmingGrade = 2.0;
        if (programmingPercent > 60 && programmingPercent < 73) {
            programmingGrade = 3.0;
        } else if (programmingPercent > 73 && programmingPercent < 91) {
            programmingGrade = 4.0;
        } else if (programmingPercent > 91) {
            programmingGrade = 5.0;
        }
        System.out.println("История - " + historyGrade);
        System.out.println("Программирование - " + programmingGrade);
        System.out.println("Средний балл оценок равен " + 
                (historyGrade + programmingGrade) / 2);
        System.out.println("Средний процент успеваемости " + 
                (historyPercent + programmingPercent) / 2);

        System.out.println("\n8. Расчет годовой прибыли");
        double monthSales = 13025.233;
        double monthRent = 5123.018;
        double primeCostMonth = 9001.729;
        double yearProfit = (monthSales - monthRent - primeCostMonth) * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год : +" + yearProfit + " руб.");
        } else {
            System.out.println("Прибыль за год : " + yearProfit + " руб.");
        }

        System.out.println("\n9. Расчет годовой прибыли с BigDecimal");
        var monthRentBd = new BigDecimal("5123.018");
        var primeCostMonthBd = new BigDecimal("9001.729");
        var monthSpendingBd = monthRentBd.add(primeCostMonthBd);
        var monthSalesBd = new BigDecimal("13025.233");
        var monthProfitBd = monthSalesBd.subtract(monthSpendingBd);
        var monthsInYearBd = BigDecimal.valueOf(12);
        var yearProfitBd = monthProfitBd.multiply(monthsInYearBd).setScale(2, RoundingMode.HALF_UP);
        var zero = BigDecimal.ZERO;
        if (yearProfitBd.compareTo(zero) < 0) {
            System.out.println("Прибыль за год: " + yearProfitBd);
        } else {
            System.out.println("Прибыль за год: +" + yearProfitBd);
        }

        System.out.println("\n10. Подсчет начисленных банком % c BigDecimal");
        var depositBd = new BigDecimal("321123.59");
        var percentBd = new BigDecimal("0.07");
        var depositPercent5 = BigDecimal.valueOf(100000);
        var depositPercent10 = BigDecimal.valueOf(300000);
        if (depositBd.compareTo(depositPercent5) < 0) {
            percentBd = new BigDecimal("0.05");
        } else if (depositBd.compareTo(depositPercent10) > 0) {
            percentBd = new BigDecimal("0.10");
        }
        var accrualSumBd = depositBd.multiply(percentBd).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма вклада составляет " + depositBd + " руб.");
        System.out.println("Сумма начисленных процентов составляет " + accrualSumBd + " руб.");
        System.out.println("Итоговая сумма равна " + depositBd.add(accrualSumBd) + " руб");
    }
}