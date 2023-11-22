package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
		public void testCreateNewEmptyStack() {
			Stack s1 = new Stack();
			int size = s1.getSize();
			
			assertEquals(0, size);
			assertTrue(s1.isEmpty());
		}
		
		public void testPushElmToTop() {
			Stack s1 = new Stack();
			s1.push(1);
			int size = s1.getSize();
			
			assertEquals(1, size);
			boolean empty = s1.isEmpty();
			assertFalse(empty);
			}
		
		public void testPushDifferentElmTypeToStack() {
			Stack s1 = new Stack();
			try {
				s1.push(null);
				fail("Expected an IllegalArgumentException to be thrown");
			}catch (IllegalArgumentException e) {
				assertEquals("All elements the stack must be of the same type.", e.getMessage());
			}
			
			int size = s1.getSize();
			assertEquals(1, size);
			Integer topElement = s1.top();
			assertEquals(Integer.valueOf(1), topElement);
		}
}
