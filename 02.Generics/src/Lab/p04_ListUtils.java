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
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		Collections.addAll(nums, 1, 57, 2, 33, 5, 15);
		
		System.out.println("Max: " + p04_ListUtils.getMax(nums));
		System.out.println("Min: " + p04_ListUtils.getMin(nums));
		
		List<Integer> empty = new ArrayList<>();
		System.out.println("Empty: " + p04_ListUtils.getMax(empty));
	}
}
