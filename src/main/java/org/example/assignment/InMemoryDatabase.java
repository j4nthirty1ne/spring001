package org.example.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Configuration
public class InMemoryDatabase {

    private final List<Student> data;

    public InMemoryDatabase() {
        Student student1 = new Student();
        student1.setId(1);
        student1.setUuid(UUID.randomUUID().toString());
        student1.setFullName("Jork");
        student1.setScore(99.99);

        Student student2 = new Student();
        student2.setId(2);
        student2.setUuid(UUID.randomUUID().toString());
        student2.setFullName("moni");
        student2.setScore(89.99);

        this.data = new ArrayList<>();
        this.data.addAll(List.of(student1, student2));
    }

    @Bean
    List<Student> students() {
        return data;
    }

    public void insert(Student student) {
        this.data.add(student);
    }

    @Bean("s1")
    public Student student1() {
        Student student = new Student();
        student.setId(1);
        student.setUuid(UUID.randomUUID().toString());
        student.setFullName("Jork");
        student.setScore(99.99);
        return student;
    }

    @Bean("s2")
    public Student student2() {
        Student student = new Student();
        student.setId(2);
        student.setUuid(UUID.randomUUID().toString());
        student.setFullName("Moni");
        student.setScore(89.99);
        return student;
    }
}