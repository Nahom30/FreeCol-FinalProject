/*
 * Author that created the test cases was Kevat.
 * Obed used javadoc tools to create documentation to test cases and added additional comments.
 */
package net.sf.freecol.common.model;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;

import javax.xml.stream.XMLStreamException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.sf.freecol.common.io.FreeColXMLWriter.WriteScope;
import net.sf.freecol.common.model.Modifier.ModifierType;

// TODO: Auto-generated Javadoc
/**
 * The class <code>FreeColSpecObjectTypeTest.java</code> contains tests for the class <code>{@link FreeColSpecObjectType.java}</code>.
 * @CommentsEditor Obed 
 * @author kevat 
 * 
 * The Class FreeColSpecObjectTypeTest.
 */
public class FreeColSpecObjectTypeTest {
	
	/** The r type1. */
	ResourceType rType1;
	
	/** The stub xw. */
	StubXMLWriter stubXW;
	
	/** The stub xr. */
	StubXMLReader stubXR;
	
	/** The spec. */
	Specification spec;
	
	/** The ability1. */
	Ability ability1;
	
	/** The mod1. */
	Modifier mod1;
	
	/**
	 * 
	 * The Class CustomType.
	 */
	private class CustomType extends FreeColSpecObjectType{
		
		/**
		 * Instantiates a new custom type.
		 */
		public CustomType() {
			super();
		}
		
		/**
		 * Instantiates a new custom type.
		 *
		 * @param specIn the spec in
		 */
		public CustomType(Specification specIn){
			super(specIn);
		}
		
		/**
		 * Instantiates a new custom type.
		 *
		 * @param id the id
		 */
		public CustomType(String id){
			super(id);
		}
		
		/* (non-Javadoc)
		 * @see net.sf.freecol.common.model.FreeColObject#getXMLTagName()
		 */
		@Override
		public String getXMLTagName() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	/** The c type1. */
	CustomType cType1;
	
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
		spec = new Specification();
		cType1 = new CustomType("CustomType1");
		ability1 = new Ability("Ability1");
		mod1 = new Modifier("Modifier1", 1, ModifierType.ADDITIVE);
	}
	
	/**
	 * Run the testConstructor1() method test. 
	 * 
	 * Test constructor1.
	 */
	@Test 
	public void testConstructor1() {
		cType1 = new CustomType();
		assertNotNull(cType1);
	}
	
	/**
	 * Run the testConstrutor2() method test.
	 * 
	 * Test constructor2.
	 */
	@Test 
	public void testConstructor2() {
		cType1 = new CustomType(spec);
		assertNotNull(cType1);
	}
	
	/**
	 * Run the getSetIndexTests() method test. 
	 * 
	 * Gets the sets the index tests.
	 *
	 * @return the sets the index tests
	 */
	@Test
	public void getSetIndexTests(){
		cType1.setIndex(10);
		assertEquals(10,cType1.getIndex());
	}
	
	/**
	 * Run the getDescriptionKeyTest() method test. 
	 * 
	 * Gets the description key test.
	 *
	 * @return the description key test
	 */
	@Test
	public void getDescriptionKeyTest(){
		assertEquals("CustomType1.description",cType1.getDescriptionKey());
	}
	
	/**
	 * Run the getFeatureContainerTest() method test.
	 * 
	 * Gets the feature container test.
	 *
	 * @return the feature container test
	 */
	@Test
	public void getFeatureContainerTest() {
		assertNotNull(cType1.getFeatureContainer());
	}
	
	/**
	 * Run the writeChildrenTest() method test.
	 * 
	 * Write children test.
	 *
	 * @throws XMLStreamException the XML stream exception
	 */
	@Test
	public void writeChildrenTest() throws XMLStreamException {
		cType1.addAbility(ability1);
		cType1.addModifier(mod1);
		//Set<Ability> test = cType1.getAbilities();
		cType1.writeChildren(stubXW);
		assertEquals("id=Ability1;id=Modifier1;index=0;", stubXW.outputString);		
	}
	
	/**
	 * Run the isAbstractTypeTest() method test.
	 * 
	 * Checks if is abstract type test.
	 */
	@Test
	public void isAbstractTypeTest(){
		assertFalse(rType1.isAbstractType());
	}
	
	/**
	 * Run the nameKeyTest() method test. 
	 * 
	 * Name key test.
	 */
	@Test
	public void nameKeyTest(){
		assertEquals("Resource1.name", rType1.getNameKey());
	}

	/**
	 * Run the toStrinTest() method test.
	 * 
	 * To string test.
	 */
	@Test
	public void toStringTest(){
		assertEquals("Resource1", rType1.toString());
	}
		
	/**
	 * Runt the getIdTest() method test.
	 * 
	 * Gets the id test.
	 *
	 * @return the id test
	 */
	//The following tests are related to methods defined in the abstract class FreeColSpecObject
	@Test
	public void getIdTest(){
		assertEquals("Resource1", rType1.getId());
	}

	/**
	 * Run the specificationTest() method test.
	 * 
	 * Specification test.
	 */
	@Test
	public void specificationTest(){
		Specification sp1 = new Specification();
		rType1.setSpecification(sp1);
		assertEquals(sp1, rType1.getSpecification());
	}
	
	/**
	 * Perform post-test clean-up. 
	 * 
	 * Tear down.
	 */
	//The following tests are related to methods defined in the abstract class FreeColSpecObject
	@After
	public void tearDown() {
		stubXW = null;
		rType1 = null;
		cType1 = null;
		spec = null;
		ability1 = null;
	}
}
