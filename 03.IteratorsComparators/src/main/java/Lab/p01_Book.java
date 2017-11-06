package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class p01_Book implements Comparable<p01_Book> {

    private String title;
    private int year;
    private List<String> authors;

    public p01_Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }
    private void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    private void setAuthors(String... authors) {
        this.authors = Arrays.asList(authors);
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    @Override
	public int compareTo(p01_Book b) {
		if (this.getTitle().compareTo(b.getTitle()) == 0) {
		  /*if (this.getYear() > b.getYear())
				return 1;
			else if (this.getYear() < b.getYear())
				return -1;
			else
				return 0;*/
			return this.getYear() - b.getYear();
		}
		return this.getTitle().compareTo(b.getTitle());
	}
    
    public static void main(String[] args) {
        p01_Book bookOne = new p01_Book("Animal Farm", 2003, "George Orwell");
        p01_Book bookTwo = new p01_Book("The Chosen One", 2001);
        p01_Book bookThree = new p01_Book("The Boss", 2016, "Ivan Petrov", "Geno Daskalov");

        List<p01_Book> books = new ArrayList<p01_Book>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
                
        
        if (bookOne.compareTo(bookTwo) > 0) {
        	System.out.println(String.format("%s is before %s", bookOne.getTitle(), bookTwo.getTitle()));
        } else if (bookOne.compareTo(bookTwo) < 0) {
        	System.out.println(String.format("%s is before %s", bookTwo.getTitle(), bookOne.getTitle()));
        } else {
        	System.out.println("Books are equal.");
        }
    }
	
}