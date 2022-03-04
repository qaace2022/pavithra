package qaace22training;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cardspojo {
	
	int cardNum;
	int pin;
	int balance;
	@JsonProperty("active")
	boolean active;
	
	
	
	
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
