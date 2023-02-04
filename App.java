package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger AsteriskLogger =  new AsteriskLogger();
		AsteriskLogger.Log("Hello, this is the AsteriskLogger");
		AsteriskLogger.Error("Hello");
		
		Logger SpacedLogger = new SpacedLogger();
		SpacedLogger.Log("Hello, this is the SpacedLogger.");
		SpacedLogger.Error("SpacedLogger error");
		
		
		
	}

}
