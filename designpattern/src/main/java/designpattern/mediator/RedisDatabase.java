package designpattern.mediator;

import java.util.ArrayList;

public class RedisDatabase extends  AbstractColleagueDatabase {
    private ArrayList<String> dataSet = new ArrayList<>();
    public RedisDatabase(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void addData(String data) {
        dataSet.add(data);
        System.out.println("redis add [ " + data +" ]");
    }

    @Override
    public void addSyn(String data) {
        addData(data);
        this.mediator.sync(super.REDIS, data);
    }
}
