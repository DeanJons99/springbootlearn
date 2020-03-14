package designpattern.mediator;

/**
 * @author liuqiang
 */
public class SyncMediator extends AbstractMediator {

    @Override
    public void sync(String databaseName, String data) {
        if(AbstractColleagueDatabase.MYSQL.equals(databaseName)) {
            super.redisDatabase.addData(data);
        } else if(AbstractColleagueDatabase.REDIS.equals(databaseName)) {
            super.mysqlDatabase.addData(data);
        }
    }
}
