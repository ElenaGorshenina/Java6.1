import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @org.junit.jupiter.api.Test
    void totalAmount() {
        long expected = 180;
        long actual = service.totalAmount(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageAmount() {
        long expected = 15;
        long actual = service.averageAmount(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthMaxSale  () {
        long expected = 8;
        long actual = service.monthMaxSale(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthMinSale  () {
        long expected = 9;
        long actual = service.monthMinSale(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageAmountMin() {
        long expected = 5;
        long actual = service.averageAmountMin(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageAmountMax() {
        long expected = 5;
        long actual = service.averageAmountMax(sales);
        assertEquals(expected, actual);
    }
}
