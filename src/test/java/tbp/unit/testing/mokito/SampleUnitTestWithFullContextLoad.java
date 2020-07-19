package tbp.unit.testing.mokito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tbp.unit.testing.mokito.service.UserService;

/**
 * @author rajan
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SampleUnitTestWithFullContextLoad {

	@Autowired
	UserService service;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getUserIdTest() {
		String id = service.getUseruserIdByName("Rajanikanta");
		assertEquals("123445Rajanikanta", id);

	}

}
