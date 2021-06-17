package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {

    public static final int CUMULATIVE_EXPENSE_NUMBER_100 = 100;
    public static final int CUMULATIVE_EXPENSE_NUMBER_150 = 150;
    public static final int CUMULATIVE_EXPENSE_NUMBER_400 = 400;
    public static final double RATE_PERCENTAGE_80 = 0.8;
    public static final double RATE_PERCENTAGE_50 = 0.5;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= CUMULATIVE_EXPENSE_NUMBER_100 && cumulativeExpensesThisMonth < CUMULATIVE_EXPENSE_NUMBER_150) {
            return originalPrice * RATE_PERCENTAGE_80;
        }
        if (cumulativeExpensesThisMonth >= CUMULATIVE_EXPENSE_NUMBER_150 && cumulativeExpensesThisMonth < CUMULATIVE_EXPENSE_NUMBER_400) {
            return originalPrice * RATE_PERCENTAGE_50;
        }
        return originalPrice;
    }
}
