package com.sumittechie.Repository;

import com.sumittechie.Entity.Course;
import com.sumittechie.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByNameContaining(String name);
}
