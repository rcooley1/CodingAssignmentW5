package week5CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String logString) {
		StringBuilder logResult = new StringBuilder();
		for(int i = 0; i < logString.length(); i++) {
			logResult = logResult.append(logString.charAt(i));
			if (i == logString.length() - 1)
				break;
			logResult = logResult.append(" ");
		}
		System.out.println(logResult);
	}

	@Override
	public void Error(String errorString) {
		StringBuilder errorResult = new StringBuilder();
		for(int i = 0; i < errorString.length(); i++) {
			errorResult = errorResult.append(errorString.charAt(i));
			if (i == errorString.length()-1)
				break;
			errorResult = errorResult.append(" ");
			
		}
		System.out.println("ERROR: " + errorResult);
	}


}
