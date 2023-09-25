package in.kiran.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.kiran.entity.CitezenPlan;
import in.kiran.repository.CitezenPlanRepo;

@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired
	private CitezenPlanRepo repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		repo.deleteAll();
		
		CitezenPlan p1 =
				new CitezenPlan("mohit", "mohit@gmail.com", 5487659845L, 456312L,"Male", "Cash", "Aproved", LocalDate.now(), LocalDate.now().plusMonths(6));
		
		CitezenPlan p2 =
				new CitezenPlan("jamunda", "jamunda@gmail.com", 5487659846L, 456313L,"Male", "Cash", "Denied", null, null);
		
		CitezenPlan p3 =
				new CitezenPlan("naru", "naru@gmail.com", 5487659845L, 456312L,"Fe-Male", "Food", "Aproved", LocalDate.now(), LocalDate.now().plusMonths(6));
		
		CitezenPlan p4 =
				new CitezenPlan("munda", "munda@gmail.com", 5487659846L, 456313L,"Male", "Food", "Denied", null, null);
		
		CitezenPlan p5 =
				new CitezenPlan("kanta", "kanta@gmail.com", 5487659845L, 456312L,"Fe-Male", "Medical", "Aproved", LocalDate.now(), LocalDate.now().plusMonths(6));
		
		CitezenPlan p6 =
				new CitezenPlan("ravan", "ravan@gmail.com", 5487659846L, 456313L,"Male", "Medical", "Denied", null, null);
		
		List<CitezenPlan> records= Arrays.asList(p1,p2,p3,p4,p5,p6);
		repo.saveAll(records);
	}

}
