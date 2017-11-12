package Logger;

public interface Layout {

	String getLayout(String date, String level, String message);
}
