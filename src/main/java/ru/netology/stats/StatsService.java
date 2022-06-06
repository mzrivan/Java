package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sumSales = 0;   //Сумма продаж
        for (long value : sales) {
            sumSales = sumSales + value;
        }
        return sumSales;
    }

    public long middleSale(long[] sales) {
        long middleSale = sumSales(sales) / sales.length; //Средняя сумма продаж в месяц
        return middleSale;
    }

    public int minSales(long[] sales) {
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

    public int maxSales(long[] sales) {
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

    public int underMiddleSales(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale < middleSale(sales)) {
                month++;
            }

        }
        return month;
    }
    public int overMiddleSales(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale > middleSale(sales)) {
                month++;
            }

        }
        return month;
    }

}
