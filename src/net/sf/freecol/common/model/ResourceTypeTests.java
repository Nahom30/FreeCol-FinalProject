package net.sf.freecol.common.model;

import junit.framework.TestCase;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.io.FreeColXMLWriter;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.stream.XMLStreamException;

import org.junit.*;

public class ResourceTypeTests {
	ResourceType rType1, rType2;
	
	@Before
	public void setUp() {
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
	public void goodsTypeInvalidTest(){
		assertNull(rType1.getBestGoodsType());
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
		
	}
}
