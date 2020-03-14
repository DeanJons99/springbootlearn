package designpattern.decorator;

public abstract class Display {
    public abstract int getColumns();

    public abstract int getRows();

    public abstract String getRowText(int row);

    public final void show() {
        for (int row = getRows(); row > 0; --row) {
            System.out.println(getRowText(row));
        }
    }

}