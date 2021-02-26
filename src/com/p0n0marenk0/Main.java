//task1
//в банк положили S денег.
//Какой станет сумма вклада через N лет,
//если процент 1,5% добавляется к сумме вклада ежемесячно.
package com.p0n0marenk0;

import java.util.Scanner;

public class Main {

    public static final int amountOfMonthsInYear = 12;
    public static final double percent15 = 1.5;

    public static void main(String[] args) {
        System.out.println("Введите количество лет: ");
        Scanner scanner = new Scanner(System.in);
        int amountOfMonthsInYears = scanner.nextInt() * amountOfMonthsInYear;
        System.out.println("Введите сумму: ");
        double summary = scanner.nextDouble();
        double percent = summary * percent15 / 100;
        double summ = summary + (percent * amountOfMonthsInYears);
        System.out.println("money= " + summ);
    }
}