package tut11.exercise2;

public class GoldenEditionBook extends Book {

	public GoldenEditionBook() {
		// TODO Auto-generated constructor stub
	}

	public GoldenEditionBook(String title, String author, double price) {
		super(title, author, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()*1.3;
	}
}
