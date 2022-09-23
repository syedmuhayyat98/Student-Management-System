package com.example.Student.Management.System.Student;

import com.example.Student.Management.System.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
