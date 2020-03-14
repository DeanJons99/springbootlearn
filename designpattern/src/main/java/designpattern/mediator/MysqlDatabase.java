package designpattern.mediator;

import java.util.ArrayList;

public class MysqlDatabase extends AbstractColleagueDatabase {
    private ArrayList<String> dataSet = new ArrayList<>();

    public MysqlDatabase(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void addData(String data) {
        dataSet.add(data);
        System.out.println("mysql add [ " + data +" ]");
    }

    @Override
    public void addSyn(String data) {
        addData(data);
        this.mediator.sync(super.MYSQL, data);

    }
}
