package com.example.classregister.Repository;

import com.example.classregister.Entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

public interface TeacherAccRepository extends JpaRepository<Accounts, Integer> {

    Optional<Accounts> findByLogin(String login);





}
