package Lab;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }
    
    @Override
    public String toString() {
    	return this.getName();
    }
}
