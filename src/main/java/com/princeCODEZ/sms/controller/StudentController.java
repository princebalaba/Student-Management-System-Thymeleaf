package com.princeCODEZ.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.princeCODEZ.sms.entity.Student;
import com.princeCODEZ.sms.service.StudentService;

@Controller //making this class a spring MVC controller 
@RequestMapping()
public class StudentController {
	
	//Constructor DI
	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//Handler method to hand List of Students & Return Model and View
	@GetMapping("/students")
	public String StudentsList(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";		
		
	}
	
	@GetMapping("/students/new")
	public String CreateStudentForm(Model model) {
		//create a student Obj to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
		
	}
	
	// handler method to handle update student 
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute ("student") Student student, Model model) {
		
		// get Student from DB by Id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		//save updated student obj
		studentService.upadteStudent(existingStudent);
		return "redirect:/students";
		
	}
	// handler method to handle Delete student 
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentsById(id);
		return "redirect:/students";
	}
}
