package Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	private static int problemCount = 1;
    
	public static void main(String[] args) {
    	
		printProblemHeader("Extended list");
		ExtendedArrayList<Integer> nums = new ExtendedArrayList<>();
		Collections.addAll(nums, 1, 5, 7, 4, 12, 66, -1);
		System.out.println("Max: " + nums.max());
		System.out.println("Min: " + nums.min());
		
		
		
		printProblemHeader("Stream progress info");
		StreamProgressInfo info = new StreamProgressInfo(new File(254, 234, "Test.txt"));
		System.out.println("Current %: " + info.calculateCurrentPercent());
		
		StreamProgressInfo infoFromWeb = new StreamProgressInfo(new Music(663, 238,
				"2Pac", "Mama Im a criminal"));
		System.out.println("Current %: " + infoFromWeb.calculateCurrentPercent());
		
		
		
		printProblemHeader("Graphic editor");
		Drawable circle = new Circle();
		Drawable rectangle = new Rectangle();
		Drawable shape = new Shape();
		Drawable square = new Square();
		
		List<Drawable> shapes = new ArrayList<>();
		Collections.addAll(shapes, circle, rectangle, shape, square);
		
		GraphicEditor editor = new GraphicEditor();
		shapes.stream().forEach(editor::drawShape);
		
		
		
		printProblemHeader("Detailed printer.");
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Pesho"));
		employees.add(new Employee("Ivan"));
		employees.add(new Manager("Gosho",  "Docs"));
		employees.add(new Worker("Petkan", 1	));
		DetailsPrinter printer = new DetailsPrinter(employees);
		printer.printDetails();
    }
	
	public static void printProblemHeader(String problemName) {
		
		System.out.printf("\nProblem %d: %s.\n", problemCount, problemName);
		problemCount++;
	}
}
