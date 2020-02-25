package com.infy.mapping.student.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.mapping.student.bean.StudentBean;
import com.infy.mapping.student.repository.StudentRepository;

@RestController
public class StudentController {

	private static final Logger logger = Logger.getLogger(StudentController.class);
	@Autowired
	private StudentRepository studentRepository;

	@PostMapping(value = "/createStudent")
	public StudentBean createStudentData(@RequestBody StudentBean student) {
		logger.info("createStudentData method entered...." + logger.getClass());
		return studentRepository.save(student);
	}
	@GetMapping(value = "/getStudentDetails")
	public Iterable<StudentBean> getStudentDetails(@RequestBody StudentBean student) {
		logger.info("getStudentDetails method entered...." + logger.getClass());
		return studentRepository.findAll();
	}
	
	
	@GetMapping(value = "/getStudentDetails")
	public Iterable<StudentBean> getStudentByName(@RequestParam("name") String name) {
		logger.info("getStudentByName method entered...." + logger.getClass());
		return studentRepository.findByName(name);
	}
	
	
}
