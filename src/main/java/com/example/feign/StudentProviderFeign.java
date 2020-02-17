package com.example.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Student;

@FeignClient(name = "STUDENT-PROVIDER")
public interface StudentProviderFeign {

	@GetMapping("/student-provider/get")
	public String getData();

	@GetMapping("/student-provider/data")
	public Student getStudent();

	@GetMapping("/student-provider/list")
	public List<Student> getBulk();
}
