package com.workersforyou.workersforyou.Services;



import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workersforyou.workersforyou.DAO.UserDao;
import com.workersforyou.workersforyou.entities.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;
	
	@Override
	public User addUser(User user) {
		userdao.save(user);
		return user;
	}

	@Override
	public List<User> getUser() {
		return userdao.findAll();
	}

	@Override
	public void delete(int id) {
		User entity=userdao.getOne(id);
		userdao.delete(entity);
	}

	
	@Override
    public User findUserByemail(String email) throws ServiceException
    {
        List<User> allUsers = getUser();
        for(User login: allUsers) 
        {
        	if(login.getEmail().equals(email))
        	{
        		return login;
        	}
        }
        return null;
    }

	@Override
	public boolean validateUser(User login) throws ServiceException {
		User dbLoginCredentials = findUserByemail(login.getEmail());
		
				if (dbLoginCredentials != null) {
					if (login.getEmail().equals(dbLoginCredentials.getEmail())
							&& login.getPassword().equals(dbLoginCredentials.getPassword())) {
						return true;
					}
				}
		return false;
	}

	

}
