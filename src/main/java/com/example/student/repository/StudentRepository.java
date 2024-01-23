package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

    

    
} 