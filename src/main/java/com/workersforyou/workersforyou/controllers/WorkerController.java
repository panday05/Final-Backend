package com.workersforyou.workersforyou.controllers;


import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.workersforyou.workersforyou.Services.WorkerService;
import com.workersforyou.workersforyou.entities.Worker;

@RestController
@CrossOrigin(origins = "*")
public class WorkerController {

	@Autowired(required = true)
	private WorkerService workerservice;

	

	@GetMapping("/worker")
	public List<Worker> getWorker() {
		return this.workerservice.getWorker();

	}
	
	@GetMapping("/worker/{workerId}")
	public Worker getWorker(@PathVariable String workerId) {
		return this.workerservice.getWorker(Integer.parseInt(workerId));
	}

	@PostMapping("/worker")
	public Worker addworker(@Valid @RequestBody Worker worker,BindingResult result) {
		return this.workerservice.addWorker(worker);
	}

	@DeleteMapping("/worker/{workerId}")
	//@CrossOrigin(origins = "*")
	public ResponseEntity<HttpStatus> delete(@PathVariable int workerId) {
		try {
			this.workerservice.delete(workerId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	@PutMapping("/worker")
	public Worker updateWorker(@RequestBody Worker worker) {
		return this.workerservice.updateworker(worker);
	}
}
