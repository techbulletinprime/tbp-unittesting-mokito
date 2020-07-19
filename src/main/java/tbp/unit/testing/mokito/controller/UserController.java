package tbp.unit.testing.mokito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tbp.unit.testing.mokito.service.UserService;

/**
 * @author rajan
 *
 */
@Controller
public class UserController {
	@Autowired
	private UserService service;

	@RequestMapping(value = "/v1/user.get", method = RequestMethod.GET, produces = "application/text")
	public ResponseEntity<String> getUserId(@RequestParam("userName") String useName) {
		String body = service.getUseruserIdByName(useName);
		return ResponseEntity.status(HttpStatus.OK).body(body);
	}

}
