package com.example.classregister.Service;

import com.example.classregister.Entity.Accounts;
import com.example.classregister.Repository.TeacherAccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService implements UserDetailsService {

    @Autowired
    TeacherAccRepository teacherAccRepository;


    @Override
    public UserDetails loadUserByUsername(String Login) throws UsernameNotFoundException {
        Optional<Accounts> teacher = teacherAccRepository.findByLogin(Login);

        return teacher
                .map(MyUserDetails::new)
                .orElseThrow( () -> new UsernameNotFoundException("Not found : " + Login) );
    }
}
