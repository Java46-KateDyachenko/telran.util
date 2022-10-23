package telran.util;

import telran.util.Level;
import java.time.Instant;

public class LoggerRecord {
	final public String zoneId;
	final public Instant timestamp;
	final public Level level;
	final public String loggerName;
	final public String message;
	
	public LoggerRecord(String zoneId, Instant timestamp, Level error, String loggerName, String message) {
		this.zoneId = zoneId;
		this.timestamp = timestamp;
		this.level = error;
		this.loggerName = loggerName;
		this.message = message;
	}
	
	
	

}
