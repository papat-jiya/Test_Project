package com.example.lab5.repositories;

import com.example.lab5.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findStudentById (long kw);

}