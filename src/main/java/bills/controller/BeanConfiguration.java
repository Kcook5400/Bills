package bills.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bills.beans.BillingInfo;
import bills.beans.PayingInfo;
import java.time.LocalDate;

@Configuration
/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Oct 14, 2021
 */
public class BeanConfiguration {
	
	@Bean
	public PayingInfo payer() {
		PayingInfo bean = new PayingInfo("Kristi");
		return bean;
	}
	
	@Bean
	public BillingInfo bill() {
		BillingInfo bean = new BillingInfo("Cell Phone", 145.08, LocalDate.now());
				return bean;
		
	}
	/**
	 * 
	 */
	
	
	
	
	public BeanConfiguration() {
		// TODO Auto-generated constructor stub
	}

}
