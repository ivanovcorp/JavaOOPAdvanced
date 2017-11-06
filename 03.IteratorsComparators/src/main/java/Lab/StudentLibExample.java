package Lab;

public class StudentLibExample {
	public static void main(String[] args) {
		Student st1 = new Student("Ivan", 22, 6.00);
		Student st2 = new Student("Asan", 20, 4.12);
		Student st3 = new Student("Mehmed", 18, 2.33);
		
		StudentsLib<Student> students = new StudentsLib<>(st1, st2, st3);
		for (Student st : students) {
			System.out.printf("Name: %s; Age: %d; Grade: %.2f \n", st.getName(), st.getAge(), st.getGrade());
		}
	}
}
