package net.sf.freecol.common.model;

import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.CharArrayWriter;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.io.FreeColXMLReader;
import java.util.Random;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NationTest</code> contains tests for the class <code>{@link Nation}</code>.
 *
 * @generatedBy CodePro at 5/13/16 6:51 PM
 * @author nahomnegash
 * @version $Revision: 1.0 $
 */
public class NationTest {
	/**
	 * Run the Nation(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testNation_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		Nation result = new Nation(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(null, result.getColor());
		assertEquals(false, result.isSelectable());
		assertEquals(true, result.startsOnEastCoast());
		assertEquals(false, result.isUnknownEnemy());
		assertEquals(null, result.getREFNation());
		assertEquals(null, result.getRebelNation());
		assertEquals(0, result.getPreferredLatitude());
		assertEquals(".ruler", result.getRulerNameKey());
		assertEquals(".ruler", result.getRulerName());
		assertEquals(null, result.forceDefaultColor());
		assertEquals("nation", result.getXMLTagName());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getId());
		assertEquals("<nation id=\"\" selectable=\"false\" preferred-latitude=\"0\" starts-on-east-coast=\"true\"></nation>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getGame());
	}

	/**
	 * Run the Color forceDefaultColor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testForceDefaultColor_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		Color result = fixture.forceDefaultColor();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Color getColor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testGetColor_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		Color result = fixture.getColor();

		// add additional test code here
		assertNotNull(result);
		assertEquals(255, result.getAlpha());
		assertEquals("java.awt.Color[r=0,g=0,b=1]", result.toString());
		assertEquals(1, result.getBlue());
		assertEquals(0, result.getGreen());
		assertEquals(0, result.getRed());
		assertEquals(-16777215, result.getRGB());
		assertEquals(1, result.getTransparency());
	}

	/**
	 * Run the int getPreferredLatitude() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testGetPreferredLatitude_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		int result = fixture.getPreferredLatitude();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Nation getREFNation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testGetREFNation_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		Nation result = fixture.getREFNation();

		// add additional test code here
		assertEquals(null, result);
	}

	
	/**
	 * Run the Nation getRebelNation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testGetRebelNation_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		Nation result = fixture.getRebelNation();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getRulerName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testGetRulerName_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		String result = fixture.getRulerName();

		// add additional test code here
		assertEquals(".ruler", result);
	}

	/**
	 * Run the String getRulerNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testGetRulerNameKey_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		String result = fixture.getRulerNameKey();

		// add additional test code here
		assertEquals(".ruler", result);
	}
	/**
	 * Run the String getRandomNonPlayerNationNameKey(Game,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testGetRandomNonPlayerNationNameKey_1()
		throws Exception {
		Game game = new Game();
		Random random = new Random();

		String result = Nation.getRandomNonPlayerNationNameKey(game, random);

		// add additional test code here
		assertEquals("model.nation.prussian.name", result);
	}

	/**
	 * Run the String getRandomNonPlayerNationNameKey(Game,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testGetRandomNonPlayerNationNameKey_2()
		throws Exception {
		Game game = new Game();
		Random random = new Random();

		String result = Nation.getRandomNonPlayerNationNameKey(game, random);

		// add additional test code here
		assertEquals("model.nation.spanish.name", result);
	}

	/**
	 * Run the String getRandomNonPlayerNationNameKey(Game,Random) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testGetRandomNonPlayerNationNameKey_3()
		throws Exception {
		Game game = new Game();
		Random random = new Random();

		String result = Nation.getRandomNonPlayerNationNameKey(game, random);

		// add additional test code here
		assertEquals("model.nation.dutch.name", result);
	}


	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = Nation.getTagName();

		// add additional test code here
		assertEquals("nation", result);
	}

	/**
	 * Run the NationType getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		NationType result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isREF());
		assertEquals(false, result.isIndian());
		assertEquals(true, result.isEuropean());
		assertEquals(null, result.getCapitalType());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(false, result.isAbstractType());
		assertEquals(".name", result.getNameKey());
		assertEquals("", result.getSuffix());
		assertEquals("", result.getId());
		assertEquals("<european-nation-type id=\"\" number-of-settlements=\"average\" aggression=\"average\" ref=\"false\"></european-nation-type>", result.serialize());
		assertEquals("european-nation-type", result.getXMLTagName());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getGame());
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("nation", result);
	}

	/**
	 * Run the boolean isSelectable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testIsSelectable_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		boolean result = fixture.isSelectable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isSelectable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testIsSelectable_2()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		boolean result = fixture.isSelectable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUnknownEnemy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testIsUnknownEnemy_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		boolean result = fixture.isUnknownEnemy();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUnknownEnemy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testIsUnknownEnemy_2()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		boolean result = fixture.isUnknownEnemy();

		// add additional test code here
		assertEquals(false, result);
	}

	

	/**
	 * Run the void setColor(Color) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testSetColor_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));
		Color color = new Color(1);

		fixture.setColor(color);

		// add additional test code here
	}

	/**
	 * Run the void setType(NationType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));
		NationType type = new EuropeanNationType("", new Specification());

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the boolean startsOnEastCoast() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testStartsOnEastCoast_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		boolean result = fixture.startsOnEastCoast();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean startsOnEastCoast() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test
	public void testStartsOnEastCoast_2()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));

		boolean result = fixture.startsOnEastCoast();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_8()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_9()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor(new Color(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_10()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor((Color) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_11()
		throws Exception {
		Nation fixture = new Nation("", new Specification());
		fixture.setType(new EuropeanNationType("", new Specification()));
		fixture.setColor((Color) null);
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/16 6:51 PM
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
	 * @generatedBy CodePro at 5/13/16 6:51 PM
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
	 * @generatedBy CodePro at 5/13/16 6:51 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NationTest.class);
	}
}