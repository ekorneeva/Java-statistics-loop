package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            // sum = sum + sale;
            sum += sale;   // общая сумма всех продаж
        }
        return sum;
    }

    public int calcAvg(int[] sales) {
        return calculateSum(sales) / sales.length; // средняя сумма продаж
    }


    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int calcAvgMin(int[] sales) {
        int sumMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {    // для каждой продажи из массива продаж
            if (sale < calcAvg(sales)) {  // будем сравнивать продажу со средним значением
                month = 1;
                sumMonth += month;

            }
        }
        return sumMonth;
    }

    public int calcAvgMax(int[] sales) {
        int sumMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {    // для каждой продажи из массива продаж
            if (sale > calcAvg(sales)) {  // будем сравнивать продажу со средним значением
                month = 1;
                sumMonth += month;

            }
        }
        return sumMonth;
    }
}
