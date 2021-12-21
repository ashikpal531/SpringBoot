package springbootrestmariadbexample.student.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootrestmariadbexample.student.model.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student,Long> {

}
