package net.sf.freecol.common.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AbstractGoodsTest.class, EuropeWasTests.class,
		FreeColSpecObjectTypeTest.class, ModifierTest.class, NationTest.class,
		ResourceTypeTests.class, TypeCountMapTests.class, TurnTest.class,  })
public class AllTests {

}
