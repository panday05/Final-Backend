package com.workersforyou.workersforyou.Services;

import java.util.List;

import org.hibernate.service.spi.ServiceException;

import com.workersforyou.workersforyou.entities.WorkerLogin;

public interface WorkerLoginService {

	boolean validateWorker(WorkerLogin login) throws ServiceException;

	List<WorkerLogin> findAllworker();
	WorkerLogin findUserByemail(String email) throws ServiceException;
}
