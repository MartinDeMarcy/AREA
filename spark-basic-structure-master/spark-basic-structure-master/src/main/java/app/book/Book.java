package app.book;

import lombok.*;

@Value // All fields are private and final. Getters (but not setters) are generated (https://projectlombok.org/features/Value.html)
public class Book {
    String title;
    String author;
    String isbn;
    
    public Book(String t, String a, String i)
    {
        title = t;
        author = a;
        isbn = i;
    }
    
    public String getIsbn()
    {
        return isbn;
    }

    public String getMediumCover() {
        return "http://covers.openlibrary.org/b/isbn/" + this.isbn + "-M.jpg";
    }

    public String getLargeCover() {
        return "http://covers.openlibrary.org/b/isbn/" + this.isbn + "-L.jpg";
    }
}
