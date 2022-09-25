public class SalesManager {
    protected int[] sales;

    public SalesManager() {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public static int avgExcludingMinMax(int[] sales) {
        int max = sales[0];
        int min = sales[0];
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            if (sales[i] > max) {
                max = sales[i];
            }
            if (sales[i] < min) {
                min = sales[i];
            }
        }
        return ((sum - max - min) / (sales.length - 2));
    }
}
