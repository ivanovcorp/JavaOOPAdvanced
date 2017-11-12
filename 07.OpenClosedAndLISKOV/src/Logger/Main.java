package Logger;

public class Main {
	
	public static void main(String[] args) {
		Layout simpleLayout = new SimpleLayout();
		Appender consoleAppender = new ConsoleAppender(simpleLayout);
		consoleAppender.setReportLevel(ReportLevel.CRITICAL);
		Logger logger = new MessageLogger(consoleAppender);
		logger.logInfo("11/12/2017 07:35 PM", "IVAN E PICH");
		logger.logCritical("11/12/2017 07:35 PM", "IVAN E PICH");
		logger.logFatal("11/12/2017 07:35 PM", "IVAN E PICH");
		logger.logWarning("11/12/2017 07:35 PM", "IVAN E PICH");
		logger.logError("11/12/2017 07:35 PM", "IVAN E PICH");
	}

}
