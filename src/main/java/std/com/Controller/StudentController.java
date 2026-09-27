package std.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import std.com.Entity.Student;
import std.com.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService stdService;
	
	
	@PostMapping("/add")
	public String SaveStd(@RequestBody Student std) {
		stdService.SaveStudent(std);
		return "Added Record Successfully....";
	}
	
	@GetMapping("/get/{id}")
	public Student getStd(@PathVariable int id) {
		return stdService.getStudent(id);
	}

}
