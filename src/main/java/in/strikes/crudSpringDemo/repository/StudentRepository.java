package in.strikes.crudSpringDemo.repository;

import in.strikes.crudSpringDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

// @Component
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
