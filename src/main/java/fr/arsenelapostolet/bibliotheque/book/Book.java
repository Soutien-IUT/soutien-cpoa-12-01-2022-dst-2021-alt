package fr.arsenelapostolet.bibliotheque.book;

import fr.arsenelapostolet.bibliotheque.bookstates.AvailableBookState;

public class Book {

    private final String title;
    private final String author;
    private BookState state;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.state = new AvailableBookState(this);
    }

    public void borrow(Subscriber subscriber){
        this.state.borrow(subscriber);
    }

    public void giveBack(){
        this.state.giveBack();
    }

    public void reserve(Subscriber subscriber){
        this.state.reserve(subscriber);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setState(BookState newState) {
        this.state = newState;
    }
}
