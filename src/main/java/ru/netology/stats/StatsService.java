package ru.netology.stats;

public class StatsService {

    public long totalAmount(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long averageAmount(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        result = result / sales.length;
        return result;
    }

    public long monthMaxSale(long[] sales) {
        long max = sales[0];
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        int month = 1;
        int maxMonth = 0;
        for (long sale : sales) {
            if (sale == max) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth;
    }

    public long monthMinSale(long[] sales) {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        int month = 1;
        int minMonth = 0;
        for (long sale : sales) {
            if (sale == min) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth;
    }

    public long averageAmountMin(long[] sales) {
        long result = 0;
        int averageAmountMin = 0;
        for (long sale : sales) {
            result += sale;
        }
        result = result / sales.length;
        for (long sale : sales) {
            if (sale < result) {
                averageAmountMin += 1;
            }
        }
        return averageAmountMin;
    }

    public long averageAmountMax(long[] sales) {
        long result = 0;
        int averageAmountMax = 0;
        for (long sale : sales) {
            result += sale;
        }
        result = result / sales.length;
        for (long sale : sales) {
            if (sale > result) {
                averageAmountMax += 1;
            }
        }
        return averageAmountMax;
    }
}
