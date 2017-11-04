package Lab;

import java.util.ArrayList;
import java.util.List;

public class p03_SayHi {

	public static void main(String[] args) {
		
		List<p03_Person> persons = new ArrayList<>();
		
		persons.add(new p03_Bulgarian("Pesho"));
		persons.add(new p03_European("Huan"));
		persons.add(new p03_Chinese("Jung Jang"));
		
		persons.stream().forEach(p -> print(p)	);
	}
	
	private static void print(p03_Person person) {
		person.sayHello();
	}

}
