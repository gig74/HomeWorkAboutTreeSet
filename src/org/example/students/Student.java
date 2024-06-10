package org.example.students;

public record Student(String name, Float score) implements Comparable<Student> {

    @Override
    public int compareTo(Student o) {
        if (o.score.equals(this.score)) return this.name.compareTo(o.name) * (-1);
        else return this.score.compareTo(o.score) ; // Float.compare(this.score,o.score);
    }

    @Override
    public String toString() {
        return this.name + " : " + this.score.toString();
    }
}
