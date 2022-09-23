package com.example.Student.Management.System.Student;

import com.example.Student.Management.System.Student.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
