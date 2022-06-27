import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifecycleLogger {
	@BeforeAll
	default void beforeAllTests() {
		System.out.println("b4 all tests");
	}
	@AfterAll
default void afterAllTests() {
		System.out.println("a4 all test");
	}
	@Test
default void testMethod() {
	System.out.println("this is test method");
}

	
}
