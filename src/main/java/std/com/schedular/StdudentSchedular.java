package std.com.schedular;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import std.com.Studentcache.StdCache;

@Component
public class StdudentSchedular {
	
	@Autowired
	StdCache stdcache;
	
	
	@Scheduled (fixedDelay = 2000 , initialDelay = 5000, timeUnit = TimeUnit.MILLISECONDS)
	public void Start() {
		stdcache.loadData();
	}

}
