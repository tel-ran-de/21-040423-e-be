package de.telran.teststart.model;

import java.time.LocalTime;
import java.util.List;

public class Lesson {
    String name;
    LocalTime time;
    List<Student> students;

    public Lesson() {
    }

    public Lesson(String name, LocalTime time, List<Student> students) {
        this.name = name;
        this.time = time;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
