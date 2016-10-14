import static org.junit.Assert.*;

import org.junit.Test;

public class SandwitchTest {

	@Test
	public void test() {
		Sandwitch sandwitch = new Sandwitch();
		String testString = " ";
		assertTrue(testString.equals(sandwitch.getSandwitch("jajko")));
	}

}
