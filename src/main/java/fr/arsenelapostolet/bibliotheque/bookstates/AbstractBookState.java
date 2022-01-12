package fr.arsenelapostolet.bibliotheque.bookstates;

import fr.arsenelapostolet.bibliotheque.book.Book;
import fr.arsenelapostolet.bibliotheque.book.BookState;

public abstract class AbstractBookState implements BookState {

    private final Book book;

    public AbstractBookState(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
