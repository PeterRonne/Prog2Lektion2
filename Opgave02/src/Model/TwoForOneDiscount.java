package Model;

import java.util.ArrayList;

public class TwoForOneDiscount extends Discount{


    public TwoForOneDiscount(String description) {
        super(description);
    }

//    @Override
//    public double applyDiscount(Basket basket) {
//        double cheapestItem = Integer.MAX_VALUE;
//        for (Book item : basket.getItems()) {
//            if (item.getPrice() < cheapestItem) {
//                cheapestItem = item.getPrice();
//            }
//        }
//        return -cheapestItem;
//    }

    @Override
    public double applyDiscount(Basket basket) {
        ArrayList<Book> sortedBooks = sortBooksByPrice(basket.getItems());
        int freeBooksCount = sortedBooks.size() / 2;
        double discount = 0;

        for (int i = 0; i < freeBooksCount; i++) {
            discount += sortedBooks.get(i).getPrice();
        }
        return -discount;
    }

    public ArrayList<Book> sortBooksByPrice(ArrayList<Book> books) {
        ArrayList<Book> sortedBooks = new ArrayList<>(books);

        for (int i = 1; i < sortedBooks.size(); i++) {
            Book keyBook = sortedBooks.get(i);
            double key = keyBook.getPrice();
            int j = i - 1;

            while (j >= 0 && sortedBooks.get(j).getPrice() > key) {
                sortedBooks.set(j + 1, sortedBooks.get(j));
                j = j - 1;
            }

            sortedBooks.set(j + 1, keyBook);
        }

        return sortedBooks;
    }
}
