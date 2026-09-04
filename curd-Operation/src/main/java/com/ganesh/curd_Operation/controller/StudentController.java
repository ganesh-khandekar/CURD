package com.ganesh.curd_Operation.controller;

import com.ganesh.curd_Operation.entity.Student;
import com.ganesh.curd_Operation.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student/api")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService =studentService;
    }

    @PostMapping("/create")
    public String create(@RequestBody Student student){
        studentService.create(student);
        return "sucess";
    }
}
