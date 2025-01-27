class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int number = start;
        int sumEven = 0;
        int sumOdd = 0;
        int finish = 21;
        do {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
            number++;
        } while (number <= finish);
        System.out.println("В отрезке [" + start + ", " + finish + "] сумма чётных чисел = " + 
                sumEven + ", а нечётных = " + sumOdd);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
                if (num2 > num3) {
                    min = num3;
                } else {
                    min = num2;
                }
            } else {
                max = num3;
                min = num2;
            }
        } else if (num2 > num3) {
            max = num2;
            if (num1 > num3) {
                min = num3;
            } else {
                min = num1;
            }
        } else {
            max = num3;
            if (num1 > num2) {
                min = num2;
            } else {
                min = num1;
            }
        }
        for (int i = 0; max >= min; i++) {
            System.out.print(max + " ");
            max--;
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int digit = 0;
        int sumDigits = 0;
        int reverseNum = 0;
        while (num > 0) {
            digit = num % 10;
            sumDigits = sumDigits + digit;
            reverseNum = (reverseNum * 10) + digit;
            num /= 10;
        }
        System.out.println(reverseNum);
        System.out.println(sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int end = 24;
        for (int i = 1; i < end; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d", i);
            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        while (end % 10 != 0) {
            if (end % 2 != 0) {
                System.out.printf("%4d", 0);
            }
            end++;
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int a = 3242592;
        if (a % 2 != 0) {
            System.out.print("В " + a + " нечетное");
        } else {
            System.out.print("В " + a + " четное");
        }
        int counter = 0;
        while (a != 0) {
            if (a % 10 % 2 == 1) {
                counter++;
            }
            a /= 10;
        }
        System.out.print(" (" + counter + ") количество двоек\n");

        System.out.println("\n6. Вывод геометрических фигур");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int numberSign = 5;
        while (numberSign > 0) {
            for (int i = 0; i < numberSign; i++) {
                System.out.print('#');
            }
            System.out.println();
            numberSign--;
        }
        System.out.println();
        int count = 1;
        do {
            for (int i = 1; i <= count; i++) {
                System.out.print('$');
                if (count == 4 && i == 2) break;
                if (count == 5 && i == 1) break;
            }
            System.out.println();
            count++;
        } while (count <= 5);

        System.out.println("\n7. Вывод ASCII-символов");
        System.out.println("DECIMAL    CHARACTER    DESCRIPTION");
        for (int i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d", i);
                System.out.printf("%12c", i);
                System.out.printf("\t     %-10s%n", Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d", i);
                System.out.printf("%12c", i);
                System.out.printf("\t     %-10s%n", Character.getName(i));
            }
        }
            
        System.out.println("\n8. Проверка, является ли число палиндромом");
        int palindrome = 1234321;
        int checkPalindrome = palindrome;
        int digitPalindrome = 0;
        int reversePalindrome = 0;
        while (palindrome != 0) {
            digitPalindrome = palindrome % 10;
            reversePalindrome = (reversePalindrome * 10) + digitPalindrome;
            palindrome /= 10;
        }
        if (checkPalindrome == reversePalindrome) {
            System.out.println("Число " + checkPalindrome + " - палиндром");
        } else {
            System.out.println("Число " + checkPalindrome + " - не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int luckyNum = 226550;
        int checkLuckyNum = luckyNum;
        int digitLuckyNum = 0;
        int firstPart = 0;
        int secondPart = 0;
        int sumFirstPart = 0;
        int sumSecondPart = 0;
        for (int i = 0; i < 6; i++) {
            digitLuckyNum = luckyNum % 10;
            if (i < 3) {
                secondPart = secondPart + (digitLuckyNum * (int) Math.pow(10, i));
                sumSecondPart = sumSecondPart + digitLuckyNum;
            } else {
                firstPart = firstPart + (digitLuckyNum * (int) Math.pow(10, i - 3));
                sumFirstPart = sumFirstPart + digitLuckyNum;
            }
            luckyNum /= 10;
        }
        if (sumFirstPart == sumSecondPart) {
            System.out.println("Число " + checkLuckyNum + " - счастливое");
            System.out.println("Сумма цифр " + firstPart + " = " + sumFirstPart);
            System.out.println("Сумма " + secondPart + " = " + sumSecondPart);
        } else {
            System.out.println("Число " + checkLuckyNum + " - не счастливое");
            System.out.println("Сумма цифр " + firstPart + " = " + sumFirstPart);
            System.out.println("Сумма " + secondPart + " = " + sumSecondPart);
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("        Таблица Пифагора");
        System.out.println("  |  2  3  4  5  6  7  8  9  ");
        System.out.println("-----------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 2; j < 10; j++) {
                if (i * j < 10) {
                    System.out.print(" " + i * j + " ");
                } else {
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }
    }
}