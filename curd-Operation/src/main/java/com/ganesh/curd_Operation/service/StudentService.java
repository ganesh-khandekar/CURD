package com.ganesh.curd_Operation.service;

import com.ganesh.curd_Operation.entity.Student;
import com.ganesh.curd_Operation.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void create(Student student) {
        student.setActive(true);
        studentRepository.save(student);
    }

    public Student getbyID(Long id) {
        return studentRepository.getById(id);
    }
}
