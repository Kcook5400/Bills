package bills.beans;

import java.time.LocalDate;

import javax.persistence.Embeddable;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Oct 14, 2021
 */
@Embeddable
public class BillingInfo {
	
	String name;
	Double amount;
	LocalDate dueDate;
	/**
	 * 
	 */
	public BillingInfo() {
		super();
	}
	/**
	 * @param name
	 * @param amount
	 * @param dueDate
	 */
	public BillingInfo(String name, Double amount, LocalDate dueDate) {
		super();
		this.name = name;
		this.amount = amount;
		this.dueDate = dueDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	@Override
	public String toString() {
		return "BillingInfo [name=" + name + ", amount=" + amount + ", dueDate=" + dueDate + "]";
	}
	

	
}