package com.thusharacharya.ResultPortal.service;

import com.thusharacharya.ResultPortal.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    List<Student> getStudentsBySclId(String sclId);

    Student getStudentByReg(String reg);
}
