package org.example.assignment;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final InMemoryDatabase inMemoryDatabase;
    private final List<Student> students;

    @GetMapping("/add")
    public void insert() {
        Student student = new Student();
        student.setId(new Random().nextInt(10));
        student.setUuid(UUID.randomUUID().toString());
        student.setFullName("Kak-" + new Random().nextInt(10));
        student.setScore(77.99);
        inMemoryDatabase.insert(student);
    }

    @GetMapping()
    public List<Student> findAllStudent() {
        return students;
    }
}
