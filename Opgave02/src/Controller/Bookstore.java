package Controller;

import Model.*;

public class Bookstore {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addItem(new Book(600, "Introduction to Java Programming and Data Structures"));
        basket.addItem(new Book(350, "Head First Design Patterns"));
        basket.addItem(new EBook(200, "SQL in 10 Minutes"));
        basket.addItem(new Book(250, "Organisation"));

        basket.addDiscount(new ProcentDiscount("10% rabat på alt", 10));
        basket.addDiscount(new FixedDiscount("25 kr rabat på beløb over 500 kr.", -25, 500));
        basket.addDiscount(new FixedDiscount("50 kr rabat på beløb over 1000 kr.",-50, 1000));
        basket.addDiscount(new EBookProcentDiscount("50% på alle ebøger", 50));
        basket.addDiscount(new TwoForOneDiscount("2-for-1 rabat."));

        basket.printTotal();


    }
}
