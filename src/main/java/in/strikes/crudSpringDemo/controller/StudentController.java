package in.strikes.crudSpringDemo.controller;

import in.strikes.crudSpringDemo.entity.Student;
import in.strikes.crudSpringDemo.services.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @PostMapping("/create")
    public String createStudent(@RequestBody Student student){
        Student createdStudent = studentService.createStudent(student);
        System.out.println("Inside student controller");
        return "Student Created";
    }

    // create
    // read
    // delete
}
