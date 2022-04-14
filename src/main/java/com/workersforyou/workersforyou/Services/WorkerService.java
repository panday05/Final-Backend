package com.workersforyou.workersforyou.Services;

import java.util.List;


import com.workersforyou.workersforyou.entities.Worker;

public interface WorkerService {

	public Worker addWorker(Worker worker);
	public Worker getWorker(int workerId);
	public List<Worker> getWorker();
	public Worker updateworker(Worker worker);
	public void delete(int workerId);

}
