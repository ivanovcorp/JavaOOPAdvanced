package Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class p01_Jar<E> {
	
	private Deque<E> contents;
	
	public p01_Jar() {
		this.contents = new ArrayDeque<>();
	}
	
	public void add(E element) {
		this.contents.addLast(element);
	}
	
	public E remove() {
		
		return this.contents.pop();
	}
	
	public static void main(String[] args) {
		p01_Jar<String> jar = new p01_Jar<>();
		jar.add("Ivan");
		jar.add("Pesho");
		jar.add("Gosho");

	}
}
