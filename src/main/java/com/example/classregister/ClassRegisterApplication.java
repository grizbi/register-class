package com.example.classregister;

import com.example.classregister.Entity.Student;
import com.example.classregister.Repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ClassRegisterApplication implements CommandLineRunner {

    @Autowired
    StudentsRepository studentsRepository;

    public static void main(String[] args) {
        SpringApplication.run(ClassRegisterApplication.class, args);

    }


    @Override
    public void run(String... args)   {


/*



        List<Student> list1 = new ArrayList<>( Arrays.asList(
                new Student(3.5, "John", "Kowalsky", 19),
                new Student(5.0, "Peter", "Jones", 16),
                new Student(4.0, "Smith", "Evans", 18),
                new Student(2.0, "Mark", "Wood", 15)
            )
        );


        for(Student st : list1)
            studentsRepository.save(st);


 */






    }
}
