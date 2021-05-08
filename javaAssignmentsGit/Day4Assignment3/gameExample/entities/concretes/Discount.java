package gameExample.entities.concretes;

public class Discount {
	int id;
	String title;
	float discountedPrice;

	public Discount(int id, String title, float discountedPrice) {
		super();
		this.id = id;
		this.title = title;
		this.discountedPrice = discountedPrice;
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

	public float getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(float discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
}
