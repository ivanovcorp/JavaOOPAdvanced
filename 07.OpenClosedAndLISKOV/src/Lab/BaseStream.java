package Lab;

public abstract class BaseStream implements Streamable {
	
	private int length;
	private int byteSent;
	
	public BaseStream(int length, int byteSent) {
		this.length = length;
		this.byteSent = byteSent;
	}
	
	@Override
	public int getBytesSent() {
		return this.byteSent;
	}
	
	@Override
	public int getLength() {		
		return this.length;
	}
}
