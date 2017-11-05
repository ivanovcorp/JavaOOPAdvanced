package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p02_GenericSwapMethodString {

	public static <T> List<T> swapElements(List<T> list, int index1, int index2) {		
		Collections.swap(list, index1, index2);
		
		return list;
	}
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "Pesho", "Gosho", "Ivan");
		
		p02_GenericSwapMethodString.swapElements(list, 0, 2);
		
		p02_GenericSwapMethodString.printMessage(list);
		
		List<Integer> list1 = new ArrayList<>();
		Collections.addAll(list1, 5, 1, 6);
		
		p02_GenericSwapMethodString.swapElements(list1, 0, 2);
		
		p02_GenericSwapMethodString.printMessage(list1);
	}
	
	public static<T> void printMessage(List<T> list) {
		list.stream().forEach(x -> System.out.printf("%s: %s\n", x.getClass(), x));
	}

}
