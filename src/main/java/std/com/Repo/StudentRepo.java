package std.com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import std.com.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
