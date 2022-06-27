import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class HelloWorldTest implements TestLifecycleLogger {
	
	@RepeatedTest(10)
	void test() {
		System.out.println("test case passedd");
	}
}
