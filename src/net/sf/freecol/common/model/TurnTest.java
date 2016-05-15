package net.sf.freecol.common.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TurnTest</code> contains tests for the class <code>{@link Turn}</code>.
 *
 * @generatedBy CodePro at 5/15/16 1:26 AM
 * @author Obed Dominguez
 * @version $Revision: 1.0 $
 */
public class TurnTest {
	/**
	 * Run the Turn(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testTurn_1()
		throws Exception {
		int turn = 1;

		Turn result = new Turn(turn);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals(1, result.getNumber());
		assertNotEquals(1492, result.getYear());
		assertEquals(true, result.isFirstTurn());
		assertNotEquals(-1, result.getSeason());
		assertNotEquals("1492", result.getSaveGameSuffix());
		assertNotEquals(false, result.isFirstSeasonTurn());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Turn fixture = new Turn(1);
		Object o = new Turn(1);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Turn fixture = new Turn(1);
		Object o = new Turn(1);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Turn fixture = new Turn(1);
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the StringTemplate getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetLabel_1()
		throws Exception {
		Turn fixture = new Turn(1);

		StringTemplate result = fixture.getLabel();

		// add additional test code here
		assertNotNull(result);
		assertNotEquals("LABEL: NAME: model.season.spring.nameNAME:  NAME: 1", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertNotEquals("<stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\"model.season.spring.name\" templateType=\"name\"></stringTemplate><stringTemplate id=\" \" templateType=\"name\"></stringTemplate><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(null, result.getGame());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the StringTemplate getLabel(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetLabel_2()
		throws Exception {
		int turn = 1;

		StringTemplate result = Turn.getLabel(turn);

		// add additional test code here
		assertNotNull(result);
		assertNotEquals("LABEL: NAME: model.season.spring.nameNAME:  NAME: 1", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertNotEquals("<stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\"model.season.spring.name\" templateType=\"name\"></stringTemplate><stringTemplate id=\" \" templateType=\"name\"></stringTemplate><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(null, result.getGame());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the StringTemplate getLabel(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetLabel_3()
		throws Exception {
		int turn = 1;

		StringTemplate result = Turn.getLabel(turn);

		// add additional test code here
		assertNotNull(result);
		assertNotEquals("LABEL: NAME: model.season.spring.nameNAME:  NAME: 1", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getSpecification());
		assertNotEquals("<stringTemplate id=\"\" templateType=\"label\"><stringTemplate id=\"model.season.spring.name\" templateType=\"name\"></stringTemplate><stringTemplate id=\" \" templateType=\"name\"></stringTemplate><stringTemplate id=\"1\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(null, result.getGame());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the int getNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetNumber_1()
		throws Exception {
		Turn fixture = new Turn(1);

		int result = fixture.getNumber();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getSaveGameSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetSaveGameSuffix_1()
		throws Exception {
		Turn fixture = new Turn(1);

		String result = fixture.getSaveGameSuffix();

		// add additional test code here
		assertEquals("1_1_model.season.spring.name", result);
	}

	/**
	 * Run the String getSaveGameSuffix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetSaveGameSuffix_2()
		throws Exception {
		Turn fixture = new Turn(1);

		String result = fixture.getSaveGameSuffix();

		// add additional test code here
		assertEquals("1_1_model.season.spring.name", result);
	}

	/**
	 * Run the int getSeason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetSeason_1()
		throws Exception {
		Turn fixture = new Turn(1);

		int result = fixture.getSeason();

		// add additional test code here
		assertNotEquals(0, result);
	}

	/**
	 * Run the int getSeason(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetSeason_2()
		throws Exception {
		int turn = 1;

		int result = Turn.getSeason(turn);

		// add additional test code here
		assertNotEquals(0, result);
	}

	/**
	 * Run the int getSeason(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetSeason_3()
		throws Exception {
		int turn = 1;

		int result = Turn.getSeason(turn);

		// add additional test code here
		assertNotEquals(0, result);
	}

	/**
	 * Run the int getSeasonNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetSeasonNumber_1()
		throws Exception {

		int result = Turn.getSeasonNumber();

		// add additional test code here
		assertNotEquals(1, result);
	}

	/**
	 * Run the int getSeasonYear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetSeasonYear_1()
		throws Exception {

		int result = Turn.getSeasonYear();

		// add additional test code here
		assertNotEquals(1, result);
	}

	/**
	 * Run the int getStartingYear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetStartingYear_1()
		throws Exception {

		int result = Turn.getStartingYear();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getTurnsText(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetTurnsText_1()
		throws Exception {
		int turns = -1;

		String result = Turn.getTurnsText(turns);

		// add additional test code here
		assertEquals(">0", result);
	}

	/**
	 * Run the String getTurnsText(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetTurnsText_2()
		throws Exception {
		int turns = 1;

		String result = Turn.getTurnsText(turns);

		// add additional test code here
		assertEquals("1", result);
	}

	/**
	 * Run the String getTurnsText(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetTurnsText_3()
		throws Exception {
		int turns = Integer.MIN_VALUE;

		String result = Turn.getTurnsText(turns);

		// add additional test code here
		assertEquals("notApplicable", result);
	}

	/**
	 * Run the int getYear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetYear_1()
		throws Exception {
		Turn fixture = new Turn(1);

		int result = fixture.getYear();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getYear(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetYear_2()
		throws Exception {
		int turn = 1;

		int result = Turn.getYear(turn);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getYear(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testGetYear_3()
		throws Exception {
		int turn = 1;

		int result = Turn.getYear(turn);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Turn fixture = new Turn(1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void initialize(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		int newStartingYear = 1;
		int newSeasonYear = 1;
		int newSeasonNumber = 1;

		Turn.initialize(newStartingYear, newSeasonYear, newSeasonNumber);

		// add additional test code here
	}

	/**
	 * Run the boolean isFirstSeasonTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testIsFirstSeasonTurn_1()
		throws Exception {
		Turn fixture = new Turn(1);

		boolean result = fixture.isFirstSeasonTurn();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isFirstSeasonTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testIsFirstSeasonTurn_2()
		throws Exception {
		Turn fixture = new Turn(1);

		boolean result = fixture.isFirstSeasonTurn();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isFirstTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testIsFirstTurn_1()
		throws Exception {
		Turn fixture = new Turn(1);

		boolean result = fixture.isFirstTurn();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isFirstTurn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testIsFirstTurn_2()
		throws Exception {
		Turn fixture = new Turn(2);

		boolean result = fixture.isFirstTurn();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Turn next() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testNext_1()
		throws Exception {
		Turn fixture = new Turn(1);

		Turn result = fixture.next();

		// add additional test code here
		assertNotNull(result);
		assertEquals("2", result.toString());
		assertEquals(2, result.getNumber());
		assertEquals(2, result.getYear());
		assertEquals(false, result.isFirstTurn());
		assertEquals(0, result.getSeason());
		assertEquals("2_1_model.season.spring.name", result.getSaveGameSuffix());
		assertEquals(false, result.isFirstSeasonTurn());
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Turn fixture = new Turn(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("1", result);
	}

	/**
	 * Run the int yearToTurn(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testYearToTurn_1()
		throws Exception {
		int year = 1;

		int result = Turn.yearToTurn(year);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int yearToTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testYearToTurn_2()
		throws Exception {
		int year = 1600;
		int season = 1;

		int result = Turn.yearToTurn(year, season);

		// add additional test code here
		assertNotEquals(1601, result);
	}

	/**
	 * Run the int yearToTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testYearToTurn_3()
		throws Exception {
		int year = 1492;
		int season = 1;

		int result = Turn.yearToTurn(year, season);

		// add additional test code here
		assertNotEquals(1493, result);
	}

	/**
	 * Run the int yearToTurn(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Test
	public void testYearToTurn_4()
		throws Exception {
		int year = 1;
		int season = 1;

		int result = Turn.yearToTurn(year, season);

		// add additional test code here
		assertNotEquals(2, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/15/16 1:26 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TurnTest.class);
	}
}