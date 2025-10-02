package app;

public class Main {
    public static void main(String[] args) {
        ProductSellStats smartphone = new ProductSellStats(1, 2430.68, 5, "smartphone");

        ProductSellStats laptop = new ProductSellStats();

        laptop.product = "laptop";
        laptop.setProductCount(2);
        laptop.setDailyRevenue(1498.12);
        laptop.setPeriodRevenue(5);

        smartphone.printStats();
        laptop.printStats();
    }
}
