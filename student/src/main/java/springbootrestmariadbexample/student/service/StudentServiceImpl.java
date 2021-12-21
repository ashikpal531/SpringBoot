package springbootrestmariadbexample.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import springbootrestmariadbexample.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	private List<Student> studentList;
	
	@Override
	public List<Student> getAllStudents(){
		if(studentList.isEmpty()) {
			return null;
		}
		else {
			return studentList;
		}
	}
	
	@Override
	public Student createStudent(Student student) {
		studentList.add(student);
		return student;
	}
	
}
