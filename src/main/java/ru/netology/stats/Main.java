import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[]salesByMonth= {8,15,13,15,17,20,19,20,7,14,14,18};

        int sumOfAll = service.sumOfAll(salesByMonth);
        System.out.println(sumOfAll);

        double averageAmountOfSalesPerMonth = service.averageAmountOfSalesPerMonth(salesByMonth);
        System.out.println(averageAmountOfSalesPerMonth);

        int monthWithTheMaximumSales = service.monthWithTheMaximumSales(salesByMonth);
        System.out.println(monthWithTheMaximumSales);

        int monthWithTheMinimumSales = service.monthWithTheMinimumSales(salesByMonth);
        System.out.println(monthWithTheMinimumSales);

        int monthsWithBelowAverageSales = service.monthsWithBelowAverageSales(salesByMonth);
        System.out.println(monthsWithBelowAverageSales);

        int monthsWithAboveAverageSales = service.monthsWithAboveAverageSales(salesByMonth);
        System.out.println(monthsWithAboveAverageSales);
    }
}
