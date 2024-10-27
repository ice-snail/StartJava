import java.math.BigDecimal;
import java.math.RoundingMode;

class IfElseStatementTheme {
    public static void main(String [] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean male = true;
        int age = 28;
        double height = 1.85;
        if (!male) {
            System.out.println("Female");
        } else {
            System.out.println("Male");
        }
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Little");
        }
        if (height < 1.8) {
            System.out.println("Below average height");
        } else {
            System.out.println("Above average height");
        }
        char firstLetterName = "Vladimir".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Maybe his name is Max? ");
        } else if (firstLetterName == 'I') {
            System.out.println("Maybe his name is Igor?");
        } else {
            System.out.println("His name doesn't start with M or I");
        }
        System.out.println();

        System.out.println("2. Поиск большего числа");
        int a = 99;
        int b = 35;
        if (a > b) {
            System.out.println("Число " + a + " больше числа " + b);
        } else if (a < b) {
            System.out.println("Число " + b + " больше числа " + a);
        } else {
            System.out.println("Числа равны");
        }
        System.out.println();

        System.out.println("3. Проверка числа");
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
        System.out.println();

        System.out.println("4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 223;
        if ((num1 / 100 == num2 / 100) || num1 % 100 / 10 == num2 % 100 / 10 || 
                (num1 % 10 == num2 % 10)) {
            System.out.println("Исходные числа " + num1 + " и " + num2);
            if (num1 / 100 == num2 / 100) {
                System.out.println("Цифры " + num1 / 100 + " равны");
                System.out.println("Номер разряда: 3");
            }
            if (num1 % 100 / 10 == num2 % 100 / 10) {
                System.out.println("Цифры " + (num1 % 100 / 10) + " равны");
                System.out.println("Номер разряда: 2");
            }
            if (num1 % 10 == num2 % 10) {
                System.out.println("Цифры " + (num1 % 10) + " равны");
                System.out.println("Номер разряда: 1");
            }
        } else {
            System.out.println("Равных цифр нет");
        }
        System.out.println();

        System.out.println("5. Определение символа по его коду");
        char symbol = '\u0057';
        if (Character.isLetter(symbol)) {
            if (Character.isUpperCase(symbol)) {
                System.out.println("'" + symbol + "'" + " - заглавная буква.");
            } else {
                System.out.println("'" + symbol + "'" + " - строчная буква.");
            }
        } else if (Character.isDigit(symbol)) {
            System.out.println("'" + symbol + "'" + " - цифра.");
        } else {
            System.out.println("'" + symbol + "'" + " - ни буква и ни цифра.");
        }
        System.out.println();

        System.out.println("6. Подсчет начисленных банком %");
        double contribution = 321123.59;
        System.out.println("Сумма вклада составляет " + contribution + " руб.");
        if (contribution < 100_000) {
            double sumAccrual = contribution * 0.05;
            System.out.println("Сумма начисленных процентов составляет " + sumAccrual + " руб.");
            System.out.println("Итоговая сумма равна " + (contribution + sumAccrual) + " руб");
        } else if (contribution > 300_000) {
            double sumAccrual = contribution * 0.10;
            System.out.println("Сумма начисленных процентов составляет " + sumAccrual + " руб.");
            System.out.println("Итоговая сумма равна " + (contribution + sumAccrual) + " руб");
        } else {
            double sumAccrual = contribution * 0.07;
            System.out.println("Сумма начисленных процентов составляет " + sumAccrual + " руб.");
            System.out.println("Итоговая сумма равна " + (contribution + sumAccrual) + " руб");
        }
        System.out.println();

        System.out.println("7. Определение оценки по предметам");
        double resultHistory = 59.0;
        double resultProgramming = 92.0;
        double gradeHistory = 2.0;
        double gradeProgramming = 2.0;

        if (resultHistory > 60) {
            if (resultHistory > 73) {
                if (resultHistory > 91) {
                    gradeHistory = 5.0;
                } else {
                    gradeHistory = 4.0;
                }
            } else {
                gradeHistory = 3.0;
            }
        }

        if (resultProgramming > 60) {
            if (resultProgramming > 73) {
                if (resultProgramming > 91) {
                    gradeProgramming = 5.0;
                } else {
                    gradeProgramming = 4.0;
                }
            } else {
                gradeProgramming = 3.0;
            }
        }
        System.out.println("История - " + gradeHistory);
        System.out.println("Программирование - " + gradeProgramming);
        System.out.println("Средний балл оценок равен " + ((gradeHistory + gradeProgramming) / 2));
        System.out.println("Средний процент успеваемости " + 
                ((resultHistory + resultProgramming) / 2));
        System.out.println();

        System.out.println("8. Расчет годовой прибыли");
        double salesMonth = 13025.233;
        double rentMonth = 5123.018;
        double primeCostMonth = 9001.729;
        double profitYear = (salesMonth - rentMonth - primeCostMonth) * 12;
        if (profitYear > 0) {
            System.out.println("Прибыль за год : +" + profitYear + " руб.");
        } else {
            System.out.println("Прибыль за год : " + profitYear + " руб.");
        }
        System.out.println();

        System.out.println("9. Расчет годовой прибыли с BigDecimal");
        var salesMonthBd = new BigDecimal("13025.233");
        var rentMonthBd = new BigDecimal("5123.018");
        var primeCostMonthBd = new BigDecimal("9001.729");
        var monthsInYearBd = new BigDecimal("12");
        var spendingMonthBd = rentMonthBd.add(primeCostMonthBd);
        var profitMonthBd = salesMonthBd.subtract(spendingMonthBd);
        var profitYearBd = profitMonthBd.multiply(monthsInYearBd).setScale(2, RoundingMode.HALF_UP);
        if (profitYearBd.toPlainString().charAt(0) == '-') {
            System.out.println("Прибыль за год: " + profitYearBd);
        } else {
            System.out.println("Прибыль за год: +" + profitYearBd);
        }
        System.out.println();

        System.out.println("10. Подсчет начисленных банком % c BigDecimal");
        var contributionBd = new BigDecimal("321123.59");
        var percent5 = new BigDecimal("0.05");
        var percent7 = new BigDecimal("0.07");
        var percent10 = new BigDecimal("0.10");
        var conditionPercent5 = new BigDecimal("100000");
        var conditionPercent10 = new BigDecimal("300000");
        if (contributionBd.compareTo(conditionPercent5) > 0) {
            if (contributionBd.compareTo(conditionPercent10) > 0) {
                var sumAccrualBd = contributionBd.multiply(percent10).setScale(2, RoundingMode.HALF_UP);
                System.out.println("Сумма начисленных процентов составляет " + 
                        sumAccrualBd + " руб.");
                System.out.println("Итоговая сумма равна " + 
                        contributionBd.add(sumAccrualBd) + " руб");
            } else {
                var sumAccrualBd = contributionBd.multiply(percent7).setScale(2, RoundingMode.HALF_UP);
                System.out.println("Сумма начисленных процентов составляет " + 
                        sumAccrualBd + " руб.");
                System.out.println("Итоговая сумма равна " + 
                        contributionBd.add(sumAccrualBd) + " руб");
            }
        } else {
            var sumAccrualBd = contributionBd.multiply(percent5).setScale(2, RoundingMode.HALF_UP);
            System.out.println("Сумма начисленных процентов составляет " + sumAccrualBd + " руб.");
            System.out.println("Итоговая сумма равна " + contributionBd.add(sumAccrualBd) + " руб");
        }
    }
}