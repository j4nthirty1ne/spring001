package org.example.assignment;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final List<Student> students;

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public List<Student> selectAll() {
        return students;
    }

    public Optional<Student> selectById(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst();
    }

    public void insert(Student student) {
        students.add(student);
    }

    public boolean updateById(int id, Student updatedStudent) {
        Optional<Student> opt = selectById(id);
        if (opt.isPresent()) {
            Student s = opt.get();
            s.setFullName(updatedStudent.getFullName());
            s.setGender(updatedStudent.getGender());
            s.setScore(updatedStudent.getScore());
            return true;
        }
        return false;
    }

    public boolean deleteById(int id) {
        return students.removeIf(s -> s.getId() == id);
    }
}