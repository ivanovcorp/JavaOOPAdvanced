package Lab;

public class p03_Bulgarian implements p03_Person {

	private String name;
	
	public p03_Bulgarian(String name) {
		this.setName(name);
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void sayHello() {
		System.out.println("Zdravei");
	}

}
