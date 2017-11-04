package Lab;

public class p03_European implements p03_Person {

	private String name;
	
	public p03_European(String name) {
		this.setName(name);
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	

}
