package Logger;

public class SimpleLayout implements Layout {

	@Override
	public String getLayout(String... params) {		
		return String.format("", params[0], params[1]);
	}
	
	

}
