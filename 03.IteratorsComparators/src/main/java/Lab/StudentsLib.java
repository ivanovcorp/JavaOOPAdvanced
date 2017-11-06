package Lab;

import java.util.Iterator;

public class StudentsLib<Student> implements Iterable<Student> {
	private Student[] students;
	
	public StudentsLib(Student... students) {
		this.students = students;
	}

	@Override
	public Iterator<Student> iterator() {		
		return new StudentIterator();
	}
	
	private final class StudentIterator implements Iterator<Student> {
		private int index;
		
		public StudentIterator() {
			this.index = 0;
		}
		
		@Override
		public boolean hasNext() {
			return this.index < students.length;
		}

		@Override
		public Student next() {
			return students[index++];
		}
		
	}
	
	
	
	
}
