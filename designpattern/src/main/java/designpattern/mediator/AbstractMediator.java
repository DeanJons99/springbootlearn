package designpattern.mediator;

public abstract class AbstractMediator {
    protected MysqlDatabase mysqlDatabase;
    protected RedisDatabase redisDatabase;
//    protected EsDatabase esDatabase;

    public MysqlDatabase getMysqlDatabase() {
        return mysqlDatabase;
    }

    public void setMysqlDatabase(MysqlDatabase mysqlDatabase) {
        this.mysqlDatabase = mysqlDatabase;
    }

    public RedisDatabase getRedisDatabase() {
        return redisDatabase;
    }

    public void setRedisDatabase(RedisDatabase redisDatabase) {
        this.redisDatabase = redisDatabase;
    }

    public abstract void sync(String databaseName, String data);
}
