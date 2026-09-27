package std.com.Studentcache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import std.com.Entity.Student;
import std.com.Repo.StudentRepo;

@Component
public class StdCache {
	
	@Autowired
	StudentRepo stdRepo;
	
	Map<Integer,Student> m = new HashMap();
	
	public void StoreData(Student std) {
		m.put(std.getId(), std);
	}
	
	
	//Start Application then Call This Method
	@PostConstruct
	public void loadData() {
		List<Student> StdList= stdRepo.findAll();
		System.out.println(StdList);
		for(Student std:StdList) {
			m.put(std.getId(), std);
		}
		
		
	}
	
	
	public Student getData(int id) {
		return m.get(id);
	}
	
	public boolean checkdata(int id) {
		return m.containsKey(id);
	}

}
