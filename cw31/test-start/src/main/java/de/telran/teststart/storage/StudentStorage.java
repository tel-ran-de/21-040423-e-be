package de.telran.teststart.storage;

import de.telran.teststart.model.Student;

import java.util.List;

public class StudentStorage {
    List<Student> allStudents;

    public StudentStorage(List<Student> allStudents) {
        this.allStudents = allStudents;
    }

    public void add(Student student) {
        allStudents.add(student);
    }

    public List<Student> get(){
        return allStudents;
    }
}
