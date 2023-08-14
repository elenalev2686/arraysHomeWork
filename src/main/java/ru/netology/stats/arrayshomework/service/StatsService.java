package ru.netology.stats.arrayshomework.service;

public class StatsService {
    public long getSalesAmount(long[] sales) {
        long salesAmount = 0; int i;
        for (i=0; i<12; i++)
            salesAmount = salesAmount + sales[i];

        return salesAmount;
    }
    public long getAverageFromSales(long[] sales) {
        long salesAmount = 0; int i;
        for (i=0; i<12; i++)
            salesAmount = salesAmount + sales[i];

        return salesAmount /12;
    }
    public long getMaxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++)
            if (sales[i] >= sales[maxMonth])
                maxMonth = i;

        return maxMonth++;
    }
    public long getMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth])
                minMonth = i;
        }
        return minMonth++;
    }
    public long getAboveAverageSales(long[] sales) {
        int aboveAverageMonth = 0;
        long averageFromSales = getAverageFromSales(sales);

        for (int i = 0; i < 12; i++) {
            if (sales[i] > averageFromSales) {
                aboveAverageMonth++;
            }
        }
        return aboveAverageMonth;
    }
    public long getBelowAverageSales(long[] sales) {
        int belowAverageMonth = 0;
        long averageFromSales = getAverageFromSales(sales);

        for (int i = 0; i < 12; i++) {
            if (sales[i] < averageFromSales) {
                belowAverageMonth++;
            }
        }
        return belowAverageMonth;
    }
}

