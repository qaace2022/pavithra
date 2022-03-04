package qaace22training;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bankpojo {
	
	private Adminpojon admin;
	private String bankName;
	private List<Customerspojo> customers;
	
	public Adminpojon getAdmin() {
		return admin;
	}
	public void setAdmin(Adminpojon admin) {
		this.admin = admin;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public List<Customerspojo> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customerspojo> customers) {
		this.customers = customers;
	}

}
