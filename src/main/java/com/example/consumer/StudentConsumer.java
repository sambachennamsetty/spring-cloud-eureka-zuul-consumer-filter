package com.example.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.StudentProviderFeign;
import com.example.model.Student;

@RestController
@RequestMapping("/student-consumer")
public class StudentConsumer {

	@Autowired
	StudentProviderFeign studentProviderFeign;

	@GetMapping("/get")
	public String getData() {
		return studentProviderFeign.getData();
	}

	@GetMapping("/data")
	public Student getObj() {
		return studentProviderFeign.getStudent();
	}

	@GetMapping("/bulk")
	public List<Student> getBullk() {
		return studentProviderFeign.getBulk();
	}
}