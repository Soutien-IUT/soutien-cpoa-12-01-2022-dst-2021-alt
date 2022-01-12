package fr.arsenelapostolet.bibliotheque.bookstates;

import fr.arsenelapostolet.bibliotheque.book.Book;
import fr.arsenelapostolet.bibliotheque.book.Subscriber;

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
