package Entity;

public class Product implements Comparable<Product> {
	private String name;
	private int id;
	private String category;
	private String Brand;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(String name, int id, String category, String brand, int price) {
		super();
		this.name = name;
		this.id = id;
		this.category = category;
		this.Brand = brand;
		this.price = price;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.price-o.price;
	}
	

}
