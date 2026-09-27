package std.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StudentCacheeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCacheeApplication.class, args);
	}

}
