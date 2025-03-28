package com.thusharacharya.ResultPortal.repository;

import com.thusharacharya.ResultPortal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findBySclId(String sclId);

    Optional<Student> findByReg(String reg);
}
