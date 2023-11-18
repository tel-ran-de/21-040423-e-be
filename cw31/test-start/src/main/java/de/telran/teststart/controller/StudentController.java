package de.telran.teststart.controller;

import de.telran.teststart.model.Student;
import de.telran.teststart.storage.StudentStorage;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class StudentController {
    private StudentStorage studentStorage;

    public StudentController() {
        this.studentStorage = new StudentStorage(new ArrayList<>());
    }

    @GetMapping("/students")
    public List<Student> list() {
        return studentStorage.get();
    }

    @PostMapping("/add-student")
    public Student add(@RequestParam String name) {
        Student student = new Student();
        student.setBirthday(new Date());
        student.setFirstName(name);
        student.setLastName("Doe");
        studentStorage.add(student);
        return student;
    }
}
