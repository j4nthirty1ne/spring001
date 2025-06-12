package org.example.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InMemoryDatabase {
    @Bean
    public List<Student> studentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Kak", "Male", 85.0));
        students.add(new Student(2, "Jork", "Male", 78.5));
        students.add(new Student(3, "Jing", "Female", 92.0));
        students.add(new Student(4, "Kak Spring", "Male", 88.0));
        students.add(new Student(5, "Kak React", "Female", 95.5));
        students.add(new Student(6, "Moni", "Male", 67.0));
        students.add(new Student(7, "Matra", "Male", 80.0));
        students.add(new Student(8, "Red Red", "Female", 73.5));
        students.add(new Student(9, "Ketty", "Female", 90.0));
        students.add(new Student(10, "Jack", "Male", 82.0));
        return students;
    }
}
