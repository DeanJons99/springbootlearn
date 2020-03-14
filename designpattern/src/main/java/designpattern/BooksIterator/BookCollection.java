package designpattern.BooksIterator;

import java.util.Iterator;
import java.util.List;

public class BookCollection implements ICollection {
    private List<String> bookList;
    @Override
    public Iterator createIterator() {
        return new BookIterator(bookList);
    }

    public BookCollection(List<String> bookList) {
        this.bookList = bookList;
    }
}
