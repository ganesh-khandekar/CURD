package com.ganesh.curd_Operation.controller;

import com.ganesh.curd_Operation.entity.Student;
import com.ganesh.curd_Operation.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("id/{id}")
    public  Student getStudent(@PathVariable Long id){
       Student student = studentService.getbyID(id);
       return student;
    }

    @GetMapping("/")
    public List<Student> getAll(){
        return studentService.getAll();
    }
}
