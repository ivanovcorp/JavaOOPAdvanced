package Lab;

import java.lang.reflect.Array;

public class p02_ArrayCreator {
	
	@SuppressWarnings(value = { "unchecked" })
	public static<T> T[] create(int lenght, T item) {
	
		T[] array = (T[]) new Object[lenght];
		for (int i = 0; i < lenght; i++) {
			array[i] = item;
		}
		
		return array;
	}
	
	@SuppressWarnings(value = { "unchecked" })
	public static<T> T[] create(Class<T> cl, int lenght, T item) {
	
		T[] array = (T[]) Array.newInstance(cl, lenght);
		for (int i = 0; i < lenght; i++) {
			array[i] = item;
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		Object[] integers = p02_ArrayCreator.create(5, 1);
		System.out.println(integers.length);
		
		Integer[] nums = p02_ArrayCreator.create(Integer.class, 5, 1);
		System.out.println(nums.length);
	}
}
