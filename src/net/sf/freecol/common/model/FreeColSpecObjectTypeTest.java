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

public class FreeColSpecObjectTypeTest {
	ResourceType rType1;
	StubXMLWriter stubXW;
	StubXMLReader stubXR;
	Specification spec;
	Ability ability1;
	Modifier mod1;
	
	private class CustomType extends FreeColSpecObjectType{
		public CustomType() {
			super();
		}
		
		public CustomType(Specification specIn){
			super(specIn);
		}
		
		public CustomType(String id){
			super(id);
		}
		
		@Override
		public String getXMLTagName() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	CustomType cType1;
	
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
	
	@Test 
	public void testConstructor1() {
		cType1 = new CustomType();
		assertNotNull(cType1);
	}
	
	@Test 
	public void testConstructor2() {
		cType1 = new CustomType(spec);
		assertNotNull(cType1);
	}
	
	@Test
	public void getSetIndexTests(){
		cType1.setIndex(10);
		assertEquals(10,cType1.getIndex());
	}
	
	@Test
	public void getDescriptionKeyTest(){
		assertEquals("CustomType1.description",cType1.getDescriptionKey());
	}
	
	@Test
	public void getFeatureContainerTest() {
		assertNotNull(cType1.getFeatureContainer());
	}
	
	@Test
	public void writeChildrenTest() throws XMLStreamException {
		cType1.addAbility(ability1);
		cType1.addModifier(mod1);
		//Set<Ability> test = cType1.getAbilities();
		cType1.writeChildren(stubXW);
		assertEquals("id=Ability1;id=Modifier1;index=0;", stubXW.outputString);
		cType1.readChildren(stubXR);
		String test;
	}
	
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
		cType1 = null;
		spec = null;
		ability1 = null;
	}
}
