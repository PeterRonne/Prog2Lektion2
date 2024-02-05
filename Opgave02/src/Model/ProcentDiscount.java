package Model;

public class ProcentDiscount extends Discount {

    private int procentDiscount;

    public ProcentDiscount(String description, int procentDiscount) {
        super(description);
        this.procentDiscount = procentDiscount;
    }


    @Override
    public double applyDiscount(Basket basket) {
        return - basket.getTotal() * procentDiscount / 100;
    }
}
