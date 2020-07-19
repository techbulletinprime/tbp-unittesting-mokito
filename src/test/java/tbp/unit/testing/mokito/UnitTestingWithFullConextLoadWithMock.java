package tbp.unit.testing.mokito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import tbp.unit.testing.mokito.dao.UserDao;
import tbp.unit.testing.mokito.service.UserService;

/**
 * @author rajan
 *
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class UnitTestingWithFullConextLoadWithMock {
	@Autowired
	UserService service;

	@MockBean
	UserDao dao;


	@Test
	public void getUserIdTest() {
		when(dao.getUserId("Rajanikanta")).thenReturn("123445Rajanikanta");
		String id = service.getUseruserIdByName("Rajanikanta");
		assertEquals("123445Rajanikanta", id);

	}

}
