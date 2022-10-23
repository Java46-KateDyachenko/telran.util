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
	public boolean publish(LoggerRecord loggerRecord) {
		switch(loggerRecord.level)  {
        case ERROR:  
        System.out.println(loggerRecord.message+" ERROR");
        break;
       case WARN: ;
       System.out.println(loggerRecord.message+" WARN");
        break;
       case INFO: ;
       System.out.println(loggerRecord.message+" INFO");
        break;
       case DEBUG: ;
       System.out.println(loggerRecord.message+" DEBUG");
        break;
       case TRACE: ;
       System.out.println(loggerRecord.message+" TRACE");
        break;
		}
		
		return false;
	}
	
	public void error(String message) {

		LoggerRecord loggerRecord = new LoggerRecord(zoneId, Instant.now(), Level.ERROR, "logger", message); 
		publish(loggerRecord);
	}
    public void warn(String message) {
    	LoggerRecord loggerRecord = new LoggerRecord(zoneId, Instant.now(), Level.WARN, "logger", message); 
		publish(loggerRecord);
	}
    public void info(String message) {
    	LoggerRecord loggerRecord = new LoggerRecord(zoneId, Instant.now(), Level.INFO, "logger", message); 
		publish(loggerRecord);
    }
    public void debug(String message) {
    	LoggerRecord loggerRecord = new LoggerRecord(zoneId, Instant.now(), Level.DEBUG, "logger", message); 
		publish(loggerRecord);
    }
    public void trace(String message) {
    	LoggerRecord loggerRecord = new LoggerRecord(zoneId, Instant.now(), Level.TRACE, "logger", message); 
		publish(loggerRecord);
    }
	
	
	
}
