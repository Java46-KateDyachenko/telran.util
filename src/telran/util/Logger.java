package telran.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
public class Logger implements Handler{

	final String zoneId = ZoneId.systemDefault().getId();
	Level level=Level.INFO;
	
	public void setLevel(Level level) {
		this.level = level;
	}

	Handler handler;
	String name;
	
	public Logger(Handler handler, String name) {
		this.handler = handler;
		this.name = name;
	} 
	
	@Override
	public void publish(LoggerRecord loggerRecord) {
		
		System.out.println(loggerRecord.level+" "+loggerRecord.message);

	
	}
	
	public void error(String message) {
    LoggerRecord loggerRecord = new LoggerRecord(zoneId, Instant.now(), Level.ERROR, "logger", message); 
		publish(loggerRecord);
	}
	
    public void warn(String message) {
    	LoggerRecord loggerRecord = new LoggerRecord(zoneId, Instant.now(), Level.WARN, "logger", message); 
		if (this.level!=Level.ERROR) {
    	publish(loggerRecord);
		}
	}
    public void info(String message) {
    	LoggerRecord loggerRecord = new LoggerRecord(zoneId, Instant.now(), Level.INFO, "logger", message); 
		if (this.level==Level.TRACE||this.level==Level.DEBUG ||this.level==Level. INFO)
    	publish(loggerRecord);
    }
    public void debug(String message) {
    	LoggerRecord loggerRecord = new LoggerRecord(zoneId, Instant.now(), Level.DEBUG, "logger", message); 
    	if (this.level==Level.TRACE||this.level==Level.DEBUG ) {
    	publish(loggerRecord);
    	}
    }
    public void trace(String message) {
    	LoggerRecord loggerRecord = new LoggerRecord(zoneId, Instant.now(), Level.TRACE, "logger", message); 
    	if (this.level==Level.TRACE) {
    	publish(loggerRecord);
    	}
    }
	
	
	
}
