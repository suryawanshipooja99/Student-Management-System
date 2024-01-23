package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.student.entity.StudentEntity;
import com.example.student.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public StudentEntity saveStudent(StudentEntity studentEntity)
    {
    return repository.save(studentEntity);
    }
    

    public List<StudentEntity> findAll() {
        return repository.findAll();

    }

    public StudentEntity findStudentById(int id) {
        return repository.findById(id).orElse(null);

    }

    public StudentEntity updateStudent(int id , StudentEntity updateStudent) {
        StudentEntity existingStudent = repository.findById(id).get();//find id in runtime
        existingStudent.setStudentName(updateStudent.getStudentName());
        existingStudent.setAddress(updateStudent.getAddress());
        return repository.save(existingStudent);

    }

    public int deleteStudent(@PathVariable int id) {
         repository.deleteById(id);
         return id;

    }

    

    

}
