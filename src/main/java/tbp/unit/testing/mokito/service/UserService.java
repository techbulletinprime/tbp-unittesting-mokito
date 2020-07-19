package tbp.unit.testing.mokito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tbp.unit.testing.mokito.dao.UserDao;

/**
 * @author rajan
 *
 */
@Service
public class UserService {
	@Autowired
	private UserDao userdao;

	public String getUseruserIdByName(String name) {
		System.out.print("UserService Called");
		return userdao.getUserId(name);
	}

}
