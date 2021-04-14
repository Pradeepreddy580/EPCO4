package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student s) {
		
		repo.save(s);
		return "insert_success";
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(Student s) {
		
		repo.save(s);
		return "update_success";
	}
	
	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("sno") int sno) {
		
		repo.deleteById(sno);
		return "delete_success";
	}
	
	@RequestMapping("/viewStudent")
	public ModelAndView viewStudent(@RequestParam("sno") int sno) {
		
		Optional<Student> s = repo.findById(sno);
		
		Student stu = s.get();
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("view_student");
		mv.addObject("stu",stu);
		
		return mv;
	}
}
