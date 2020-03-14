package designpattern.composite;

public class File extends Entry {
    private String name;
    private Integer size;

    public File(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
