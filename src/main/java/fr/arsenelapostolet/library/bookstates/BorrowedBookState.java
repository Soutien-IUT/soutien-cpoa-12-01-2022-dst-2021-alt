package fr.arsenelapostolet.library.bookstates;

import fr.arsenelapostolet.library.book.Book;
import fr.arsenelapostolet.library.book.Subscriber;

public class BorrowedBookState extends AbstractBookState {

    private final Subscriber borrower;

    public BorrowedBookState(Book book, Subscriber borrower) {
        super(book);
        this.borrower = borrower;
    }

    @Override
    public void borrow(Subscriber subscriber) {
        throw new UnsupportedOperationException("Can't borrow a book if it's already borrowed");
    }

    @Override
    public void giveBack() {
        this.getBook().setState(new AvailableBookState(this.getBook()));
    }

    @Override
    public void reserve(Subscriber subscriber) {
        throw new UnsupportedOperationException("Can't reserve a book if it's borrowed");
    }
}
