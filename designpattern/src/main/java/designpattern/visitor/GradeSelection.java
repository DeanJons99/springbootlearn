package designpattern.visitor;

public class GradeSelection implements Visitor {
    private String awardWords = "[%s]的分数是%d，荣获了成绩优秀奖。";

    @Override
    public void visit(Student student) {
        if (student.getGrade() >= 90) {
            System.out.println(String.format(awardWords,
                    student.getName(), student.getGrade()));
        }
    }

    @Override
    public void visit(Teacher teacher) {
// 如果老师反馈得分超过85，则入围成绩优秀奖。
        if (teacher.getScore() >= 85) {
            System.out.println(String.format(awardWords,
                    teacher.getName(), teacher.getScore()));
        }
    }
}
