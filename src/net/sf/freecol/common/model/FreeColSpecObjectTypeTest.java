package net.sf.freecol.common.model;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

public class FreeColSpecObjectTypeTest {
	ResourceType rType1, rType2;
	StubXMLWriter stubXW;
	StubXMLReader stubXR;
	
	@Before
	public void setUp() throws IOException {
		stubXW = new StubXMLWriter(new ByteArrayOutputStream(), WriteScope.CLIENT, false);
		stubXR = new StubXMLReader(new ByteArrayInputStream(new byte[0]));
		rType1 = new ResourceType("Resource1",null);
		rType2 = new ResourceType("Resource1",null);
	}

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
		rType1.writeAttributes(stubXW);
		assertEquals("id=Resource1;maximum-value=0;minimum-value=0;", stubXW.outputString);
		rType1.readAttributes(stubXR);
		assertEquals("id=null;ID=null;abstract=false;maximum-value=-1;minimum-value=-1;",stubXR.outputString);
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
		stubXW = null;
		rType1 = null;
		rType2 = null;
	}
}
