package Logger;

public class PimLayout implements Layout {

	@Override
	public String getLayout(String date, String level, String message) {		
		return String.format("[%s]<->[%s]<->[%s]", level, date, message);
	}

}
