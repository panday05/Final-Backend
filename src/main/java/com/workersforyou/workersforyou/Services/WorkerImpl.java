package com.workersforyou.workersforyou.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workersforyou.workersforyou.DAO.WorkersDao;
import com.workersforyou.workersforyou.entities.Worker;

@Service
public class WorkerImpl implements WorkerService {

	@Autowired
	private WorkersDao workerdao;
	
	@Override
	public Worker addWorker(Worker worker) {
		workerdao.save(worker);
		return worker;
		
	}

	@Override
	public List<Worker> getWorker() {
		return workerdao.findAll();
	}

	@Override
	public void delete(int id) {
		Worker entity=workerdao.getOne(id);
		workerdao.delete(entity);
		
	}

	@Override
	public Worker getWorker(int workerId) {
		return workerdao.findById(workerId).get();
	}

	@Override
	public Worker updateworker(Worker worker) {
		workerdao.save(worker);
		return worker;
	}
	


	
}
