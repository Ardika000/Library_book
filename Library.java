import java.util.ArrayList;

public class Library {
    private ArrayList<Book> libraryBooks;

    public Library(){
        this.libraryBooks = new ArrayList<>();
    }

    public ArrayList<Book> getLibraryBooks(){
        return libraryBooks;
    }
    
    public void addBook(Book book){
        if(book != null){
            this.libraryBooks.add(book);
            System.out.println("Book added to library: "+book.getTitle());
        }
    }

    public void borrowBook(Borrower borrower, Book book){
        if(libraryBooks.contains(book)){ // Meengecek bukunya ada apa nggak
            libraryBooks.remove(book);
            borrower.setBorrowedBooks(book);
            System.out.println(borrower.getBorrowedName()+" borrowed: " + book.getTitle());
        }else{
            System.out.println("Book not available");
        }
    }

    public void returnBook(Borrower borrower, Book book) {
        if(borrower.getBorrowedBooks().contains(book)){ // Cek bukunya beneran dipinjam apa nggak
            libraryBooks.add(book);
            borrower.getBorrowedBooks().remove(book);
            System.out.println(borrower.getBorrowedName() + " returned: " + book.getTitle());
        }else{
            System.out.println("Book not available");
        }
    }

    public void displayLibraryBooks() {
        System.out.println("Books's in Library: ");
        for (Book data : libraryBooks) {
            data.printBook();
        }
    }
}
