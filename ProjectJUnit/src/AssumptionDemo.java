import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	@Test
	void testOnDrive() {
		System.setProperty("ENV","DEV");//Source
		Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
	}
	@Test
	void testOnProd() {
		System.setProperty("ENV","PROD");
		Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")),AssumptionDemo::message);
	}
	
	static String message() {
		return "Test Execution Failed";
	}
}
