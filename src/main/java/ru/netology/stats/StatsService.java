package ru.netology.stats;

import javax.swing.*;

public class StatsService {
    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;

            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int Medium(int[] sales) {

        int month = 0;
        int i;
        for (i = 0; i <= sales.length; i++) {

            month = i;
        }
        int sum =  sum(sales);
        int mediumSum = sum / month;
        return mediumSum;
    }

    public int AmountMonthsUnderMedium(int[] sales) {
        int mediumSum = Medium(sales);
        int amount = 0;

        for (int sale : sales) {
            if (sale < mediumSum) {
                amount = amount + 1;
            }
        }
        return amount;
    }

    public int AmountMonthsOverMedium(int[] sales) {
       int mediumSum = Medium(sales);
        int amount = 0;

        for (int sale : sales) {
            if (sale > mediumSum) {
                amount = amount + 1;
            }
        }
        return amount;
    }
}




