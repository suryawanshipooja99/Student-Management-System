package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.StudentEntity;
import com.example.student.service.StudentService;

@RestController
@RequestMapping()
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/allStudents")
    public List<StudentEntity> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/getStudent/{id}")
    public StudentEntity findStudentById(@PathVariable(required = true , name = "id") int userId) {
        return studentService.findStudentById(userId);
    }

    @PostMapping("/saveStudent")
    public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.saveStudent(studentEntity);
    }


    @PutMapping("/update/{id}")
    public StudentEntity updateStudent(@RequestBody  StudentEntity studentEntity , 
                                       @PathVariable(required = true , name = "id") int id){
        return studentService.updateStudent(id , studentEntity);
    }

    @DeleteMapping("/delete/{id}")
    public int deleteStudent(@PathVariable int id){
        return  studentService.deleteStudent(id);
    }

}
