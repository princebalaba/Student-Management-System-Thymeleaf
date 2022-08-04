package com.princeCODEZ.sms.service;

import java.util.List;

import com.princeCODEZ.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student upadteStudent(Student student);
	
	void deleteStudentsById(Long id);
	
	

}
