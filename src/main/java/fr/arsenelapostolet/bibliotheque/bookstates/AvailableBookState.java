package fr.arsenelapostolet.bibliotheque.bookstates;

import fr.arsenelapostolet.bibliotheque.book.Book;
import fr.arsenelapostolet.bibliotheque.book.Subscriber;

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
