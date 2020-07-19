package tbp.unit.testing.mokito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import tbp.unit.testing.mokito.service.UserService;

/**
 * @author rajan
 *
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
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
