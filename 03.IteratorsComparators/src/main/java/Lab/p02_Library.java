package Lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class p02_Library<p01_BookP> implements Iterable<p01_Book> {
	
	private p01_Book[] books;		
	
	public p02_Library(p01_Book... books) {
		this.books = books;
	}

	@Override
	public Iterator<p01_Book> iterator() {		
		return new LibIterator();
	}	
	
	
	
	private final class LibIterator implements Iterator<p01_Book> {

		private int index;
		
		public LibIterator() {
			this.index = 0;
		}
		
		@Override
		public boolean hasNext() {
			
			return this.index < books.length;
		}

		@Override
		public p01_Book next() {			
			return books[this.index++];
		}
		
	}
	
	public static void main(String[] args) {
		p01_Book bookOne = new p01_Book("Animal Farm", 2003, "George Orwell");
        p01_Book bookTwo = new p01_Book("The Chosen One", 2001);
        p01_Book bookThree = new p01_Book("The Boss", 2016, "Ivan Petrov", "Geno Daskalov");

        List<p01_Book> books = new ArrayList<p01_Book>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        
        for(p01_Book b : books) {
        	System.out.println(b.getTitle());
        }
                
	}
}
