package Logger;

public class ConsoleAppender implements Appender {

	private Layout layout;
	private ReportLevel level;
	
	public ConsoleAppender(Layout layout) {
		this.layout = layout;
	}
	
	@Override
	public void appendLog(String date, String level, String message) {
		if (this.level.ordinal() <= ReportLevel.valueOf(level).ordinal()) {
			System.out.println(this.layout.getLayout(date, level.toUpperCase(), message));			
		}
	}

	@Override
	public void setReportLevel(ReportLevel level) {
		this.level = level;
	}

}
