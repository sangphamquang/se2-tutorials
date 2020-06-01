package tut11.exercise2;

public class Book {

	private String title;
	private String author;
	private double price;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws IllegalArgumentException {
		if(title.length()<3)throw new IllegalArgumentException("Title not valid");
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) throws IllegalArgumentException{
		String[] names = author.split(" ");
		if(names.length>1&&names[1].matches("^123\\d{9}$"))throw new IllegalArgumentException("author not valid");
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) throws IllegalArgumentException{
		if(price<=0)throw new IllegalArgumentException();
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
}
