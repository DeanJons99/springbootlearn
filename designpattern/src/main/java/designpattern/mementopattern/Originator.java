package designpattern.mementopattern;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setState(Memento memento) {
        this.state = memento.getState();
    }
    public Originator(String state) {
        this.state = state;
    }

    public Memento saveSnap() {
        return new Memento(this.state);
    }

}
