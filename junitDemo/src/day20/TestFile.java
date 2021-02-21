package day20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFile {

	MyLogic obj = new MyLogic();
	@Test
	void test1() {
		
		assertTrue(obj.checkAge(3));
	}


void test2() {
	
	assertFalse(obj.checkAge(30));
}

void test3() {
	
	assertEquals("eligible", obj.checkAge2(20));
}
}

