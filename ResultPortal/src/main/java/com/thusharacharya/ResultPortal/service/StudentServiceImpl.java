package com.thusharacharya.ResultPortal.service;


import com.thusharacharya.ResultPortal.model.Student;
import com.thusharacharya.ResultPortal.repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(null);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getStudentsBySclId(String sclId) {
        return studentRepository.findBySclId(sclId);
    }

    @Override
    public Student getStudentByReg(String reg) {
        return studentRepository.findByReg(reg)
                .orElseThrow(() -> new EntityNotFoundException("Student not found with registration number: " + reg));
    }
}
