import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Trainspotting", "Irvine Welsh", "Drama/Crime");
    }

    @Test
    public void checkBookHasTitle(){
        assertEquals("Trainspotting", book.getTitle());
    }
    @Test
    public void checkBookHasAuthour(){
        assertEquals("Irvine Welsh", book.getAuthor());
    }

    @Test
    public void checkBookHasGenre(){
        assertEquals("Drama/Crime", book.getGenre());
    }

}
