
public class Main {
    public static void main(String[] args) {

        SalesManager salesManager = new SalesManager();
        int[] saleStat = new int[]{1, 2, 3, 4};
        salesManager.sales = saleStat;
        System.out.println(salesManager.max());
    }
}
