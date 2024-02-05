package Model;

public class TwoForOneDiscount extends Discount{


    public TwoForOneDiscount(String description) {
        super(description);
    }

    @Override
    public double applyDiscount(Basket basket) {
        double cheapestItem = Integer.MAX_VALUE;
        for (Book item : basket.getItems()) {
            if (item.getPrice() < cheapestItem) {
                cheapestItem = item.getPrice();
            }
        }
        return -cheapestItem;
    }
}
