public class Book {
    private String title;
    private String isbn;
    private Author author;

    public Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }


    public String getTitle(){
        return title;
    }

    public String getisbn(){
        return isbn;
    }

    public Author getAuthor(){
        return author;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
}
