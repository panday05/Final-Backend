package com.workersforyou.workersforyou.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workersforyou.workersforyou.DAO.UserLoginDao;
import com.workersforyou.workersforyou.entities.UserLogin;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserLoginDao loginDao;

	@Override
	public List<UserLogin> findAllUsers() {

		return loginDao.findAll();
	}

	@Override
	public UserLogin findUserByemail(String email) throws ServiceException {
		List<UserLogin> allUsers = findAllUsers();
		for (UserLogin login : allUsers) {
			if (login.getEmail().equals(email)) {
				return login;
			}
		}
		return null;
	}

	@Override
	public boolean validateUser(UserLogin login) throws ServiceException {
		UserLogin dbLoginCredentials = findUserByemail(login.getEmail());

		if (dbLoginCredentials != null) {
			if (login.getEmail().equals(dbLoginCredentials.getEmail())
					&& login.getPassword().equals(dbLoginCredentials.getPassword())) {
				return true;
			}
		}
		return false;
	}

}
