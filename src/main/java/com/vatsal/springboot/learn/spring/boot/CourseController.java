package com.vatsal.springboot.learn.spring.boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"learn spring","Vatsal"),
				new Course(2,"learn spring-boot","Vatsal"),
				new Course(3,"learn spring-boot-web","Vatsal")
				);
	}
}
