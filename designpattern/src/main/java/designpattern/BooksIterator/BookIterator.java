package designpattern.BooksIterator;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator {
    private List<String> bookList;
    int position = -1;
    @Override
    public boolean hasNext() {
        if((position + 1) < bookList.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String next() {
        position++;
        return bookList.get(position);
    }

    public BookIterator(List<String> bookList) {
        this.bookList = bookList;
    }
}
