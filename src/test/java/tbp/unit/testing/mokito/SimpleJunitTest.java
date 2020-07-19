package tbp.unit.testing.mokito;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author rajan
 *
 */

public class SimpleJunitTest {
	@Test
	public void getIdTest() {
		// Create the Object and call the method
		assertEquals(1, 1);
	}

	@BeforeClass
	public static void init() {

	}

	@Before
	public void runBeforeEachTestMethod() {

	}

	@AfterClass
	public static void runAfterEachTestMethod() {

	}

	@After
	public void destroy() {

	}

}
