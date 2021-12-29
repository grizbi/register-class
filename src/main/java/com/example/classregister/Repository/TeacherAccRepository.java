package com.example.classregister.Repository;

import com.example.classregister.Entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherAccRepository extends JpaRepository<Accounts, Integer> {
}
