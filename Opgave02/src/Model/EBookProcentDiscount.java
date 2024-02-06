package Model;

public class EBookProcentDiscount extends Discount{

    private int procentDiscount;

    public EBookProcentDiscount(String description, int procentDiscount) {
        super(description);
        this.procentDiscount = procentDiscount;
    }

    @Override
    public double applyDiscount(Basket basket) {
        double ebookPrice = 0;
        for (Book item : basket.getItems()) {
            if (item instanceof EBook) {
                ebookPrice += item.getPrice();
            }
        }

        return - ebookPrice * procentDiscount / 100;
    }
}
