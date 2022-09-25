
public class Main {
    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager();
        long[] saleStat = new long[]{1, 2, 3, 4};
        salesManager.sales = saleStat;
        System.out.println(salesManager.max());
    }
}
