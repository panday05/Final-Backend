package com.workersforyou.workersforyou.Services;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workersforyou.workersforyou.DAO.WorkerLoginDao;
import com.workersforyou.workersforyou.entities.WorkerLogin;

@Service
public class WorkerLoginServicesImpl implements WorkerLoginService {

	@Autowired
	private WorkerLoginDao workerloginDao;

	@Override
	public List<WorkerLogin> findAllworker() {

		return workerloginDao.findAll();
	}

	@Override
	public WorkerLogin findUserByemail(String email) throws ServiceException {
		List<WorkerLogin> allworker = findAllworker();
		for (WorkerLogin login : allworker) {
			if (login.getEmail().equals(email)) {
				return login;
			}
		}
		return null;
	}

	@Override
	public boolean validateWorker(WorkerLogin login) throws ServiceException {
		WorkerLogin dbLoginCredentials = findUserByemail(login.getEmail());

		if (dbLoginCredentials != null) {
			if (login.getEmail().equals(dbLoginCredentials.getEmail())
					&& login.getPassword().equals(dbLoginCredentials.getPassword())) {
				return true;
			}
		}
		return false;
	}
}
