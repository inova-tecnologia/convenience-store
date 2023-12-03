package convenienceStore;

public class Product {  
	private String name;
	private double price;
	private String barcode;
	private int stockQuantity;        
	
	public Product(String name, double price, String barcode, int stockQuantity) {
		this.name = name;
		this.price = price;
		this.barcode = barcode;
		this.stockQuantity = stockQuantity;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getBarcode() {
		return barcode;
	}
	
	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
}
