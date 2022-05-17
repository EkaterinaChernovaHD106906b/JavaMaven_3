package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldSum() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = manager.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMin() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMax() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMedium() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.Medium(sales);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAmountMonthsUnderMedium() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.AmountMonthsUnderMedium(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAmountMonthOverMedium() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.AmountMonthsOverMedium(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}

