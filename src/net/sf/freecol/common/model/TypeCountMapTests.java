package net.sf.freecol.common.model;

import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.*;

public class TypeCountMapTests {
	TypeCountMap<GoodsType> map1;
	TypeCountMap<GoodsType> map2;
	GoodsType type1;
	GoodsType type2;
	GoodsType type3;
	
	@Before
	public void setUp() {
		map1 =  new TypeCountMap<GoodsType>();
		map2 =  new TypeCountMap<GoodsType>();
		type1 = new GoodsType("1", null);
		type2 = new GoodsType("2", null);
		type3 = new GoodsType("3", null);
	}
	
	
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
	
	@Test
	public void removeFromMap() {
		map1.incrementCount(type1, 2);
		assertEquals(2, map1.getCount(type1));
		map1.incrementCount(type1, -2);
		assertEquals(0, map1.getCount(type1));
	}
	
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
	
	@Test
	public void validateKeySet() {
		map1.incrementCount(type1, 1);
		map1.incrementCount(type2, 5);
		
		assertNotNull(map1.keySet());
	}

	@Test
	public void validateValues() {
		map1.incrementCount(type1, 1);
		map1.incrementCount(type2, 5);
		
		assertNotNull(map1.values());
	}
	

	@Test
	public void validateContainsKey() {
		map1.incrementCount(type1, 1);
		map1.incrementCount(type2, 5);
		
		assertTrue(map1.containsKey(type1));
		assertTrue(map1.containsKey(type2));
		assertFalse(map1.containsKey(type3));
	}
	
	@Test
	public void validateIsEmpty() {
		map1.incrementCount(type1, 1);
		
		assertFalse(map1.isEmpty());
		assertTrue(map2.isEmpty());
	}
	
	@Test
	public void validateSize() {
		map1.incrementCount(type1, 1);
		map1.incrementCount(type2, 5);
		
		assertEquals(2, map1.size());
	}
	
	@Test
	public void validateToString() {
		map1.incrementCount(type1, 1);
		map1.incrementCount(type2, 5);
		
		assertEquals("[net.sf.freecol.common.model.TypeCountMap [-1,1] [-1,5]]", map1.toString());
	}
	
	@After
	public void tearDown() {
	    map1 = null;
	    type1 = null;
	    type2 = null;
	}
}
