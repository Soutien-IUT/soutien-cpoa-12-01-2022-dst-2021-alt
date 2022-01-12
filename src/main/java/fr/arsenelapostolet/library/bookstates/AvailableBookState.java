package fr.arsenelapostolet.library.bookstates;

import fr.arsenelapostolet.library.book.Book;
import fr.arsenelapostolet.library.book.Subscriber;

public class AvailableBookState extends AbstractBookState {


    public AvailableBookState(Book book) {
        super(book);
    }

    @Override
    public void borrow(Subscriber subscriber) {
        this.getBook().setState(new BorrowedBookState(this.getBook(), subscriber));
    }

    @Override
    public void giveBack() {
        throw new UnsupportedOperationException("Can't give back a book if it's already available");
    }

    @Override
    public void reserve(Subscriber subscriber) {
        this.getBook().setState(new ReservedBookState(this.getBook(), subscriber));
    }
}
