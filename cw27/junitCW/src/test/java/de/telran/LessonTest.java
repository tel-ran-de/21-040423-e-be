package de.telran;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class LessonTest {

    @Test
    @DisplayName("Test for 4 Students with score 3")
    public void testFourStudentsWithScore3ShouldReturn3() {
        List<Student> students = List.of(
                new Student(3, "Ivan"),
                new Student(3, "Vasya"),
                new Student(3, "Petya"),
                new Student(3, "Vova")
        );
        double expected = 3.0;

        Lesson lesson = new Lesson(students);
        double actual = lesson.averageScore();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTwoStudentsWithScore3AndTwoWithScore4ShouldReturn3PointFive() {
        List<Student> students = List.of(
                new Student(3, "Ivan"),
                new Student(3, "Vasya"),
                new Student(4, "Petya"),
                new Student(4, "Vova")
        );
        Lesson lesson = new Lesson(students);
        double expected = 3.5;
        double actual = lesson.averageScore();
        Assertions.assertEquals(expected, actual);
    }


    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(List.of(
                        new Student(3, "Ivan"),
                        new Student(3, "Vasya"),
                        new Student(4, "Petya"),
                        new Student(4, "Vova")
                ), 3.5),
                Arguments.of(List.of(
                        new Student(3, "Ivan"),
                        new Student(3, "Vasya"),
                        new Student(3, "Petya"),
                        new Student(3, "Vova")),
                        3.0)
        );
    }

    @ParameterizedTest(name = "test {1}")
    @MethodSource("data")
    public void testStudents(List<Student> students, double expected) {
        Lesson lesson = new Lesson(students);
        double actual = lesson.averageScore();
        Assertions.assertEquals(expected, actual);
    }
}