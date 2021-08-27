package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(sales);

        assertEquals (expected, actual);
    }

   @Test
    void shouldCalculateAverage () {
        StatsService service = new StatsService();

       long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
       long expected = 15;
       long actual = service.calculateAverage(sales);

       assertEquals (expected, actual);
   }

  @Test
    void minSalesMonthNumber () {
        StatsService service = new StatsService();

      long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
      long expected = 9;
      long actual = service.minSales(sales);

      assertEquals (expected, actual);
  }

    @Test
    void maxSalesMonthNumber () {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);

        assertEquals (expected, actual);
    }

    @Test
    void shouldCalculateAmountMonthBelowAverage () {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.amountMonthBelowAverage(sales);

        assertEquals (expected, actual);
    }

    @Test
    void shouldCalculateAmountMonthOverAverage () {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.amountMonthOverAverage(sales);

        assertEquals (expected, actual);
    }
}