package designpattern.visitor;

public class Student implements Element {
    private String name;
    private Integer grade; //成绩
    private Integer paperCount;

    public Student(String name, Integer grade, Integer paperCount) {
        this.name = name;
        this.grade = grade;
        this.paperCount = paperCount;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(Integer paperCount) {
        this.paperCount = paperCount;
    }
}
