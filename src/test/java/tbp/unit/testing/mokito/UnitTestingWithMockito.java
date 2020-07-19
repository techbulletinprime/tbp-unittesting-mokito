package tbp.unit.testing.mokito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import tbp.unit.testing.mokito.dao.UserDao;
import tbp.unit.testing.mokito.service.UserService;

/**
 * @author rajan
 *
 */

// if you are using junit 4
@ExtendWith(SpringExtension.class)
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
