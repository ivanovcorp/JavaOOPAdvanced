package Lab;

public interface p03_Person {

	String getName();
	
	default void sayHello() {
		System.out.println("Hello");
	}
}
