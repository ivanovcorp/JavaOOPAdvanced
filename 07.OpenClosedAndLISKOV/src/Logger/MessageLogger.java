package Logger;

import java.util.ArrayList;
import java.util.List;

public class MessageLogger implements Logger {

	private List<Appender> appenders;
	
	public MessageLogger(Appender... appenders) {
		this.appenders = new ArrayList<>();
		
		for (Appender app : appenders) {
			this.appenders.add(app);
		}
	}
	
	@Override
	public void logInfo(String date, String message) {
		this.appenders.stream().forEach(x -> x.appendLog(date, "INFO", message));	
	}

	@Override
	public void logError(String date, String message) {
		this.appenders.stream().forEach(x -> x.appendLog(date, "ERROR", message));		
	}

	@Override
	public void logWarning(String date, String message) {
		this.appenders.stream().forEach(x -> x.appendLog(date, "WARNING", message));
		
	}

	@Override
	public void logCritical(String date, String message) {
		this.appenders.stream().forEach(x -> x.appendLog(date, "CRITICAL", message));
	}

	@Override
	public void logFatal(String date, String message) {
		this.appenders.stream().forEach(x -> x.appendLog(date, "FATAL", message));
	}

}
