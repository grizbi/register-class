package com.example.classregister.Service;


import com.example.classregister.Entity.Student;
import com.example.classregister.Repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentsRepository studentRepository;

    public List<Student> getStudents(){

        return (List<Student>) studentRepository.findAll();

    }

    public void addStudents(Student student){
        studentRepository.save(student);
    }

    public Student getStudentById(Integer id){
        return studentRepository.getById(id);
    }

    public void deleteStudent(Student student){
        studentRepository.delete(student);
    }


    //public void deleteStudent()








}
