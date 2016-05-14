package net.sf.freecol.common.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.sf.freecol.common.io.FreeColXMLWriter.WriteScope;

public class ResourceTypeTests {
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
	@After
	public void tearDown() {
		stubXW = null;
		rType1 = null;
		rType2 = null;
	}
}
