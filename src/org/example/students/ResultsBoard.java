package org.example.students;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ResultsBoard {
    private TreeSet<Student> resultBoardSet = new TreeSet<>();
    public ResultsBoard(){
        super();
    }
    public void addStudent(String name, Float score) {
        Student student = new Student(name,score);
        resultBoardSet.add(student);
    }
    public List<String> top3() {
        List<String> top3Student = new LinkedList<>() ; // Linked... - для сохранения порядка выборки
        int count = 0;
        for (Student student: resultBoardSet.descendingSet()) {
            count++;
            if ( count > 3 ) break;
            top3Student.add(student.name());
        }

        return top3Student;
    }

    public TreeSet<Student> getAll() {
        return new TreeSet<>(resultBoardSet);
    }
}
