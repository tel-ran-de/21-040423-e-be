package de.telran;

import java.util.List;

public class Lesson {
    List<Student> students;

    public Lesson(List<Student> students) {
        this.students = students;
    }

    public double averageScore() {
        int totalScore = 0;
        for (Student student : students) {
            totalScore += student.getScore();
        }
        return totalScore * 1.0 / students.size();
    }
}
