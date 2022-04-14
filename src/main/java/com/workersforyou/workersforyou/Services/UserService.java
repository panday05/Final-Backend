package com.workersforyou.workersforyou.Services;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;

import com.workersforyou.workersforyou.entities.User;
import com.workersforyou.workersforyou.entities.UserLogin;

public interface UserService {

	public User addUser(User user);

	public List<User> getUser();

	public void delete(int id);
	
	User findUserByemail(String email) throws ServiceException;
	
	boolean validateUser(User user) throws ServiceException;
}
