package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack() ;
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());

	}
	public void testPushToTop() {
		Stack s1 = new Stack() ;
		s1.push(1);
		int size = s1.getSize();
		
		assertEquals(1, s1.top());
		assertEquals(1, size);
	}
	public void lastInFirstOut() {
		Stack s1 = new Stack() ;
		s1.push(1);
		s1.pop();
		int size = s1.getSize();
		assertEquals(0, size);
		assertEquals(null, s1.top());
	}
	
	public void PushElmToLimitedSizeStack() {
		Stack s1 = new Stack(3) ;
		int size = s1.getSize();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		assertEquals(3, size);
		assertTrue(s1.isFull());
		
		
		
	}

}
