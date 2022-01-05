package com.example.classregister.Controller;

import com.example.classregister.Entity.Accounts;
import com.example.classregister.Entity.Student;
import com.example.classregister.Repository.TeacherAccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LoginController {


    @Autowired
    TeacherAccRepository teacherRepository;

    @GetMapping("/login")
    public String loggingPage(Model m){

        m.addAttribute("account", new Accounts());
        return "Login";

    }

//    @PostMapping("/logged")
//    public String showUser(@ModelAttribute Accounts formAcc, Model m){
//
//        List<Accounts> list = teacherRepository.findAll();
//
//        for(Accounts ac : list){
//            if(formAcc.getLogin().equals(ac.getLogin()) && formAcc.getPassword().equals(formAcc.getPassword())) {
//                m.addAttribute("account", ac);
//                return "redirect:/students/"+formAcc.getLogin();
//            }
//        }
//
//        return "redirect:/students";
//
//    }


}
