package Dsa;

public class Book implements Comparable{
	String name;
	double price;
	String author;
	public Book(String name, double price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	public int compareTo(Object o) {
		Book book =(Book)o;
		return this.name.compareTo(book.name)	;	
	}

}
