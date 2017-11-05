package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p04_CustomList<T extends Comparable<T>> {
	private List<T> list;
	
	public p04_CustomList() {
		this.list = new ArrayList<>();
	}
	
	public void add(T item) {
		this.list.add(item);
	}
	
	public T remove(int index) {
		return this.list.remove(index);
	}
	
	public boolean contains(T element) {
		return this.list.contains(element);
	}
	
	public void swap(int indexOne, int indexTwo) {
		Collections.swap(this.list, indexOne, indexTwo);
	}
	
	public int countGreaterThat(T element) {
		int result = 0;
		
		for (T el : this.list) {
			if (el.compareTo(element) > 0) {
				result++;
			}
		}
		
		return result;
	}
	
	public T getMax() {
		T max = this.list.get(0);
		
		for (int i = 1; i < this.list.size(); i++) {
			if (this.list.get(i).compareTo(max) > 0) {
				max = this.list.get(i);
			}
		}
		
		return max;
	}
	
	public T getMin() {
		T min = this.list.get(0);
		
		for (int i = 1; i < this.list.size(); i++) {
			if (this.list.get(i).compareTo(min) < 0) {
				min = this.list.get(i);
			}
		}
		
		return min;
	}
	
	public Integer getSize() {
		return this.list.size();
	}
	
	public T elementAtIndex(int index) {
		return this.list.get(index);
	}
	
	public static void main(String[] args) {
		
		p04_CustomList<Integer> nums = new p04_CustomList<>();
		nums.add(12);
		nums.add(16);
		nums.add(42);
		nums.add(22);
		nums.add(1);
		System.out.println();
		System.out.println("Size is: " + nums.getSize());
		System.out.println("Remove element at position 2: " + nums.remove(1));
		System.out.println("Does contain 1? " + nums.contains(1));
		nums.swap(0, 3);
		System.out.println("Count of greaters than 23: " + nums.countGreaterThat(23));
		System.out.println("Max is: " + nums.getMax());
		System.out.println("Min is: " + nums.getMin());
		
		printer(nums);
		p04_CustomList sorted = sorter(nums);
		System.out.println();
		printer(sorted);
		
		System.out.println();
		
		p04_CustomList<String> strings = new p04_CustomList<>();
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");
		strings.add("e");
		System.out.println();
		System.out.println("Size is: " + strings.getSize());
		System.out.println("Remove element at position 2: " + strings.remove(1));
		System.out.println("Does contain 1? " + strings.contains("c"));
		strings.swap(0, 3);
		System.out.println("Count of greaters than 23: " + strings.countGreaterThat("d"));
		System.out.println("Max is: " + strings.getMax());
		System.out.println("Min is: " + strings.getMin());
	}
	
	public static void printer(p04_CustomList customList ) {
		for (int i = 0; i < customList.getSize(); i++) {
			System.out.print(customList.elementAtIndex(i) + " ");
		}
		
		System.out.println();
	}
	
	public static<T> p04_CustomList sorter(p04_CustomList customList) {
		for (int i = 0; i < customList.getSize() - 1; i++) {
			for (int j = i + 1; j < customList.getSize(); j++) {
				if (customList.elementAtIndex(i).compareTo(customList.elementAtIndex(j)) > 0) {
					customList.swap(i, j);
				}
			}
		}
		
		return customList;		
	}
}
