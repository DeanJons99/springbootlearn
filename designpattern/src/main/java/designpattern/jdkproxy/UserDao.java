package designpattern.jdkproxy;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存成功");
    }
}