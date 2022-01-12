package fr.arsenelapostolet.library;

import fr.arsenelapostolet.library.book.Book;
import fr.arsenelapostolet.library.book.Subscriber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestLibrary {

    @Test
    public void book_reservedBook_cantBeBorrowedByNonReserver(){
        // Given
        Subscriber subscriber1 = new Subscriber(42);
        Subscriber subscriber2 = new Subscriber(99);
        Book book = new Book("Clean Code", "Robert C. Martin");
        book.reserve(subscriber1);

        // When & Then
        assertThrows(UnsupportedOperationException.class, () -> book.borrow(subscriber2));
    }

}
