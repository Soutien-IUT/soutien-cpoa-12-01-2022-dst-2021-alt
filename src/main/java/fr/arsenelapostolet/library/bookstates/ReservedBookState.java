package fr.arsenelapostolet.library.bookstates;

import fr.arsenelapostolet.library.book.Book;
import fr.arsenelapostolet.library.book.Subscriber;

public class ReservedBookState extends AbstractBookState {
    private final Subscriber borrower;

    public ReservedBookState(Book book, Subscriber borrower) {
        super(book);
        this.borrower = borrower;
    }

    @Override
    public void borrow(Subscriber subscriber) {
        if((this.borrower.getId() == subscriber.getId())) {
            this.getBook().setState(new BorrowedBookState(this.getBook(), subscriber));
        }
        throw new UnsupportedOperationException("Your can't borrow a reserved book if you're not the reserver");
    }


    @Override
    public void giveBack() {
        throw new UnsupportedOperationException("Your can't give back a non borrowed book");
    }

    @Override
    public void reserve(Subscriber subscriber) {
        throw new UnsupportedOperationException("Your can't reserved a reserved book");

    }
}
