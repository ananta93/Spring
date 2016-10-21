package in.co.sdrc.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.co.sdrc.domain.StudentDetails;
import in.co.sdrc.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<StudentDetails> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.POST)
	public StudentDetails getStudentById(@PathVariable("id") int id){
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") int id){
		studentService.removeUserById(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody StudentDetails studentDetails){
		studentService.updateStudent(studentDetails);
	}
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody StudentDetails studentDetails){
		studentService.insertStudent(studentDetails);
	}
}
