package std.com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import std.com.Entity.Student;
import std.com.Repo.StudentRepo;
import std.com.Studentcache.StdCache;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	StudentRepo stdRepo;
	
	
	@Autowired
	StdCache stdcache;

	public ServiceImpl(StudentRepo stdRepo) {
		this.stdRepo = stdRepo;
	}

	@Override
	public void SaveStudent(Student std) {
		stdRepo.save(std);

	}

	@Override
	public Student getStudent(Integer id) {
		if(stdcache.checkdata(id)) {
			System.out.println("From Cache");
			return stdcache.getData(id);
		}
		Student Std= stdRepo.findById(id).get();
		stdcache.StoreData(Std);
		System.out.println("From DataBase");
		return Std;
	}

}
