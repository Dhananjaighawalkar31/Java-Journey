package Aggregation;

public class Library {
	String name;
	int year;
	Book[] books;
	
	Library(String name,int year,Book[] books){
		this.name = name;
		this.year = year;
		this.books = books;
		
	}
	
	void displayInfo() {
		System.out.println("the " + this.year + " " + this.name);
		System.out.println("books available: ");
		for(Book book : books) {
			System.out.println(book.displayInfo());
		}
	}
	
	
	}
