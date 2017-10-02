/**
 * 
 */
package org.escoladeltreball.oopintro1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw26540084
 *
 */
public class SquareTest {

	Square square;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		square = new Square(10);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		square = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Square#perimeter()}.
	 */
	@Test
	public final void testPerimeter() {
		assertEquals(100.0, square.perimeter(), 1.0e-4);
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Square#area()}.
	 */
	@Test
	public final void testArea() {
		assertEquals(50.0, square.area(), 1.0e-4);
	}

}
