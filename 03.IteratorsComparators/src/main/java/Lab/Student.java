package Lab;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private double grade;
	
	public Student(String name, int age, double grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getGrade() {
		return grade;
	}

	@Override
	public int compareTo(Student st) {
		return this.getAge() - st.getAge();
	}
}
