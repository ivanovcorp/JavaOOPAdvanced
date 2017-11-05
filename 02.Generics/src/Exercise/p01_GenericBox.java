package Exercise;

public class p01_GenericBox<T> {

	private T element;
	
	public p01_GenericBox(T elem) {
		this.element = elem;		
	}
	
	@Override
	public String toString() {		
		return String.format("%s: %s", this.element.getClass(), this.element);
	}
	
	public static void main(String[] args) {
		String input1 = "life in a box";
		String input2 = "box in a life";
		
		p01_GenericBox<String> box1 = new p01_GenericBox<String>(input1);
		p01_GenericBox<String> box2 = new p01_GenericBox<String>(input2);
		p01_GenericBox<Integer> box3 = new p01_GenericBox<Integer>(332);
		
		p01_GenericBox.printMessage(box1);
		p01_GenericBox.printMessage(box2);
		p01_GenericBox.printMessage(box3);
				
	}
	
	public static<M> void printMessage(M message) {
		System.out.println(message);
	}
}
