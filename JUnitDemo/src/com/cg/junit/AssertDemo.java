package com.cg.junit;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
@Disabled
public class AssertDemo {
	@Test
	public void simple() {
		int A =1;
		int B = 1;
		assertEquals(A,B);
	}
	@Test
	public void simple1() {
		int A =1;
		int B = 1;
		assertEquals(A,B);
	}
	@Test
	public void simple2() {
		int A =1;
		int B = 3;
		assertEquals(A,B);
	}
}
