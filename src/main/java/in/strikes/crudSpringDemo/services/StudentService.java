package in.strikes.crudSpringDemo.services;

import in.strikes.crudSpringDemo.entity.Student;
import in.strikes.crudSpringDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
       Student studentResp = studentRepository.save(studentReq);
       return studentResp;
    }

    public Student getStudent(Long id){
        Optional<Student> studentResp = studentRepository.findById(id); // returns optional so use optional
        if(studentResp.isPresent()){
            return studentResp.get();
        }
        return null;
    }

    public List<Student> getAllStudent(){
        List<Student> studentList = studentRepository.findAll(); // returns optional so use optional
        return studentList;
    }

    public Student updateStudent(Long id, Student studentReq){
        Optional<Student> existingStudent = studentRepository.findById(id);
        if(existingStudent.isEmpty()){
            return null;
        }
        Student studentToSave = existingStudent.get();
        studentToSave.setName(studentReq.getName());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setSubject(studentReq.getSubject());
        studentToSave.setAge(studentReq.getAge());
        studentToSave.setEmail(studentReq.getEmail());

        return studentRepository.save(studentToSave);
    }

    public Boolean deleteStudent(Long id){
        Optional<Student> existingStudent = studentRepository.findById(id);
        if(existingStudent.isEmpty()){
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }

}
