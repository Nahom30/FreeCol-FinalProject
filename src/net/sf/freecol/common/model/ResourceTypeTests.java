/*
 * Author that created the test cases was Kevat.
 * Obed used javadoc tools to create documentation to test cases and added additional comments.
 * 
 */
package net.sf.freecol.common.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.stream.XMLStreamException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.sf.freecol.common.io.FreeColXMLWriter.WriteScope;

// TODO: Auto-generated Javadoc
/**
 * The class <code>ResourceTypeTests</code> contains tests for the class <code>{@link ResourceType.java}</code>.
 * @CommentsEditor Obed 
 * @author Kevat 
 * 
 * The Class ResourceTypeTests.
 */
public class ResourceTypeTests {
	
	/** The r type2. */
	ResourceType rType1, rType2;
	
	/** The stub xw. */
	StubXMLWriter stubXW;
	
	/** The stub xr. */
	StubXMLReader stubXR;
	
	/**
	 * Perform pre-test initialization.
	 * 
	 * Sets the setUp.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Before
	public void setUp() throws IOException {
		stubXW = new StubXMLWriter(new ByteArrayOutputStream(), WriteScope.CLIENT, false);
		stubXR = new StubXMLReader(new ByteArrayInputStream(new byte[0]));
		rType1 = new ResourceType("Resource1",null);
		rType2 = new ResourceType("Resource1",null);
	}

	/**
	 * Run the constructorTest() method test.  
	 * 
	 * Constructor test.
	 */
	@Test
	public void constructorTest() {
		assertNotNull(rType1);
		assertNotNull(rType2);
	}
	
	/**
	 * Run the getSetIndexTest() method test.
	 * 
	 * Gets the sets the index test.
	 *
	 * @return the sets the index test
	 */
	@Test
	public void getSetIndexTest(){
		rType1.setIndex(2);
		assertEquals(2, rType1.getIndex());
	}
	
	/**
	 * Run the getDescriptionTest() method test. 
	 * 
	 * Gets the description test.
	 *
	 * @return the description test
	 */
	@Test
	public void getDescriptionTest() {
		assertEquals("Resource1.description", rType1.getDescriptionKey());
	}
	

	/**
	 * Run the getTagNameTest() method test. 
	 * 
	 * Gets the tag name test.
	 *
	 * @return the tag name test
	 */
	@Test
	public void getTagNameTest() {
		assertEquals("resource-type", rType1.getXMLTagName());
		assertEquals("resource-type", ResourceType.getTagName());		
	}
	

	/**
	 * Run the maxValueInvalidTest() method test. 
	 * 
	 * Max value invalid test.
	 */
	@Test
	public void maxValueInvalidTest(){
		assertEquals(0,rType1.getMaxValue());
	}

	/**
	 * Run the minValueInvalidTest() method test. 
	 * 
	 * Min value invalid test.
	 */
	@Test
	public void minValueInvalidTest(){
		assertEquals(0,rType1.getMinValue());
	}
	
	/**
	 * Run the goodsTypeInvalidTest() method test. 
	 * 
	 * Goods type invalid test.
	 */
	@Test
	public void goodsTypeInvalidTest() {
		assertNull(rType1.getBestGoodsType());
	}

	/**
	 * Run the writeAttributeTests() method test. 
	 * 
	 * Write attribute tests.
	 *
	 * @throws XMLStreamException the XML stream exception
	 */
	@Test
	public void writeAttributeTests() throws XMLStreamException{
		rType1.writeAttributes(stubXW);
		assertEquals("id=Resource1;maximum-value=0;minimum-value=0;", stubXW.outputString);
	}
	
	/**
	 * Run the readAttributeTests() method test.
	 * 
	 * Read attribute tests.
	 *
	 * @throws XMLStreamException the XML stream exception
	 */
	@Test
	public void readAttributeTests() throws XMLStreamException{
		rType1.readAttributes(stubXR);
		assertEquals("id=null;ID=null;abstract=false;maximum-value=-1;minimum-value=-1;",stubXR.outputString);
	}
	
	/**
	 * Perform post-test clean-up. 
	 * 
	 * Tear down.
	 */
	//The following tests are used to make sure that default values are returned when the object is not set up correctly
	@After
	public void tearDown() {
		stubXW = null;
		rType1 = null;
		rType2 = null;
	}
}
