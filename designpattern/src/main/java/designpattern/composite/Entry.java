package designpattern.composite;

public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) {
        throw new UnsupportedOperationException();
    }

    public abstract void printList(String prefix) ;
    public void printList() {
        printList("");
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
