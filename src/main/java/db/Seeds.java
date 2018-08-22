package db;

import models.Book;
import models.Borrower;

public class Seeds {
    public static void seedData() {
        DBHelper.deleteAll(Book.class);
        DBHelper.deleteAll(Borrower.class);

        Book bookHobbit = new Book("Hobbit", "J.R.R. Tolkien");
        DBHelper.save(bookHobbit);
        Book bookLordOfTheRigns = new Book("Lord Of the Rings", "J.R.R. Tolkien");
        DBHelper.save(bookLordOfTheRigns);
        Book bookFinansowyNinja = new Book("Finansowy Ninja", "Michal Szafranski");
        DBHelper.save(bookFinansowyNinja);

        Borrower borrowerMike = new Borrower("Mike");
        DBHelper.save(borrowerMike);
    }
}
