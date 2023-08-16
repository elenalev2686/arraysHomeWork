import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.arrayshomework.service.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldGetSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.getSalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAverageFromSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.getAverageFromSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.getMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMinSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.getMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.getAboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.getBelowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
