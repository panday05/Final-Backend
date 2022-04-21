package com.workersforyou.workersforyou.controllers;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.workersforyou.workersforyou.Services.UserService;
import com.workersforyou.workersforyou.entities.User;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService userservice;

	@Autowired
	public UserController(UserService userServices) {
		this.userservice = userServices;
	}

	@GetMapping("/user")
	public List<User> getUser() {
		return this.userservice.getUser();

	}

	@PostMapping("/user")
	public User addUser(@Valid @RequestBody User user,BindingResult result) {
		{
			try {
				if (userservice.findUserByemail(user.getEmail()) != null) {
					if (userservice.validateUser(user)) {
						System.err
								.println("Debug: Login Succeeded as user. Redirecting to JobSeeker Home page...");
						return user;
					}
				}
			} catch (ServiceException svcEx) {
				svcEx.printStackTrace();
			}

		}
		return this.userservice.addUser(user);
	}


	@DeleteMapping("/user/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable int id) {
		try {
			this.userservice.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
