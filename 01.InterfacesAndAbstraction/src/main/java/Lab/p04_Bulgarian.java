package Lab;

public class p04_Bulgarian extends p04_BasePerson {

	public p04_Bulgarian(String name) {
		super(name);		
	}	
	
	@Override
	public void sayHello() {
		System.out.println("Zdravei");
	}
}
