package valtech.germanTeam.bo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSpace {

	@Test
	public void testToString() {
		Space sp1 = new Space("1");
		String s = sp1.toString();
		
		assertEquals(s, "1");
	}
	
	@Test
	public void testSetNextSpace() {
		Space sp1 = new Space("1");
		Space sp2 = new Space("2");
		
		sp1.setNextSpace(sp2);
		
		String a = sp2.toString();
		String b = sp1.getNextSpace().toString();
		assertEquals(a,b);
	}

}
