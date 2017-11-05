package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p03_GenericCountMethodString {

	public static<T extends Comparable<T>> Integer compareList(List<T> list, T element) {
		
		int result = 0;
		
		for (T el : list) {
			if (el.compareTo(element) > 0) {
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		Collections.addAll(nums, 1, 5, 3, 6, 1, 7);
		System.out.println("Elements in the list bigger than the selected: " + p03_GenericCountMethodString.compareList(nums, 4));
		
		List<String> strings = new ArrayList<>();
		Collections.addAll(strings, "aa", "aaa", "bb");
		System.out.println("Elements in the list bigger than the selected: " + p03_GenericCountMethodString.compareList(strings, "aa"));
		
		List<Double> doubles = new ArrayList<>();
		Collections.addAll(doubles, 7.13, 123.22, 42.78);
		System.out.println("Elements in the list bigger than the selected: " + p03_GenericCountMethodString.compareList(doubles, 7.55));
		
	}
}
