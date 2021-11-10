package vezbe3;

public class Book {
	
	private String name;
	private String author;
	private int numberOfPages;
	private double price;
	
	public Book() {
	}
	
	public Book(String name, String author, int numberOfPages, double price) {
		this.name = name;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		if(numberOfPages > 0) {
			this.numberOfPages = numberOfPages;
		}
		else {
			System.out.println("Nije moguce uneti ovu vrednost.");
		}
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(double price) {
		if(price>0) {
			this.price=price;
		}
		else {
			System.out.println("Nije moguce uneti ovu vrednost.");
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	private double calculateDiscount(int percentage) {
		double discount = price * (percentage/100.00);
		return discount;
	}
	
	public double calculateDiscountPrice(int percentage) {
		double newPrice = price - calculateDiscount(percentage);
		return newPrice;
	}
	
}