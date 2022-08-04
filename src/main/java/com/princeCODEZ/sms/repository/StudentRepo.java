package com.princeCODEZ.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.princeCODEZ.sms.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
