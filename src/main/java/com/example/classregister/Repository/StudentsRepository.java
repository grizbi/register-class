package com.example.classregister.Repository;

import com.example.classregister.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface StudentsRepository extends JpaRepository<Student, Integer> {

}









