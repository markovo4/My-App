package app;

public class ProductSellStats {
    private static final String template = "\nProduct No %d: %s,\nTotal sales for %d days is EUR %f,\nSales by day is EUR %f.\n";
    private int productCount;
    private int period;
    private double periodRevenue;
    private double dailyRevenue;
    public String product;
    public ProductSellStats () {

    }

    public ProductSellStats (int productCount, double dailyRevenue, int period, String product) {
        this.productCount = productCount;
        this.dailyRevenue = dailyRevenue;
        this.periodRevenue = dailyRevenue * period;
        this.period = period;
        this.product = product;
    }

    public void setProductCount (int count) {
        if(count <= 0) {
            System.out.println("Invalid product No: " + count);
        } else {
            this.productCount = count;
        }
    }

    public void setPeriodRevenue (int days) {
        if(days <= 0) {
            System.out.println("Invalid time period: " + days);
        } else {
            this.period = days;
            this.periodRevenue = days * this.dailyRevenue;
        }
    }

    public void setDailyRevenue (double revenue) {
        if(revenue <= 0.00) {
            System.out.println("Invalid product No: " + revenue);
        } else {
            this.dailyRevenue = revenue;
        }
    }

    public void printStats () {
        if(this.productCount == 0 || this.product == null || this.period == 0 || this.periodRevenue == 0.0 || this.dailyRevenue == 0.0){
            System.out.println("Incomplete data provided!");
        } else {
            System.out.printf(template, this.productCount, this.product, this.period, this.periodRevenue, this.dailyRevenue);
        }
    }



}
