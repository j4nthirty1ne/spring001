package org.example.assignment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssignmentApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(StudentService studentService) {
        return args -> {
            System.out.println("All students:");
            studentService.selectAll().forEach(System.out::println);

            System.out.println("\nSelect by ID 3:");
            System.out.println(studentService.selectById(3).orElse(null));

            System.out.println("\nInsert new student:");
            Student newStudent = new Student(11, "Jeak Jean", "male", 88.8);
            studentService.insert(newStudent);
            studentService.selectAll().forEach(System.out::println);

            System.out.println("\nUpdate student ID 2:");
            studentService.updateById(2, new Student(2, "Nom Tukey Updated", "Male", 80.0));
            System.out.println(studentService.selectById(2).orElse(null));

            System.out.println("\nDelete student ID 1:");
            studentService.deleteById(1);
            studentService.selectAll().forEach(System.out::println);
        };
    }
}
