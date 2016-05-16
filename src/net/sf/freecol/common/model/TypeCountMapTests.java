/*
 * Author that created the test cases was Kevat.
 * Obed used javadoc tools to create documentation to test cases and added additional comments. 
 */
package net.sf.freecol.common.model;

import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.*;

// TODO: Auto-generated Javadoc
/**
 * The class <code>TypeCountMapTests</code> contains test for the class <code> {@link TypeCountMap}</code>.
 * The Class TypeCountMapTests.
 *   
 * @CommentEditor: Obed
 * @author: Kevat
 * 
 */
public class TypeCountMapTests {
	
	/** The map1. */
	TypeCountMap<GoodsType> map1;
	
	/** The map2. */
	TypeCountMap<GoodsType> map2;
	
	/** The type1. */
	GoodsType type1;
	
	/** The type2. */
	GoodsType type2;
	
	/** The type3. */
	GoodsType type3;
	
	/**
	 * Perform pre-test initialization 
	 * 
	 * Sets the setup.
	 */
	@Before
	public void setUp() {
		map1 =  new TypeCountMap<GoodsType>();
		map2 =  new TypeCountMap<GoodsType>();
		type1 = new GoodsType("1", null);
		type2 = new GoodsType("2", null);
		type3 = new GoodsType("3", null);
	}
	
	
	/**
	 * Run the void addToMap() method test. 
	 * 
	 * Adds the to map.
	 * 
	 * 
	 */
	@Test
	public void addToMap() {
		
		map1.incrementCount(type1, 2);
		map1.incrementCount(type2, 5);
		map1.incrementCount(type2, 5);
		assertEquals(2, map1.getCount(type1));
		assertEquals(10, map1.getCount(type2));
		map1.incrementCount(type2, -3);
		assertEquals(7, map1.getCount(type2));
	}
	
	/**
	 * Run the void removeFromMap() method test.  
	 * 
	 * Removes the from map.
	 */
	@Test
	public void removeFromMap() {
		map1.incrementCount(type1, 2);
		assertEquals(2, map1.getCount(type1));
		map1.incrementCount(type1, -2);
		assertEquals(0, map1.getCount(type1));
	}
	
	/**
	 * Run the void addAnotherMap() method test.  
	 * Adds the another map.
	 */
	@Test
	public void addAnotherMap() {
		map1.incrementCount(type1, 1);
		map1.incrementCount(type2, 5);
		map2.incrementCount(type2, 5);
		map2.incrementCount(type3, 3);
		
		assertEquals(1, map1.getCount(type1));
		assertEquals(5, map1.getCount(type2));
		assertEquals(0, map1.getCount(type3));
		
		map1.add(map2);

		assertEquals(1, map1.getCount(type1));
		assertEquals(10, map1.getCount(type2));
		assertEquals(3, map1.getCount(type3));
	}


	/**
	 * Run the void clarMap() method test.  
	 * 
	 * Clear map.
	 */
	@Test
	public void clearMap() {
		map1.incrementCount(type1, 1);
		map1.incrementCount(type2, 5);

		assertEquals(1, map1.getCount(type1));
		assertEquals(5, map1.getCount(type2));
		
		map1.clear();

		assertEquals(0, map1.getCount(type1));
		assertEquals(0, map1.getCount(type2));		
	}
	
	/**
	 * Run the void validateKeySet() method test.  
	 * 
	 * Validate key set.
	 */
	@Test
	public void validateKeySet() {
		map1.incrementCount(type1, 1);
		map1.incrementCount(type2, 5);
		
		assertNotNull(map1.keySet());
	}

	/**
	 * Run the void validateValues() method test. 
	 * 
	 * Validate values.
	 */
	@Test
	public void validateValues() {
		map1.incrementCount(type1, 1);
		map1.incrementCount(type2, 5);
		
		assertNotNull(map1.values());
	}
	

	/**
	 * Run the void validateContainsKey() method test. 
	 * 
	 * Validate contains key.
	 */
	@Test
	public void validateContainsKey() {
		map1.incrementCount(type1, 1);
		map1.incrementCount(type2, 5);
		
		assertTrue(map1.containsKey(type1));
		assertTrue(map1.containsKey(type2));
		assertFalse(map1.containsKey(type3));
	}
	
	/**
	 * Run the void validateIsEmpty() method test. 
	 * 
	 * Validate is empty.
	 */
	@Test
	public void validateIsEmpty() {
		map1.incrementCount(type1, 1);
		
		assertFalse(map1.isEmpty());
		assertTrue(map2.isEmpty());
	}
	
	/**
	 * Run the void validateSize() method test. 
	 * 
	 * Validate size.
	 */
	@Test
	public void validateSize() {
		map1.incrementCount(type1, 1);
		map1.incrementCount(type2, 5);
		
		assertEquals(2, map1.size());
	}
	
	/**
	 * Run the void validateToString() method test. 
	 * 
	 * Validate to string.
	 */
	@Test
	public void validateToString() {
		map1.incrementCount(type1, 1);
		map1.incrementCount(type2, 5);
		
		assertEquals("[net.sf.freecol.common.model.TypeCountMap [-1,1] [-1,5]]", map1.toString());
	}
	
	/**
	 * Perform post-test clean-up 
	 * 
	 * Tear down.
	 */
	@After
	public void tearDown() {
	    map1 = null;
	    type1 = null;
	    type2 = null;
	}
}
