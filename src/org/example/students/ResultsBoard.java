package org.example.students;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ResultsBoard {
    private TreeSet<Student> resutBoardSet = new TreeSet<>();
    public ResultsBoard(){
        super();
    }
    void addStudent(String name, Float score) {
        Student student = new Student(name,score);
        resutBoardSet.add(student);
    }
    List<String> top3() {
        List<String> top3Student = new LinkedList<>() ; // Linked... - для сохранения порядка выборки
        for (int i = 0 ; i < 3 ; i++)
        {
            Student student = resutBoardSet.pollLast();
            if (student == null) break; // Оборвать цикл если ничего не выбрано
            else top3Student.add(student.name());
        }
        return top3Student;
    }

    TreeSet<Student> getAll() {
        return new TreeSet<>(resutBoardSet);
    }
}
