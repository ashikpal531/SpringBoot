package springbootrestmariadbexample.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name= "students" )
public class Student {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	
	private String name;
	private String emailId;
	private String courseName;
	
	public Student() {

	}
	
	public Student(String name, String emailId, String courseName) {
		this.name = name;
		this.emailId = emailId;
		this.courseName = courseName;
	}
	
	
	
	@Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }


    @Column(name = "course_name", nullable = false)
    public String getCourseName() {
        return courseName;
    }

    @Column(name = "email_address", nullable = false)
    public String getEmailId() {
        return emailId;
    }
		
}