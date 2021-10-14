package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.Contact;

@Configuration
/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Oct 14, 2021
 */
public class BeanConfiguration {
	
	@Bean
	public Contact contact() {
		Contact bean = new Contact("Eric Carle");
		//bean.setName("Dr. Seuss");
		//bean.setPhone("555-555-0123");
		//bean.setRelationship("friend");
		return bean;
	}
	
	@Bean
	public Address adress() {
		Address bean = new Address("123 main Street", "Des Moines","IA");
				return bean;
		
	}
	/**
	 * 
	 */
	
	
	
	
	public BeanConfiguration() {
		// TODO Auto-generated constructor stub
	}

}
