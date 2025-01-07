package entities;

public class Product {
	private String name;
	private Double price;
	
	// Construtores
	
	public Product() {
		
	}
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// Get and se
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void noStaticPriceUpdate () {
		price = price * 1.1;
	}
	
	/* Reference method com método estático
	 * public static String staticUpperCaseName (Product p ) {
		return p.getName().toUpperCase();
	} */ 
	
	
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	// 
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
	}	
