package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class StatsServiceTest {
    long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

    @Test
    public void SumSalesTest() {
        StatsService service = new StatsService();
        long actual = service.sumSales(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MiddleSaleTest() {
        StatsService service = new StatsService();
        long actual = service.middleSale(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MinSaleTest() {
        StatsService service = new StatsService();
        int actual = service.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxSaleTest() {
        StatsService service = new StatsService();
        int actual = service.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void UnderMiddleSalesTest() {
        StatsService service = new StatsService();
        int actual = service.underMiddleSales(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverMiddleSalesTest() {
        StatsService service = new StatsService();
        int actual = service.overMiddleSales(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}
