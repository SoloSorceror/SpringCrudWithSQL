package in.strikes.crudSpringDemo.repository;

import in.strikes.crudSpringDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository  {
    public Student saveStudent(Student studReq){
        System.out.println("Inside student repository");
        return null;
    }
}
