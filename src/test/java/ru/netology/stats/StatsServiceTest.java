package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test//Тест ля вычисления суммы всех продаж.
    void sumOfAll() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.sumOfAll(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test//Тест ля вычисления средней суммы продаж в месяц.
    void averageAmountOfSalesPerMonth() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        double actual = service.averageAmountOfSalesPerMonth(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test//Тест ля вычисления номера месяца с максимальными продажами.
    void monthWithTheMaximumSales() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.monthWithTheMaximumSales(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test//Тест ля вычисления номера месяца с минимальными продажами.
    void monthWithTheMinimumSales() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.monthWithTheMinimumSales(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test //Тест для вычисления количества месяцев с продажами ниже среднего.
    void monthsWithBelowAverageSales() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthsWithBelowAverageSales(salesByMonth);

        assertEquals(expected, actual);
    }

    @Test //Тест для вычисления количества месяцев с продажами выше среднего.
    void monthsWithAboveAverageSales() {
        StatsService service = new StatsService();

        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthsWithAboveAverageSales(salesByMonth);

        assertEquals(expected, actual);
    }
}
