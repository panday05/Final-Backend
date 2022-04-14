package com.workersforyou.workersforyou.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workersforyou.workersforyou.Services.WorkerLoginService;
import com.workersforyou.workersforyou.entities.WorkerLogin;

@RestController
@CrossOrigin(origins = "*")
public class WorkerLoginController {

	@Autowired
	private WorkerLoginService workerloginservice;

	@PostMapping("/workerlogin")
	public String loginGateway(@RequestBody WorkerLogin login) {
			if (workerloginservice.validateWorker(login)) {
                 return "success";
			}
		return "errorPage"; 
	}

}