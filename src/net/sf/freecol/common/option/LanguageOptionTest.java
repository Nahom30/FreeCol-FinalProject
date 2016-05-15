package net.sf.freecol.common.option;

import java.io.CharArrayWriter;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.io.Writer;
import java.util.List;
import java.util.Locale;
import org.junit.*;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>LanguageOptionTest</code> contains tests for the class <code>{@link LanguageOption}</code>.
 *
 * @generatedBy CodePro at 5/14/16 10:44 PM
 * @author nahomnegash
 * @version $Revision: 1.0 $
 */
public class LanguageOptionTest {
	/**
	 * Run the LanguageOption(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testLanguageOption_1()
		throws Exception {
		Specification specification = new Specification();

		LanguageOption result = new LanguageOption(specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the LanguageOption clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testClone_1()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;

		LanguageOption result = fixture.clone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the List<LanguageOption.Language> getChoices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testGetChoices_1()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;

		List<LanguageOption.Language> result = fixture.getChoices();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = LanguageOption.getTagName();

		// add additional test code here
		assertEquals("languageOption", result);
	}

	/**
	 * Run the LanguageOption.Language getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;

		LanguageOption.Language result = fixture.getValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the void setValue(Language) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		LanguageOption.Language newValue = new LanguageOption.Language("", Locale.getDefault());

		fixture.setValue(newValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(Language) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		LanguageOption.Language newValue = new LanguageOption.Language("", Locale.getDefault());

		fixture.setValue(newValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_4()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_5()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_6()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = null;
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_7()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = null;

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_8()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = null;

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_9()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = null;
		String defaultValueString = null;

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_10()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_11()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_12()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = null;
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_13()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_14()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_15()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = null;
		String defaultValueString = "";

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_16()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = null;

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_17()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = "";
		String defaultValueString = null;

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void setValue(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testSetValue_18()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		String valueString = null;
		String defaultValueString = null;

		fixture.setValue(valueString, defaultValueString);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		LanguageOption fixture = new LanguageOption(new Specification());
		fixture.setValue(new LanguageOption.Language("", Locale.getDefault()));
		fixture.isDefined = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new CharArrayWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No language files could be found in the <data/strings> directory.
		//       at net.sf.freecol.common.option.LanguageOption.initializeLanguages(LanguageOption.java:198)
		//       at net.sf.freecol.common.option.LanguageOption.<init>(LanguageOption.java:186)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 10:44 PM
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
	 * @generatedBy CodePro at 5/14/16 10:44 PM
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
	 * @generatedBy CodePro at 5/14/16 10:44 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LanguageOptionTest.class);
	}
}