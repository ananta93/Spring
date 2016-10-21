package in.co.sdrc.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import in.co.sdrc.domain.StudentDetails;

@Repository
public class StudentDetailsDao{
	
	private static Map<Integer, StudentDetails> students;
	
	static{
		students=new HashMap<Integer, StudentDetails>(){
			{
				put(1, new StudentDetails(1, "ananta", "CSE"));
				put(2, new StudentDetails(2, "amit", "IT"));
				put(3, new StudentDetails(3, "abhisek", "MCA"));
			}
		};
	}
	
	public Collection<StudentDetails> getAllStudents(){
		return this.students.values();
	}
	
	public StudentDetails getStudentById(int id){
		return students.get(id);
	}

	public void deleteStudentById(int id) {
		students.remove(id);
	}
	
	public void updateStudentById(StudentDetails studentDetails){
		StudentDetails details=students.get(studentDetails.getRoll());
		details.setName(studentDetails.getName());
		details.setCourse(studentDetails.getCourse());
		students.put(studentDetails.getRoll(),details);
	}

	public void insertStudentDetails(StudentDetails studentDetails) {
		this.students.put(studentDetails.getRoll(), studentDetails);
	}
}
