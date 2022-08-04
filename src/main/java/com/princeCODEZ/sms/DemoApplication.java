package com.princeCODEZ.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.princeCODEZ.sms.entity.Student;
import com.princeCODEZ.sms.repository.StudentRepo;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableWebMvc
//@EnableSwagger2

public class DemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/*@Autowired
	private StudentRepo studentRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		 * Student student1 = new Student(null, "Prince", "Edris", "p@gmail.com");
		 * studentRepo.save(student1);
		 * 
		 * Student student2 = new Student(null, "Autty", "Switzer", "a@gmail.com");
		 * studentRepo.save(student2);
		 * 
		 * Student student3 = new Student(null, "Maryam", "Bakojja", "m@gmail.com");
		 * studentRepo.save(student3);
		 */
		
	}


