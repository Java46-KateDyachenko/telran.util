package telran.util;

import java.io.PrintStream;
import java.lang.System.Logger;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class SimpleStreamHandler implements Handler {
	
	private PrintStream stream;

	public SimpleStreamHandler(PrintStream stream) {
		this.stream = stream;
	}

	@Override
	public void publish(LoggerRecord loggerRecord) {
		stream.format("%s; %s; %s; %s", Instant.from(loggerRecord.timestamp.atZone(ZoneId.of( loggerRecord.zoneId))), loggerRecord.level, loggerRecord.loggerName,loggerRecord.message );
		
	}
	
 
}
