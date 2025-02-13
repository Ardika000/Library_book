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

    public void printBook(){
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author.getName());
        System.out.println("Biography: " +author.getBio());
        System.out.println("------------------------");
    }

}
