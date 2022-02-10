package ru.netology.stats;

public class StatsService {

    public int sumOfAll(int[] salesByMonth) { //Метод ля вычисления суммы всех продаж.
        int sumOfAll = 0;
        for (int index = 0; index < salesByMonth.length; index++) {
            sumOfAll = sumOfAll + salesByMonth[index];
        }
        return sumOfAll;
    }

    public double averageAmountOfSalesPerMonth(int[] salesByMonth) { //Метод ля вычисления средней суммы продаж в месяц.
        double averageAmountOfSalesPerMonth;
        StatsService service = new StatsService();
        averageAmountOfSalesPerMonth = service.sumOfAll(salesByMonth) / salesByMonth.length;
        return averageAmountOfSalesPerMonth;
    }

    public int monthWithTheMaximumSales(int[] salesByMonth) { //Метод ля вычисления номера месяца с максимальными продажами.
        int maxMonth = 0;
        int month = 0;
        for (long sale : salesByMonth) {
            if (sale >= salesByMonth[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthWithTheMinimumSales(int[] salesByMonth) { //Метод ля вычисления номера месяца с минимальными продажами.
        int minMonth = 0;
        int month = 0;
        for (long sale : salesByMonth) {
            if (sale <= salesByMonth[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsWithBelowAverageSales(int[] salesByMonth) { //Количество месяцев с продажами ниже среднего.
        StatsService service = new StatsService();
        int monthsWithBelowAverageSales = 0;
        for(int index = 0; index < salesByMonth.length; index++) {
            if(salesByMonth[index] > service.averageAmountOfSalesPerMonth(salesByMonth)) monthsWithBelowAverageSales++;
        }
        return monthsWithBelowAverageSales;
    }

    public int monthsWithAboveAverageSales(int[] salesByMonth) { //Количество месяцев с продажами выше среднего.
        StatsService service = new StatsService();
        int monthsWithAboveAverageSales = 0;
        for (int index = 0; index < salesByMonth.length; index++) {
            if (salesByMonth[index] < service.averageAmountOfSalesPerMonth(salesByMonth)) monthsWithAboveAverageSales++;
        }
        return monthsWithAboveAverageSales;
    }
}

