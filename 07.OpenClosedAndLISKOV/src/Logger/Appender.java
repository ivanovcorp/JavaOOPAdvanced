package Logger;

public interface Appender {

	void appendLog(String date, String level, String message);
	
	void setReportLevel(ReportLevel level);
}
