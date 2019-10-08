import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(100);
//        book = new Book();
    }

    @Test
    public void checkLibraryEmpty() {
        assertEquals(0, library.bookCount());
    }

//    @Test
//    public void addBookToStock(){
//        library.addToStock(book);
//        assertEquals(1, library.bookCount());
//    }

    @Test
    public void checkLibraryHasCapacity(){
        assertEquals(100, library.getCapacity());

    }
}
