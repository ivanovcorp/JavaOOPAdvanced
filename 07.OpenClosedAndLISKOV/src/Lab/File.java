package Lab;

public class File extends BaseStream {

	private String name;
	
    public File(int length, int byteSent, String name) {
		super(length, byteSent);
		this.name = name;
	}
}
