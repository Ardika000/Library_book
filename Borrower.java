import java.util.ArrayList;

public class Borrower {
    private String nameBorrowed;
    private ArrayList<Book> BorrowedBooks;

    public Borrower(String nameBorrowed){
        this.nameBorrowed = nameBorrowed;
        this.BorrowedBooks = new ArrayList<>();
    }

    public String getBorrowedName(){
        return nameBorrowed;
    }

    
    public void setBorrowedName(String nameBorrowed){
        this.nameBorrowed = nameBorrowed;
    }

    public ArrayList<Book> getBorrowedBooks(){
        return BorrowedBooks;
    }
    
    public void setBorrowedBooks(Book Borroweds){
        this.BorrowedBooks.add(Borroweds);
    }

    public void displayBorrowedBooks() {
        System.out.println(this.nameBorrowed+"'s Borrowed Books:");
        for(Book book:BorrowedBooks){
            book.printBook();
        }
    }

    
}
