package Lab;

public interface p04_Person {
	String getName();
	
	default void sayHello() {
		System.out.println("Hello");
	}
}
