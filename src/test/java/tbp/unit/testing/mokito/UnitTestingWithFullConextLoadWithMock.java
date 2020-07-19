package tbp.unit.testing.mokito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import tbp.unit.testing.mokito.dao.UserDao;
import tbp.unit.testing.mokito.service.UserService;

/**
 * @author rajan
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
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
