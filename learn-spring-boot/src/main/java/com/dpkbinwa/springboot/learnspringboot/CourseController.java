package com.dpkbinwa.springboot.learnspringboot;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//courses
////coures:id,name, author
//[
// {
//	 "id":1,
//	 "name":"learn aws",
//	 "author":"dpk"
// }
//]

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"learn aws","dpk"),
				new Course(2,"learn mern","dpk"),
				new Course(3,"learn mean","dpk")
				);
	}
}
