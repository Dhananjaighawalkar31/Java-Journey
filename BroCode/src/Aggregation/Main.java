package Aggregation;

public class Main {

	public static void main(String[] args) {
		Book book1 = new Book(" Winds of winter" , 432);
		Book book2 = new Book(" rings of fire" , 322);
		Book book3 = new Book(" Song of ice and fire" , 543);
		
		Book[] books = {book1, book2, book3};
		
		Library library = new Library("swami vivekananda", 1892, books);
		library.displayInfo();   
	}

}
