
public class Main {
    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager();
        long[] saleStat = new long[]{1, 2, 3, 4, 5, 6, 7, 8};

        salesManager.sales = saleStat;
        System.out.println(salesManager.max());

        SalesManager.avgExcludingMinMax(saleStat);
        System.out.println(salesManager.avgExcludingMinMax(saleStat));
    }
}
