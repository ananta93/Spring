package in.co.sdrc.service;

import in.co.sdrc.domain.StudentDetails;
import in.co.sdrc.repository.StudentDetailsDao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentDetailsDao studentDetailsDao;

	public Collection<StudentDetails> getAllStudents(){
		return studentDetailsDao.getAllStudents();
	}
	
	public StudentDetails getStudentById(int id){
		return studentDetailsDao.getStudentById(id);
	}

	public void removeUserById(int id) {
		studentDetailsDao.deleteStudentById(id);
	}
	
	public void updateStudent(StudentDetails studentDetails){
		this.studentDetailsDao.updateStudentById(studentDetails);
	}

	public void insertStudent(StudentDetails studentDetails) {
		this.studentDetailsDao.insertStudentDetails(studentDetails);		
	}
}
