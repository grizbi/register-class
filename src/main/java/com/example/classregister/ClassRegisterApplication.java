package com.example.classregister;

import com.example.classregister.Entity.Accounts;
import com.example.classregister.Entity.Student;
import com.example.classregister.Repository.StudentsRepository;
import com.example.classregister.Repository.TeacherAccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ClassRegisterApplication implements CommandLineRunner {

    @Autowired
    StudentsRepository studentsRepository;

    @Autowired
    TeacherAccRepository teacherRepository;

    public static void main(String[] args) {
        SpringApplication.run(ClassRegisterApplication.class, args);

    }


    @Override
    public void run(String... args)   {


        //creating teachers

//        Accounts acc1 = new Accounts("whaaland", "poiu", "Wesley", "Haaland");
//        Accounts acc2 = new Accounts("jgray","daher", "Jackson", "Gray");
//
//        teacherRepository.save(acc1);
//        teacherRepository.save(acc2);


/*

        //creating pupils

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
