package com.cg.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class HelloWorldTest implements TestLifecycleLogger {
	
	
	@RepeatedTest(10)
	void Test() {
		System.out.println("first test case");
	}
	}
