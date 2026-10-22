package in.strikes.crudSpringDemo.services;

import in.strikes.crudSpringDemo.entity.Student;
import in.strikes.crudSpringDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
       Student studentResp = studentRepository.saveStudent(studentReq);
        System.out.println("Inside student services");
       return studentResp;
    }
}
