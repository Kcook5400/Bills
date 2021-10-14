package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Oct 14, 2021
 */
public class Contact {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String phone;
	private String relationship;
	@Autowired
	Address address = new Address();
	
	/**
	 * 
	 */
	public Contact() {
		super();
		this.relationship = "spouse";
	}
	public Contact (String name) {
		this.name=name;
	}
	/**
	 * @param name
	 * @param phone
	 * @param relationship
	 */
	public Contact(String name, String phone, String relationship) {
		super();
		this.name = name;
		this.phone = phone;
		this.relationship = relationship;
	}
	/**
	 * @param id
	 * @param name
	 * @param phone
	 * @param relationship
	 */
	public Contact(long id, String name, String phone, String relationship) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.relationship = relationship;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", relationship=" + relationship
				+ ", address=" + address + "]";
	}
	

	
	

}
