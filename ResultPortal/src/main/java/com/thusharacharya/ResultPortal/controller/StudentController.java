package com.thusharacharya.ResultPortal.controller;

import com.thusharacharya.ResultPortal.model.Student;
import com.thusharacharya.ResultPortal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:5173")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> list() {
        return studentService.getAllStudents();
    }


    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable int id) {
        studentService.deleteStudentById(id);
        return "Student deleted with ID: " + id;
    }

    @GetMapping("/school/{sclId}")
    public List<Student> getStudentsBySclId(@PathVariable String sclId) {
        return studentService.getStudentsBySclId(sclId);
    }
    @GetMapping("/reg/{reg}")
    public Student getStudentByReg(@PathVariable String reg) {
        return studentService.getStudentByReg(reg);
    }

}
