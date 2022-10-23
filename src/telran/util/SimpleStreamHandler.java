package telran.util;

import java.io.PrintStream;

public class SimpleStreamHandler implements Handler {
	
	public SimpleStreamHandler(PrintStream stream) {
		this.stream = stream;
	}
PrintStream stream;
	@Override
	public boolean publish(LoggerRecord loggerRecord) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
