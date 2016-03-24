package valtech.germanTeam.bo;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestDie {
	/*
	 * checks if the die generates the right result 
	 */
	@Test
	public void testDie(){
		Die die = new Die();
	for(int i = 0;i<10; i++){
		assertTrue(die.generateValue()<7 && die.generateValue()>0);
	}
	}

}
