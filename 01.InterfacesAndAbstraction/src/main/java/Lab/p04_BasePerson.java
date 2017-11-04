package Lab;

public abstract class p04_BasePerson implements p04_Person {
	private String name;
	
	protected p04_BasePerson(String name) {
		
	}	
	
	private void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	
}
