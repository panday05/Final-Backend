package com.workersforyou.workersforyou.Services;

import java.util.List;

import org.hibernate.service.spi.ServiceException;

import com.workersforyou.workersforyou.entities.UserLogin;

public interface UserLoginService {
		boolean validateUser(UserLogin login) throws ServiceException;

		List<UserLogin> findAllUsers();
		UserLogin findUserByemail(String email) throws ServiceException;
}
