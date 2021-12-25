package com.example.classregister.Controller;


import com.example.classregister.Entity.Student;
import com.example.classregister.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listAllStudents(Model m){

        m.addAttribute("allStudents", studentService.getStudents());
        return "ClassRegister";
    }

    @GetMapping("/students/addstudent")
    public String createStudent(Model m){
        Student student = new Student();
        m.addAttribute("student", student);
        return "AddStudentView";

    }

    @PostMapping("/students")
    public String addStudent(@ModelAttribute("student")Student student){
        studentService.addStudents(student);
        return "redirect:/students";

    }

    @GetMapping("/students/update/{id}")
    public String updateStudent(@PathVariable Integer id, Model m){
        Student st = studentService.getStudentById(id);
        m.addAttribute("student", st);
        return "ModifyStudent";
    }

    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Integer id){

        Student st = studentService.getStudentById(id);
        studentService.deleteStudent(st);
        return "redirect:/students";

    }










}
