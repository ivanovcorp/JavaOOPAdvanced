package Logger;

public class SimpleLayout implements Layout {

	@Override
	public String getLayout(String date, String level, String message) {		
		return String.format("%s - %s - %s", date, level, message);
	}
	
	

}
