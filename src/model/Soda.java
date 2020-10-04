package model;

import java.io.Serializable;

public class Soda  implements Serializable{
	private String price;

	public Soda(String price) {
		this.price = price;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Soda [price=" + price + "]";
	}

}
