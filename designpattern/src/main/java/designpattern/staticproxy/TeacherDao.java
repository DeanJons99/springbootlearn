package designpattern.staticproxy;

public class TeacherDao implements ITeacher {
    @Override
    public void teach() {
        System.out.println("老师正在上课。。。。。");
    }
}
