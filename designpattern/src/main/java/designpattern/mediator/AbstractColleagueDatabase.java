package designpattern.mediator;

public abstract class AbstractColleagueDatabase {
    public static final String MYSQL = "mysql";
    public static final String REDIS = "redis";
//    public static final String ELASTICSEARCH = "elasticsearch";

    protected AbstractMediator mediator;    // 中介者

    public AbstractColleagueDatabase(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void addData(String data);

    public abstract void addSyn(String data);


}
