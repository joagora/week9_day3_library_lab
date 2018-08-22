package db;

import models.Book;
import models.Borrower;

public class Seeds {
    public static void seedData() {
        Book bookHobbit = new Book("Hobbit", "J.R.R. Tolkien");
        DBHelper.save(bookHobbit);
        Borrower borrowerMike = new Borrower("Mike");
        DBHelper.save(borrowerMike);
    }
}
