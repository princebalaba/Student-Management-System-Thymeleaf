package com.princeCODEZ.sms.serviceImpl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.princeCODEZ.sms.entity.Student;
import com.princeCODEZ.sms.repository.StudentRepo;
import com.princeCODEZ.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	//Constructor Dependency Injection
	private StudentRepo studentRepo;
	
	//Constructor Dependency Injection
	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		
		return studentRepo.findById(id).get();
	}


	@Override
	public Student upadteStudent(Student student) {
		
		return studentRepo.save(student);
	}



	@Override
	public void deleteStudentsById(Long id) {
		
		studentRepo.deleteById(id);
		
		
	}

}
