package Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p04_ListUtils {

	public static<T extends Comparable<T>> T getMax(List<T> list) {
		
		if (list.isEmpty())
			throw new IllegalArgumentException("List must not be empty");
		
		T max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (max.compareTo(list.get(i)) < 0)
				max = list.get(i);
		}
		
		return max;
	}
	
	public static<T extends Comparable<T>> T getMin(List<T> list) {
		
		if (list.isEmpty())
			throw new IllegalArgumentException("List must not be empty");
		
		T min = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (min.compareTo(list.get(i)) > 0)
				min = list.get(i);
		}
		
		return min;
	}
	
	public static  List<Integer> getNullIndicies(List<?> list) {
		List<Integer> nulls = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == null) {
				nulls.add(i);
			}
		}
		
		return nulls;
	}
	
	public static <T> void addAll(List<? super T> dest, List<? extends T> source) {
		for (T elem : source) {
			dest.add(elem);
		}
	}
	
	public static void readAll(List<? extends Number> list) {
		for (Number num : list) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		Collections.addAll(nums, 1, 57, 2, 33, 5, 15);
		
		System.out.println("Max: " + p04_ListUtils.getMax(nums));
		System.out.println("Min: " + p04_ListUtils.getMin(nums));
		
		List<Integer> ints = new ArrayList<>();
		Collections.addAll(ints, 1, 2, null, 21, 12, null);
		
		readAll(ints);
		
		List<Double> doubles = new ArrayList<>();
		Collections.addAll(doubles, 1.0, 2.6, null, 21.344, 12.4, null);
		
		readAll(doubles);
		
		/* Throws exception
		 * 
		 * List<Integer> empty = new ArrayList<>();
		 * System.out.println("Empty: " + p04_ListUtils.getMax(empty));
		*/
	}
}
