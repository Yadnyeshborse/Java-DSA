package Demo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        Set<Book> books=new HashSet<>();
        books.add(new Book("Harry Potter"));
        books.add(new Book("Harry Potter"));
        System.out.println("Size="+books.size());

    }
}
class Book{
    private String writtenBy;

    public Book(String writtenBy) {
        this.writtenBy = writtenBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(writtenBy, book.writtenBy);
    }

    @Override
    public int hashCode() {
        return 7;
    }



}
