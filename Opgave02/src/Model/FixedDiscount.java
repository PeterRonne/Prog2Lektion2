package Model;

public class FixedDiscount extends Discount{
    private int fixedDiscount;
    private int minimumAmount;

    public FixedDiscount(String description, int fixedDiscount, int minimumAmount) {
        super(description);
        this.fixedDiscount = fixedDiscount;
        this.minimumAmount = minimumAmount;
    }

    @Override
    public double applyDiscount(Basket basket) {
        if (basket.getTotal() >= minimumAmount) {
            return fixedDiscount;
        } else {
            return 0;
        }
    }
}
