package tbp.unit.testing.mokito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import tbp.unit.testing.mokito.dao.UserDao;
import tbp.unit.testing.mokito.service.UserService;

/**
 * @author rajan
 *
 */

@RunWith(SpringRunner.class) // if you are using junit 4
public class UnitTestingWithMockito {

	@InjectMocks
	UserService service;
	@Mock
	UserDao dao;

	@Test
	public void getUserIdTest() {
		when(dao.getUserId("Rajanikanta")).thenReturn("123445Rajanikanta");
		String id = service.getUseruserIdByName("Rajanikanta");
		assertEquals("123445Rajanikanta", id);

	}

}
