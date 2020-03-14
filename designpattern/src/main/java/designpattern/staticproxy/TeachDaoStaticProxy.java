package designpattern.staticproxy;

public class TeachDaoStaticProxy implements ITeacher {
    private ITeacher target;
    @Override
    public void teach() {
        System.out.println("准备上课。。。。");
        target.teach();
        System.out.println("授课结束，goodbye ~ ~");
    }

    public TeachDaoStaticProxy(ITeacher target) {
        this.target = target;
    }

    public ITeacher getTarget() {
        return target;
    }

    public void setTarget(ITeacher target) {
        this.target = target;
    }
}
