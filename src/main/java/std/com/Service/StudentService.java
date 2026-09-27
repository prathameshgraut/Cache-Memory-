package std.com.Service;

import std.com.Entity.Student;

public interface StudentService {
	
	void SaveStudent(Student std);
	
	Student getStudent(Integer id);

}
