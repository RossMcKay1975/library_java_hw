import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity) {
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.stock.size();
    }

    public void addToStock(Book book){
        this.stock.add(book);

    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addBook(Book book) {
        Book stock[];
        for (Book title : this.stock) {
            if (Book stock <= capacity){
                this.stock(book)
            }
        }
    }
}
