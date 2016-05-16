/*
 * Author that created the test cases was Kevat.
 * Obed used javadoc tools to create documentation to test cases and added additional comments.
 * 
 */
package net.sf.freecol.common.model;

import junit.framework.TestCase;
import net.sf.freecol.client.FreeColClient;

import static org.junit.Assert.*;
import org.junit.*;

// TODO: Auto-generated Javadoc
/**
 * The class <code>EuropeWasTests.java</code> contains tests for the class <code>{@link EuropeWas.java}</code>
 * @CommentsEditor Obed
 * @author Kevat 
 * 
 * The Class EuropeWasTests.
 * 
 */
public class EuropeWasTests {
	
	/** The europe was1. */
	EuropeWas europeWas1; 
	
	/** The europe1. */
	Europe europe1;
	
	/** The game1. */
	Game game1;
	
	/** The player1. */
	Player player1;
	
	/**
	 * Perform pre-test initialization. 
	 * 
	 * Sets the setUp.
	 */
	@Before
	public void setUp() {
		game1 = new Game();
		player1 = new Player(game1);
		europe1 = new Europe(game1, player1);
		europeWas1 = new EuropeWas(europe1);
	}
	
	/**
	 * Run the constructorTest() method test. 
	 * 
	 * Constructor test.
	 */
	@Test
	public void constructorTest() {
		assertNotNull(europeWas1);
	}
	

	/**
	 * Run the newUnitTest() method test.
	 * 
	 * New unit test.
	 */
	@Test
	public void newUnitTest() {
		//europe1
		//europeWas1.getNewUnit();
	}
	
	/**
	 * Perform the post-test clean-up.
	 * 
	 * Tear down.
	 */
	@After
	public void tearDown() {
	
	}
}
