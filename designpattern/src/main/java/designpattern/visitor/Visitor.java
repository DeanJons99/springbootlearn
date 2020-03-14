package designpattern.visitor;

public interface Visitor {
    void visit(Student student);

    void visit(Teacher teacher);
}
