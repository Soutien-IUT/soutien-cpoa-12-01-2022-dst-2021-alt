package fr.arsenelapostolet.library.book;

public interface BookState {
    void borrow(Subscriber subscriber);
    void giveBack();
    void reserve(Subscriber subscriber);
}
