package fr.arsenelapostolet.library.bookstates;

import fr.arsenelapostolet.library.book.Book;
import fr.arsenelapostolet.library.book.BookState;

public abstract class AbstractBookState implements BookState {

    private final Book book;

    public AbstractBookState(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
