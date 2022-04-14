package com.workersforyou.workersforyou.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.workersforyou.workersforyou.Services.UserLoginService;
import com.workersforyou.workersforyou.entities.UserLogin;

@RestController
@CrossOrigin(origins = "*")
public class UserLoginController {

	@Autowired
	private UserLoginService userloginservice;

	@PostMapping("/userlogin")
	public String loginGateway(@RequestBody UserLogin login) {
		if (userloginservice.validateUser(login)) {
			return "success";
		}
		return "errorPage";
	}

}























//		try {
//			if (userloginservice.findUserByemail(login.getEmail()) != null)
//			{
//				
//
//			} else {
//				System.err.println("User has entered invalid credentials. Redirecting to Login page...");
//				return "login";
//			}
//		} catch (ServiceException svcEx) {
//			svcEx.printStackTrace();
//		}
