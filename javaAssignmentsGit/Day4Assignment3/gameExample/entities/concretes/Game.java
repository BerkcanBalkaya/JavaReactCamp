package gameExample.entities.concretes;

public class Game {
	int id;
	String title;
	float price;
	
	public Game(int id, String title, float price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
