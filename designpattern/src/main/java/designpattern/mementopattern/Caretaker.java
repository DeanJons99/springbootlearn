package designpattern.mementopattern;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento> stateList;

    public Caretaker() {
        this.stateList = new ArrayList<>();
    }

    public void push(Memento memento) {
        this.stateList.add(memento);
    }

    public Memento undo() {
        try {
            int index = this.stateList.size() - 1;
            Memento memento = this.stateList.get(index);
            this.stateList.remove(index);
            return memento;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
