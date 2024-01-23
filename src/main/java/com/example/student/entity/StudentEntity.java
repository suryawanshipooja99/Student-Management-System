package com.example.student.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentEntity {

    @Id
    @GeneratedValue
    private int id;
    private String studentName;
    private int studentRollNo;
    private String address;
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date admissionDate;
    private String studentClass;
    private String StudentStatus;
    
    
}
