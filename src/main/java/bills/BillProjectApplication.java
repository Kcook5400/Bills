package bills;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import bills.beans.BillingInfo;
import bills.beans.PayingInfo;
import bills.controller.BeanConfiguration;
import bills.repository.BillsRepository;

@SpringBootApplication
public class BillProjectApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(BillProjectApplication.class, args);
		
	ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		PayingInfo c = appContext.getBean("payer", PayingInfo.class);
		
		System.out.println(c.toString());
		
		
	}
	@Autowired
	BillsRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		PayingInfo c = appContext.getBean("payer", PayingInfo.class);
		c.setPaidDate(LocalDate.now());;
		repo.save(c);
		
		PayingInfo d = new PayingInfo("Kevin",LocalDate.now());
		BillingInfo a = new BillingInfo("Water", 98.00, LocalDate.now());
		d.setBill(a);
		repo.save(d);
		
		List<PayingInfo> allMyBills = repo.findAll();
		for(PayingInfo bills: allMyBills) {
			System.out.println(bills.toString());
		}
		((AbstractApplicationContext) appContext).close();
	
	}

}
