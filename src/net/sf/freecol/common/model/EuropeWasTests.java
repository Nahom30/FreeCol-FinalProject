package net.sf.freecol.common.model;

import junit.framework.TestCase;
import net.sf.freecol.client.FreeColClient;

import static org.junit.Assert.*;
import org.junit.*;

public class EuropeWasTests {
	EuropeWas europeWas1; 
	Europe europe1;
	Game game1;
	Player player1;
	
	@Before
	public void setUp() {
		game1 = new Game();
		player1 = new Player(game1);
		europe1 = new Europe(game1, player1);
		europeWas1 = new EuropeWas(europe1);
	}
	
	@Test
	public void constructorTest() {
		assertNotNull(europeWas1);
	}
	

	@Test
	public void newUnitTest() {
		//europe1
		//europeWas1.getNewUnit();
	}
	
	@After
	public void tearDown() {
	
	}
}
