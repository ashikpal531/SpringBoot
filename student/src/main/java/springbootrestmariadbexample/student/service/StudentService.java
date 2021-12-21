package springbootrestmariadbexample.student.service;

import java.util.List;

import springbootrestmariadbexample.student.model.Student;

public interface StudentService {
	List < Student > getAllStudents();
	Student createStudent(Student student);
}
