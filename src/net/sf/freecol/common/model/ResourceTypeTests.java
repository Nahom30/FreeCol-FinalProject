package net.sf.freecol.common.model;

import junit.framework.TestCase;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.io.FreeColXMLWriter;
import net.sf.freecol.common.io.FreeColXMLWriter.WriteScope;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.io.FreeColXMLWriter;

public class ResourceTypeTests {
	ResourceType rType1, rType2;
	class testXMLWriter extends FreeColXMLWriter
	{
		public String outputString = "";
		
		public testXMLWriter(OutputStream outputStream, WriteScope scope, boolean indent) throws IOException {
			super(outputStream, scope, indent);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public void writeAttribute(String attributeName, int value) throws XMLStreamException {
	        outputString += attributeName + '=' + String.valueOf(value) + ';';
	    }
		
		@Override
		public void writeAttribute(String attributeName, String value) throws XMLStreamException {
	        outputString += attributeName + '=' + value + ';';
	    }
	}
	testXMLWriter testXW;
	
	class testXMLReader extends FreeColXMLReader{
		public String outputString = "";
		public testXMLReader(InputStream inputStream) throws IOException {
			super(inputStream);
			// TODO Auto-generated constructor stub
		}

	    public int getAttribute(String attributeName, int defaultValue) {
	    	outputString += attributeName + '=' + String.valueOf(defaultValue) + ';';
	    	return defaultValue;
	    }
	    
	    public String getAttribute(String attributeName, String defaultValue) {
	    	outputString += attributeName + '=' + defaultValue + ';';
	    	return defaultValue;
	    }

	    public boolean getAttribute(String attributeName, boolean defaultValue) {
	    	outputString += attributeName + '=' + String.valueOf(defaultValue) + ';';
	    	return defaultValue;
	    }
	}
	testXMLReader testXR;
	
	@Before
	public void setUp() throws IOException {
		testXW = new testXMLWriter(new ByteArrayOutputStream(), WriteScope.CLIENT, false);
		testXR = new testXMLReader(new ByteArrayInputStream(new byte[0]));
		rType1 = new ResourceType("Resource1",null);
		rType2 = new ResourceType("Resource1",null);
	}

	@Test
	public void constructorTest() {
		assertNotNull(rType1);
		assertNotNull(rType2);
	}
	
	@Test
	public void getSetIndexTest(){
		rType1.setIndex(2);
		assertEquals(2, rType1.getIndex());
	}
	
	@Test
	public void getDescriptionTest() {
		assertEquals("Resource1.description", rType1.getDescriptionKey());
	}
	

	@Test
	public void getTagNameTest() {
		assertEquals("resource-type", rType1.getXMLTagName());
		assertEquals("resource-type", ResourceType.getTagName());		
	}
	
	
	//The following tests are used to make sure that default values are returned when the object is not set up correctly
	@Test
	public void maxValueInvalidTest(){
		assertEquals(0,rType1.getMaxValue());
	}

	@Test
	public void minValueInvalidTest(){
		assertEquals(0,rType1.getMinValue());
	}
	
	@Test
	public void goodsTypeInvalidTest() throws XMLStreamException{
		assertNull(rType1.getBestGoodsType());
		rType1.writeAttributes(testXW);
		assertEquals("id=Resource1;maximum-value=0;minimum-value=0;", testXW.outputString);
		rType1.readAttributes(testXR);
		assertEquals("id=null;ID=null;abstract=false;maximum-value=-1;minimum-value=-1;",testXR.outputString);
	}
	
	//The following tests are related to methods defined in the abstract class FreeColSpecObjectType
	@Test
	public void isAbstractTypeTest(){
		assertFalse(rType1.isAbstractType());
	}
	
	@Test
	public void nameKeyTest(){
		assertEquals("Resource1.name", rType1.getNameKey());
	}

	@Test
	public void toStringTest(){
		assertEquals("Resource1", rType1.toString());
	}
		
	//The following tests are related to methods defined in the abstract class FreeColSpecObject
	@Test
	public void getIdTest(){
		assertEquals("Resource1", rType1.getId());
	}

	@Test
	public void specificationTest(){
		Specification sp1 = new Specification();
		rType1.setSpecification(sp1);
		assertEquals(sp1, rType1.getSpecification());
	}
	
	//The following tests are related to methods defined in the abstract class FreeColSpecObject
	
	@After
	public void tearDown() {
		testXW = null;
		rType1 = null;
		rType2 = null;
	}
}
