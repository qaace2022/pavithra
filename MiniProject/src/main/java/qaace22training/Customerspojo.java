package qaace22training;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customerspojo {

	String name;
	Object id;
	List<Cardspojo> cards;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<Cardspojo> getCards() {
		return cards;
	}
	public void setCards(List<Cardspojo> cards) {
		this.cards = cards;
	}	

	public Object getId() {
		return id;
	}
	public void setId(Object id) {
		this.id = id;
	}
}
