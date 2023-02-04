package week5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String logString) {
		System.out.println("***" + logString + "***");
		
	}

	@Override
	public void Error(String errorString) {
		System.out.println("*************************");
		System.out.println("***" + "Error: " + errorString + "***");
		System.out.println("*************************");
		
	}

	
}
