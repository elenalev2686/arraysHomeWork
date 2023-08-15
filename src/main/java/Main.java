import ru.netology.stats.arrayshomework.service.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Доход за каждый месяц составил: " + (Arrays.toString(sales)));
        StatsService service = new StatsService();
        System.out.println("Сумма всех продаж: " + service.getSalesAmount(sales));
        System.out.println("Средняя сумма продаж в месяц: " + service.getAverageFromSales(sales));
        System.out.println("Номер месяца максимальных продаж: " + service.getMaxSales(sales));
        System.out.println("Номер месяца минимальных продаж: " + service.getMinSales(sales));
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + service.getAboveAverageSales(sales));
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + service.getBelowAverageSales(sales));
    }
}
