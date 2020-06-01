package tut11.exercise2;

import java.lang.instrument.IllegalClassFormatException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IllegalClassFormatException{
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			String author = sc.nextLine();
			String title = sc.nextLine();
			double price = sc.nextDouble();
			
			Book book = new Book(title, author, price);
			GoldenEditionBook gbook = new GoldenEditionBook(title, author, price);
			if(GoldenEditionBook.class.getDeclaredMethods().length>1)throw new IllegalClassFormatException("code duplication in Golden Edition Book");
			System.out.println(book.toString());
			System.out.println(gbook.toString());
		}catch(IllegalArgumentException error) {
			error.printStackTrace();
		}
	}

}
