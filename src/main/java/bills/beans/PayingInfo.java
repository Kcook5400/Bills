package bills.beans;

import java.time.LocalDate;

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
@Entity
public class PayingInfo {
	@Id
	@GeneratedValue
	private long id;
	private String payer;
	private LocalDate paidDate;;
	@Autowired
	BillingInfo bill = new BillingInfo();
	
	/**
	 * 
	 */
	public PayingInfo() {
		super();
	}

	/**
	 * @param id
	 * @param payer
	 * @param paidDate
	 * @param bill
	 */
	public PayingInfo(long id, String payer, LocalDate paidDate, BillingInfo bill) {
		super();
		this.id = id;
		this.payer = payer;
		this.paidDate = paidDate;
		this.bill = bill;
	}

	/**
	 * @param payer
	 * @param paidDate
	 * @param bill
	 */
	public PayingInfo(String payer, LocalDate paidDate, BillingInfo bill) {
		super();
		this.payer = payer;
		this.paidDate = paidDate;
		this.bill = bill;
	}
	
	

	/**
	 * @param payer
	 * @param paidDate
	 */
	public PayingInfo(String payer, LocalDate paidDate) {
		super();
		this.payer = payer;
		this.paidDate = paidDate;
	}

	/**
	 * @param payer
	 */
	public PayingInfo(String payer) {
		super();
		this.payer = payer;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public LocalDate getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDate paidDate) {
		this.paidDate = paidDate;
	}

	public BillingInfo getBill() {
		return bill;
	}

	public void setBill(BillingInfo bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "PayingInfo [id=" + id + ", payer=" + payer + ", paidDate=" + paidDate + ", bill=" + bill + "]";
	}
	
	

	
	

}
