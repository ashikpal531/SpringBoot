package springbootrestmariadbexample.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootrestmariadbexample.student.model.Student;
//import springbootrestmariadbexample.student.DAO.StudentDAO;
import springbootrestmariadbexample.student.service.StudentServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	
//	@Autowired
//	StudentDAO studentDAO;
	
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
    @PostMapping("/add_students")
    public Student createStudent(@RequestBody Student student) {
    System.out.println("Program Running");
          return studentServiceImpl.createStudent(student);
//        return studentRepository.save(student);
    }
    
	@GetMapping("/show_students")
	public List < Student > getAllStudents() {
		return studentServiceImpl.getAllStudents();
//		return studentRepository.findAll();
	}

}
